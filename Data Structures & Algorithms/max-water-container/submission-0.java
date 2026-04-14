class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxwater = 0;
        while(left < right)
        {
            if(heights[left] > heights[right])
            {
                int width = right - left;
                maxwater = Math.max(maxwater,width * heights[right]);
                right--;
            }
            else
            {
                int width = right - left;
                maxwater = Math.max(maxwater,width*heights[left]);
                left++;
            }
        }
        return maxwater;
    }
}
