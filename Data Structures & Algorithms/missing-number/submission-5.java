class Solution {
    public int missingNumber(int[] nums) {
        int clean = 0;
        int last = nums.length;
        for(int i =0 ;i <= last; i++)
        {
            clean ^= i;
        }
        for(int i : nums)
        {
            clean ^= i;
        }
        return clean;
    }
}
