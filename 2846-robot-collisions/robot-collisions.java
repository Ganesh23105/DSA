import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

        // Step 1: Create robots array
        int[][] robots = new int[n][4]; // pos, health, dir, index

        for (int i = 0; i < n; i++) {
            robots[i][0] = positions[i];
            robots[i][1] = healths[i];
            robots[i][2] = directions.charAt(i); // 'R' or 'L'
            robots[i][3] = i;
        }

        // Step 2: Sort by position
        Arrays.sort(robots, (a, b) -> a[0] - b[0]);

        Stack<int[]> stack = new Stack<>();

        for (int[] robot : robots) {
            if (robot[2] == 'R') {
                stack.push(robot);
            } else {
                // Left moving robot
                while (!stack.isEmpty() && stack.peek()[2] == 'R') {
                    int[] top = stack.peek();

                    if (top[1] > robot[1]) {
                        top[1]--; // R survives
                        robot[1] = 0;
                        break;
                    } else if (top[1] < robot[1]) {
                        robot[1]--; // L survives
                        stack.pop();
                    } else {
                        // equal
                        stack.pop();
                        robot[1] = 0;
                        break;
                    }
                }

                if (robot[1] > 0) {
                    stack.push(robot);
                }
            }
        }

        // Step 4: Collect survivors
        int[] result = new int[n];
        Arrays.fill(result, -1);

        while (!stack.isEmpty()) {
            int[] r = stack.pop();
            result[r[3]] = r[1];
        }

        // Step 5: Return in original order
        List<Integer> ans = new ArrayList<>();
        for (int x : result) {
            if (x != -1) ans.add(x);
        }

        return ans;
    }
}