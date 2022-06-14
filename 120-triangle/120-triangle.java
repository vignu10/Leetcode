class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return f(triangle,0,0,dp);
    }
    
    public int f(List<List<Integer>> t,int i,int j,int[][] dp){
        if(t.size()==i)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int d=t.get(i).get(j)+f(t,i+1,j,dp);
        int r=t.get(i).get(j)+f(t,i+1,j+1,dp);
        return dp[i][j]=Math.min(d,r);
    }
}