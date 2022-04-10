class Solution {
    public int numIslands(char[][] grid) {
        
        // perform dfs element by element while keeping track of visited elements
        // increment the count accordingly
        
        int m = grid.length;
        int n = grid[0].length;
        
        int island_count = 0;
        
        boolean[][] visited = new boolean[m][n];
        
        for(int i =  0; i < m; i++){
            for(int j =  0; j < n; j++){
                if(!visited[i][j] && grid[i][j] != '0'){
                    dfs(grid, i, j, visited);
                    island_count++;
                }
                
            }
        }
        
        return island_count;
        
    }
    
    static void dfs(char[][] grid, int row, int col, boolean[][] visited){
        
        // check bounds
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] || grid[row][col] == '0' ) return;
        
        
        visited[row][col] = true;
        
        dfs(grid, row - 1, col, visited);
        dfs(grid, row + 1, col, visited);
        dfs(grid, row, col  + 1, visited);
        dfs(grid, row, col - 1, visited);

        return;
        
       
        
    }
}