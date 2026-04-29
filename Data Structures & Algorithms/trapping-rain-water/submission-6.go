func trap(height []int) int {
	left,right,water,leftmax,rightmax :=0,len(height) -1,0,0,0
	for left < right{
		if height[left] < height[right]{
			if leftmax <= height[left]{
				leftmax = height[left]
			}else{
				water += leftmax - height[left]
			}
			left++
		}else{
			if rightmax <= height[right]{
				rightmax = height[right]
			}else{
				water += rightmax - height[right]
			}
			right--
		}
	}
	return water
}
