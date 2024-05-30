//Link to problem - https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/
class Solution {
    public boolean checkXMatrix(int[][] grid) {

        int n = grid.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    if(grid[i][j] == 0){
                        return false;
                    }
                } else if( i + j == n-1){
                    if(grid[i][j] == 0){
                        return false;
                    }
                } else{
                    if(grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }    
        return true;
    
    }
}