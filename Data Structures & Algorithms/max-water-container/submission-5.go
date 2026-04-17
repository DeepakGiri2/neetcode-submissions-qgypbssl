func maxArea(heights []int) int {
	l := 0
	r := len(heights) - 1
	var maxArea int
	for r != l {
		area := min(heights[l], heights[r]) * (r-l)
		if maxArea < area {
			maxArea = area
		}

		if heights[l] < heights[r] {
			l += 1
		}else{
			r -= 1
		}
	}
	return maxArea
}