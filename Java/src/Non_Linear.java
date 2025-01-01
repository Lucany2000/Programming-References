import java.util.*;
import java.util.stream.Collectors;

public class Non_Linear {

        //backtracking: attempts every single possible combination using recursion
        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();
            if (digits == null || digits.isEmpty()) {
                return res;
            }

            // Mapping of digits to letters
            String[] mapping = {
                    "",     // 0
                    "",     // 1
                    "abc",  // 2
                    "def",  // 3
                    "ghi",  // 4
                    "jkl",  // 5
                    "mno",  // 6
                    "pqrs", // 7
                    "tuv",  // 8
                    "wxyz"  // 9
            };

            // Start DFS
            dfs(digits, mapping, res, 0, new StringBuilder());
            return res;
        }

        //dfs: depth-first search: later
        private void dfs(String digits, String[] mapping, List<String> res, int index, StringBuilder path) {
            if (index == digits.length()) {
                // If we've used all digits, add the combination to the result
                res.add(path.toString());
                return;
            }

            // Get the letters corresponding to the current digit
            String letters = mapping[digits.charAt(index) - '0'];

            for (char letter : letters.toCharArray()) {
                path.append(letter);            // Add the letter to the current path
                dfs(digits, mapping, res, index + 1, path); // Recurse for the next digit
                path.deleteCharAt(path.length() - 1); // Backtrack by removing the last character
            }
        }

        //Greedy: finding the most optimal path to reach a target
        //minimum number of coins to reach target
        static int minCoins(int[] coins, int target) {
            int n = coins.length;
            Arrays.sort(coins);
            int res = 0;

            // Start from the coin with highest denomination
            for (int i = n - 1; i >= 0; i--) {
                if (target >= coins[i]) {

                    // Find the maximum number of ith coin we can use
                    int cnt = (target / coins[i]);

                    // Add the count to result
                    res += cnt;

                    // Subtract the corresponding amount from
                    // the total amount
                    target -= (cnt * coins[i]);
                }

                // Break if there is no amount left
                if (target == 0)
                    break;
            }
            return res;
        }

        //Greedy Version that has limited supply [number of boxes, units per box]
        static int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

            int totalUnits = 0;

            // Iterate through the sorted box types
            for (int[] box : boxTypes) {
                int boxCount = box[0];  // number of boxes
                int boxUnits = box[1];  // number of units in each box

                // Take as many boxes as we can, while respecting the truck size
                int boxesToTake = Math.min(boxCount, truckSize);
                totalUnits += boxesToTake * boxUnits;
                truckSize -= boxesToTake;  // reduce the truck size

                // If the truck is full, stop
                if (truckSize == 0) {
                    break;
                }
            }

            return totalUnits;
        }

        //Priority queue (min-heap): automatically sorts by asc order
        static PriorityQueue<Integer> findKLargest(int[] nums, int k) {
            // Min-heap to store the k largest elements
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int num : nums) {
                // Add the current number to the heap
                minHeap.offer(num);

                // If the heap size exceeds k, remove the smallest element
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }

            return minHeap; // Contains the K largest elements
        }

        //Dynamic Programming
        //top-down: big -> small using Backtracking + Memoization: saving previous function call result in dictionary
                                                          //and reading from it when you do the exact same call again
        static void numDecodings(String s) {
            // Memoization map to store results of subproblems
            HashMap<Integer, Integer> memo = new HashMap<>();
            System.out.println(decodeWaysHelperTopDown(s, 0, memo));

        }

        // Helper function to recursively decode the string using memoization
        private static int decodeWaysHelperTopDown(String s, int index, HashMap<Integer, Integer> memo) {
            // Base case: if we reach the end of the string, there's one valid way to decode
            if (index == s.length()) {
                return 1;
            }

            // If the current index is invalid (leading zero), return 0
            if (s.charAt(index) == '0') {
                return 0;
            }

            // Check if we've already computed the result for this subproblem
            if (memo.containsKey(index)) {
                return memo.get(index);
            }

            // Step 1: Decode the single character at index
            int result = decodeWaysHelperTopDown(s, index + 1, memo);

            // Step 2: Decode the two characters starting from index (if valid)
            if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
                result += decodeWaysHelperTopDown(s, index + 2, memo);
            }

            // Memoize the result for the current index
            memo.put(index, result);

            return result;
        }

        //bottom-up: small -> big using tables
        static int decodeWaysHelperBottomUp(String s) {
            if (s == null || s.length() == 0) {
                return 0; // No string to decode
            }

            int n = s.length();
            int[] dp = new int[n + 1];  // dp[i] means the number of ways to decode s[0..i-1]

            dp[0] = 1;  // Base case: empty string
            dp[1] = s.charAt(0) == '0' ? 0 : 1;  // If first character is not '0', there's 1 way to decode it

            for (int i = 2; i <= n; i++) {
                // Check if the current character is a valid single digit (1-9)
                if (s.charAt(i - 1) != '0') {
                    dp[i] += dp[i - 1];
                }

                // Check if the previous character and the current character form a valid number (10-26)
                int twoDigit = Integer.parseInt(s.substring(i - 2, i));
                if (twoDigit >= 10 && twoDigit <= 26) {
                    dp[i] += dp[i - 2];
                }
            }

            return dp[n];
        }
}
