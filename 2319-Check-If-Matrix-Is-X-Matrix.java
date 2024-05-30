//Link to problem - https://leetcode.com/problems/check-if-matrix-is-x-matrix/description/
class Solution {
    public boolean checkXMatrix(int[][] grid) {

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i == j){
                    if(grid[i][j] == 0){
                        return false;
                    }
                } else{
                    if(grid[i][j] == 0){
                        return true;
                    }
                }
            }
        }
        return true;
        
    }
}