func hasDuplicate(nums []int) bool {
    hashset := make(map[int]struct{})
    for i:= 0; i< len(nums);i++{
        _,b := hashset[nums[i]]
        if b {
            return true
        } 
        hashset[nums[i]] = struct{}{}
    }
    return false
}
