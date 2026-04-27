func longestConsecutive(nums []int) int {
	set := make(map[int]struct{})

	for _, num := range nums {
		set[num] = struct{}{}
	}

	maxLen := 0

	for num := range set {
		if _, exists := set[num-1]; !exists {
			current := num
			count := 1

			for {
				if _, ok := set[current+1]; !ok {
					break
				}
				current++
				count++
			}

			if count > maxLen {
				maxLen = count
			}
		}
	}

	return maxLen
}