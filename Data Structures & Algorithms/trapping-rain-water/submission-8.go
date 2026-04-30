func trap(height []int) int {
	water := 0
	left, right := 0, 1
	for right < len(height) - 1 {
		for right < len(height) - 1 && height[right] < height[left] {
			right++
		}

		if right == len(height) - 1 && height[right] < height[left] {
			break
		}

		for middle:=left+1;middle<right;middle++{
			mn := min(height[left], height[right]) - height[middle]
			if mn > 0 {
				water += mn
			}
		}
		left = right
		right++
	}

	left, right = len(height) - 2, len(height) - 1
	for left >= 0 {
		for left > 0 && height[left] <= height[right] {
			left--
		}

		if height[left] <= height[right] && left == 0 {
			break
		}

		for middle:=right-1;middle>left;middle--{
			mn := min(height[left], height[right]) - height[middle]
			if mn > 0 {
				water += mn
			}
		}
		right = left
		left--
	}

	return water
}