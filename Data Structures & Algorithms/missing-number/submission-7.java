class Solution {
    public int missingNumber(int[] nums) {
        int last = nums.length;
        int clean = last;
        for(int i =0 ;i < last; i++)
        {
            clean ^= i ^ nums[i];
        }
        return clean;
    }
}
