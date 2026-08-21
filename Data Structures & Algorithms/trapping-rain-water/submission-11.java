class Solution {
    public int trap(int[] height) {
      int left =0;
	  int leftMax=0;
	  int right = height.length -1;
	  int rightmax = right;
	  int water = 0;
	  while(left <= right)
	  {
		if(height[left] < height[right])
		{
			if(height[leftMax] <= height[left])
			{
				leftMax = left;
			}
			else
			{
				water += height[leftMax] - height[left];
			}
			left++;
		}else{
			if(height[rightmax] <= height[right])
			{
				rightmax = right;
			}
			else
			{
				water += height[rightmax] - height[right];
			}
			right--;
		}
	  }
	  return water;
    }
}
