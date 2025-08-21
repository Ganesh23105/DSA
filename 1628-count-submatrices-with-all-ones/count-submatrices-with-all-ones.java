class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] heights = new int[n][m];
        int total = 0;

        // Step 1: Build heights matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    heights[i][j] = 0;
                } else {
                    if (i == 0) {
                        heights[i][j] = 1;  // first row, only itself
                    } else {
                        heights[i][j] = heights[i - 1][j] + 1;  // add from above
                    }
                }
            }
        }

        // Step 2: Count submatrices row by row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (heights[i][j] > 0) {
                    int minHeight = heights[i][j];
                    // Look leftwards
                    for (int k = j; k >= 0; k--) {
                        if (heights[i][k] == 0) {
                            break;
                        }
                        minHeight = Math.min(minHeight, heights[i][k]);
                        total += minHeight;
                    }
                }
            }
        }

        return total;
    }
}
