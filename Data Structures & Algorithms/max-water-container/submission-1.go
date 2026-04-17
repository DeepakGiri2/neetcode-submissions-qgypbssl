func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}

func maxArea(heights []int) int {
    left := 0
    right := len(heights) -1;
    maxwater:=0
    for(left < right){
        if heights[left] > heights[right]{
            water := (right - left) * heights[right]
            right--
            maxwater = max(maxwater,water)
        }else{
            water := (right - left) * heights[left]
            left++
            maxwater = max(maxwater,water)
        }
    }
    return maxwater
}
