class Solution {

    int MOD = 1000000007;
    long[][][][] dp;

    public int numberOfStableArrays(int zero, int one, int limit) {

        dp = new long[zero + 1][one + 1][2][limit + 1];

        for(int i=0;i<=zero;i++){
            for(int j=0;j<=one;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<=limit;l++){
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }

        long ans = 0;

        if (zero > 0)
            ans = (ans + solve(zero - 1, one, 0, 1, limit)) % MOD;

        if (one > 0)
            ans = (ans + solve(zero, one - 1, 1, 1, limit)) % MOD;

        return (int) ans;
    }

    long solve(int zero, int one, int last, int count, int limit) {

        if (zero == 0 && one == 0)
            return 1;

        if (dp[zero][one][last][count] != -1)
            return dp[zero][one][last][count];

        long ans = 0;

        if (zero > 0) {

            if (last == 0) {
                if (count < limit)
                    ans = (ans + solve(zero - 1, one, 0, count + 1, limit)) % MOD;
            } 
            else {
                ans = (ans + solve(zero - 1, one, 0, 1, limit)) % MOD;
            }
        }

        if (one > 0) {

            if (last == 1) {
                if (count < limit)
                    ans = (ans + solve(zero, one - 1, 1, count + 1, limit)) % MOD;
            } 
            else {
                ans = (ans + solve(zero, one - 1, 1, 1, limit)) % MOD;
            }
        }

        return dp[zero][one][last][count] = ans;
    }
}