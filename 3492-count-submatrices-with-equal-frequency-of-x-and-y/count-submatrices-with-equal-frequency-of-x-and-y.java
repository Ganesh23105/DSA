class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] xPrefix = new int[m][n];
        int[][] yPrefix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int x = (grid[i][j] == 'X') ? 1 : 0;
                int y = (grid[i][j] == 'Y') ? 1 : 0;

                if (i > 0) {
                    x += xPrefix[i - 1][j];
                    y += yPrefix[i - 1][j];
                }
                if (j > 0) {
                    x += xPrefix[i][j - 1];
                    y += yPrefix[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    x -= xPrefix[i - 1][j - 1];
                    y -= yPrefix[i - 1][j - 1];
                }

                xPrefix[i][j] = x;
                yPrefix[i][j] = y;
            }
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int x = xPrefix[i][j];
                int y = yPrefix[i][j];

                if (x == y && x > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}