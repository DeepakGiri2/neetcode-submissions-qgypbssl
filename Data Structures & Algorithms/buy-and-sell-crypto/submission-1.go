func maxProfit(prices []int) int {
	lowset := prices[0]
	maxpro := 0
	for i :=0; i < len(prices); i++{
		if lowset >= prices[i]{
			lowset = prices[i]
		}
		maxpro = max(prices[i] - lowset,maxpro)
	}
	return maxpro
}
