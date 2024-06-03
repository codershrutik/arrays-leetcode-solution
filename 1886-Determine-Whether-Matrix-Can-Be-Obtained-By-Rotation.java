//Link to problem - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int n = mat.length;
        for(int i=0;i<4;i++){
            if(isEquals(mat, target)){
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    private boolean isEquals(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] rotate90(int[][] mat){
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
}