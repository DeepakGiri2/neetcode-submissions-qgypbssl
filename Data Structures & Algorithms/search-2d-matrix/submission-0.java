class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetrow = -1;
        for(int i =0; i< matrix.length; i++)
        {
            int bounds = matrix[i].length - 1;
            if(matrix[i][bounds] >= target)
            {
                targetrow = i;
                break;
            }
        }
        if(targetrow == -1) return false;
        int left = 0;
        int rigth = matrix[targetrow].length -1;
        while(left <= rigth)
        {
            int mid = left + (rigth - left) / 2;
            if(matrix[targetrow][mid] == target)
            {
                return true;
            }
            if(matrix[targetrow][mid] < target)
            {
                left = mid+1;
            }
            else
            {
                rigth = mid-1;
            }
        }
        return false;
    }
}
