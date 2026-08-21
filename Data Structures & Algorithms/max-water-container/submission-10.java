class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int waterArea = 0;
        while(left < right)
        {
            if(heights[left] < heights[right])
            {
				int area = heights[left] * (right - left);
                waterArea = waterArea > area ? waterArea : area;
                left++;
            }
            else
            {
				int area = heights[right] * (right - left);
              	waterArea = waterArea > area ? waterArea : area;
                right--;
            }
        }
        return waterArea;
    }
}
