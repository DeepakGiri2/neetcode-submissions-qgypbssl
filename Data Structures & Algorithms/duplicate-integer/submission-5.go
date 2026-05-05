func hasDuplicate(nums []int) bool {
    set:= make(map[int]struct{})
    for _, v := range nums{
        _,there := set[v]
        if there{
            return true
        }
        set[v] = struct{}{}
    }
    return false
}
