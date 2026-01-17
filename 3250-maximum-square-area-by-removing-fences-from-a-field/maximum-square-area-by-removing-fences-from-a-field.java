class Solution {
    private static final int MOD = 1_000_000_007;
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
                // Step 1: Add boundary fences
        List<Integer> h = new ArrayList<>();
        List<Integer> v = new ArrayList<>();

        h.add(1);
        h.add(m);
        for (int x : hFences) h.add(x);

        v.add(1);
        v.add(n);
        for (int x : vFences) v.add(x);

        Collections.sort(h);
        Collections.sort(v);

        // Step 2: Get all possible horizontal distances
        Set<Integer> hDist = new HashSet<>();
        for (int i = 0; i < h.size(); i++) {
            for (int j = i + 1; j < h.size(); j++) {
                hDist.add(h.get(j) - h.get(i));
            }
        }

        // Step 3: Find maximum matching vertical distance
        int maxSide = 0;
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                int dist = v.get(j) - v.get(i);
                if (hDist.contains(dist)) {
                    maxSide = Math.max(maxSide, dist);
                }
            }
        }

        if (maxSide == 0) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
        
    }
}