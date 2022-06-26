// Idea:
// Since we're forced to take K amount of cards no matter what, we can solve this problem with a two-pointer system with a sliding window approach. Instead of counting the sum of the values between the two pointers, we'll instead be counting the sum of the values outside the sliding window.

// We can start by iterating through the first K cards of our card list (C) and finding the total points. At this point, our reverse window will be the cards from i = K to j = C.length - 1. At each iteration, we'll slide the window backwards, removing one card from the left side (-C[i]) and adding one card from the right side (+C[j]) each time.

// We should keep track of the best possible result at each iteration, then return best once we reach the end.

// Visual 1

// Time Complexity: O(K)
// Space Complexity: O(1)


class Solution {
    public int maxScore(int[] C, int K) {
        int total = 0;
        for (int i = 0; i < K; i++) total += C[i];
        int best = total;
        for (int i = K - 1, j = C.length - 1; i >= 0; i--, j--) {
            total += C[j] - C[i];
            best = Math.max(best, total);
        }
        return best;
    }
}