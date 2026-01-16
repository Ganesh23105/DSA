class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> result) {

        // Base case: target achieved
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try all candidates starting from index
        for (int i = index; i < candidates.length; i++) {

            // If candidate is greater than remaining target, skip
            if (candidates[i] > target) continue;

            // Choose
            current.add(candidates[i]);

            // Not i+1 because same number can be reused
            backtrack(candidates, target - candidates[i], i, current, result);

            // Undo choice (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
