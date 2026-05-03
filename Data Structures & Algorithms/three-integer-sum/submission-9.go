func threeSum(nums []int) [][]int {
    res := [][]int{}
    sort.Ints(nums)
    for r := 0; r < len(nums); r++{
        if r > 0 && nums[r] == nums[r-1]{
            continue
        }
        left := r + 1
        right := len(nums) -1
        for left < right{
            sum:= nums[r] + nums[left] + nums[right]
           if sum == 0 {
                res = append(res, []int{nums[r], nums[left], nums[right]}) 
                for left < right && nums[left] == nums[left+1] {
                    left++
                }
                for left < right && nums[right] == nums[right-1] {
                    right--
                }
                left++
                right--
            } else if sum < 0{
                left++
            }else{
                right--
            }
        }
    }
    return res
}
