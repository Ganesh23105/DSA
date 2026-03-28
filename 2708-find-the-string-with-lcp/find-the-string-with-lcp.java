class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;

        // Step 1: DSU (Union-Find)
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (lcp[i][j] > 0) {
                    union(parent, i, j);
                }
            }
        }

        // Step 2: Assign characters
        char[] res = new char[n];
        char ch = 'a';
        int[] groupChar = new int[n]; // root -> char

        for (int i = 0; i < n; i++) {
            int root = find(parent, i);
            if (groupChar[root] == 0) {
                if (ch > 'z') return "";
                groupChar[root] = ch++;
            }
            res[i] = (char) groupChar[root];
        }

        // Step 3: Validate LCP
        int[][] dp = new int[n + 1][n + 1];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (res[i] == res[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = 0;
                }

                if (dp[i][j] != lcp[i][j]) {
                    return "";
                }
            }
        }

        return new String(res);
    }

    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    private void union(int[] parent, int a, int b) {
        int pa = find(parent, a);
        int pb = find(parent, b);
        if (pa != pb) {
            parent[pa] = pb;
        }
    }
}