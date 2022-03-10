class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i <= n; i ++){
            int num = i & (i - 1);
            int b = ans[num] + 1;
            ans[i] = b;
        }
        return ans;
    }
}