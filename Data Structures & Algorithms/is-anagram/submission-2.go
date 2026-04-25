func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
        return false
    }
	i := [26]int{}
	for _,ch :=  range s{
		i[ch - 'a']++
	}
	for _,ch :=  range t{
		i[ch - 'a']--
	}
	for _,in:= range i{
		if in != 0{
			return false
		}
	}
	return true
}
