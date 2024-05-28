//Link to problem - https://leetcode.com/problems/flipping-an-image/description/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int rows = image.length;
        int col = image[0].length;

        int[][] flip = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                flip[i][j] = image[i][col-1-j];
            }
        }

        int[][] result = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(flip[i][j] == 0){
                    result[i][j] = 1;
                } else{
                    result[i][j] = 0;
                }
            }
        }
    return result;
    }
}
