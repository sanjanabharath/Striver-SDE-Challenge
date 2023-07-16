//https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length-1;
        while(i < matrix.length && j>=0){
            if(target>matrix[i][j]){
                i++;
            }else if(target<matrix[i][j]){
                j--;
            }else{
                return true;
            }
        }

        return false;
    }
}
