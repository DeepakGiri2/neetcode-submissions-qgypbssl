class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1,right =0;
        for(int p : piles)
        {
            right = Math.max(p,right);
        }
        int res = right;
        while(left <= right)
        {
            int mid  = left + (right - left) / 2;
            long hrs = 0;
            for(int p : piles)
            {
                hrs += (p + mid -1) / mid;
            }
            if(hrs <= h)
            {
                res = mid;
                right = mid -1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return res;
    }
}
