//Link to problem - https://leetcode.com/problems/matrix-diagonal-sum/description/
class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int m = n-1;
        int sum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(i == j || i+j == n-1){
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }
}