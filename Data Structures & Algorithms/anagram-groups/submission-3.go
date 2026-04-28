func groupAnagrams(strs []string) [][]string {
m := make(map[string][]string)

	for _, s := range strs {
		var count [26]int

		for _, c := range s {
			count[c-'a']++
		}

		key := fmt.Sprint(count) 
		m[key] = append(m[key], s)
	}

	res := make([][]string, 0, len(m))
	for _, v := range m {
		res = append(res, v)
	}

	return res
}
