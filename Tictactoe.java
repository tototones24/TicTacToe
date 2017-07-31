import java.util.*;

public class Tictactoe {

    public int[][] grid;



    public Tictactoe() {
        grid = new int[3][3];
    }

    public Tictactoe(int n) {
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

    public boolean hasWon(int row, int col) {
        //checking the top
        if (r - 2 >= 0) {
            if (grid[r - 1][c] == grid[r][c] && grid[r - 2][c] == grid[r][c]) {
                return true;
            }
        }
        //checking the right
    }



    public static void main(String[] args) {
        Tictactoe game = new Tictactoe();

        game.gridView();
        game.add(1, 1, 1);
        game.gridView();

    }
    


}
