import java.util.*;

public class Tictactoe {

    public int _n = 3;

    public int[][] grid;



    public Tictactoe() {
        grid = new int[3][3];
    }

    public Tictactoe(int n) {
        _n = n;
        grid = new int[n][n];
    }

    public void add(int row, int col, int value) {
        if (grid[row][col] == 0) {
            grid[row][col] = value;
        }
    }

    public void gridView() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean hasWon(int r, int c) {
        //checking the top
        if (r - 2 >= 0) {
            if (grid[r - 1][c] == grid[r][c] && grid[r - 2][c] == grid[r][c]) {
                return true;
            }
        }
        //checking the bottom
        if (r + 2 < _n) {
            if (grid[r + 1][c] == grid[r][c] && grid[r + 2][c] == grid[r][c]) {
                return true;
            }
        }
        //checking the left
         if (c - 2 >= 0 ) {
            if (grid[r][c - 1] == grid[r][c] && grid[r][c - 2] == grid[r][c]) {
                return true;
            }
        }
        

        //checking the right
         if (c + 2 <= _n) {
            if (grid[r][c + 1] == grid[r][c] && grid[r][c + 2] == grid[r][c]) {
                return true;
            }
3
        }


        
        //checking up right
        

        if (grid[r - 1][c + 1] == grid[r][c] && grid[r - 2][c + 2] == grid[r][c]) {
            return true;
        }

        //checking up left
        if (grid[r - 1][c - 1] == grid[r][c] && grid[r - 2][c - 2] == grid[r][c]) {
            return true;
        }

        //checking down right
        if (grid[r + 1][c + 1] == grid[r][c] && grid[r + 2][c + 2] == grid[r][c]) {
            return true;
        }

        //checking down left
        if (grid[r + 1][c - 1] == grid[r][c] && grid[r + 2][c - 2] == grid[r][c]) {
            return true;
        }



    }



    public static void main(String[] args) {
        Tictactoe game = new Tictactoe();

        game.gridView();
        game.add(1, 1, 1);
        game.gridView();

    }
    


}
