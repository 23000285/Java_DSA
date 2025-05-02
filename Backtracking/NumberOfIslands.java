package Backtracking;

// Rules: Top,Bottom,Left,right accepted. Diagonal not accepted

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // Loop through every cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j, rows, cols);
                    count++; // one island found
                }
            }
        }

        return count;
    }

    // DFS to mark connected lands
    private void dfs(char[][] grid, int i, int j, int rows, int cols) {
        // Boundary or water check
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        // Mark this cell as visited
        grid[i][j] = '0';

        // DULR: Down, Up, Left, Right
        dfs(grid, i + 1, j, rows, cols); // Down
        dfs(grid, i - 1, j, rows, cols); // Up
        dfs(grid, i, j - 1, rows, cols); // Left
        dfs(grid, i, j + 1, rows, cols); // Right
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        NumberOfIslands obj = new NumberOfIslands();
        int result = obj.numIslands(grid);
        System.out.println("Number of Islands: " + result);
    }
}


