class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k - 1 + maxPts) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;

        double windowSum = 1.0; // sum of dp[j] for j in the last maxPts positions AND j < k
        double result = 0.0;    // sum of dp[i] for i >= k (final states) up to n

        for (int i = 1; i <= n; i++) {
            // Probability to reach i is the average of eligible previous dp's
            dp[i] = windowSum / maxPts;

            if (i < k) {
                // From i we can still draw in future turns, so include it in the window
                windowSum += dp[i];
            } else {
                // i is a stopping total; collect it into the answer
                result += dp[i];
            }

            // Slide the window left by dropping dp[i - maxPts] IF that index was eligible (i - maxPts < k)
            int out = i - maxPts;
            if (out >= 0 && out < k) {
                windowSum -= dp[out];
            }
        }

        return result;

        
    }
}