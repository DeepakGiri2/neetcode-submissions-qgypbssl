func maxArea(heights []int) int {
    left := 0
    right := len(heights) -1
    most :=0
    for left < right{
        if heights[left] < heights[right]{
            water := (right - left) * heights[left]
            most = max(most,water)
            left++ 
        }else{
            water := (right - left) * heights[right]
            most = max(most,water)
            right-- 
        }
    }
    return most
}
