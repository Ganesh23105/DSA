class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;
        int mod = 12345;

        // Step 1: Convert 2D -> 1D
        long[] arr = new long[size];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[idx++] = grid[i][j];
            }
        }

        // Step 2: Prefix product
        long[] prefix = new long[size];
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            prefix[i] = (prefix[i - 1] * arr[i - 1]) % mod;
        }

        // Step 3: Suffix product
        long[] suffix = new long[size];
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] * arr[i + 1]) % mod;
        }

        // Step 4: Build result
        int[][] result = new int[n][m];
        idx = 0;
        for (int i = 0; i < size; i++) {
            long val = (prefix[i] * suffix[i]) % mod;
            result[idx / m][idx % m] = (int) val;
            idx++;
        }

        return result;
    }
}