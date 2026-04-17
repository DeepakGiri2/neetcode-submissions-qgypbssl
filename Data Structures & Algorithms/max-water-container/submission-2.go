func maxArea(heights []int) int {
    left := 0
    right := len(heights) -1;
    maxwater:=0
    for(left < right){
        if heights[left] > heights[right]{
            water := (right - left) * heights[right]
            right--
            if water > maxwater{
                maxwater = water
            }
        }else{
            water := (right - left) * heights[left]
            left++
            if water > maxwater{
                maxwater = water
            }
        }
    }
    return maxwater
}
