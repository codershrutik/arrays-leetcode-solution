//Link to problem - https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];

        // Update row and column increment counts
        for (int[] index : indices) {
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }

        int oddCount = 0;

        // Calculate the number of odd-valued cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // The value at cell (i, j) is the sum of rowCounts[i] and colCounts[j]
                int cellValue = rowCounts[i] + colCounts[j];
                if (cellValue % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
