func twoSum(nums []int, target int) []int {
    Map := make(map[int]int)
    for i,v := range nums{
        a,b := Map[target - v]
        if b {
            return []int{a, i}
        }
        Map[v] = i
    }
    return []int{}
}
