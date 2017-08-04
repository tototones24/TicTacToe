import java.util.*;
import java.util.Scanner;

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

    public void newGame() {

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
        }
        //checking up right
        if (r - 2 >= 0 && c + 2 <= _n) {
            if (grid[r - 1][c + 1] == grid[r][c] && grid[r - 2][c + 2] == grid[r][c]) {
                return true;
            }
        }        
        //checking up left
        if (r - 2 >= 0 && c - 2 <= _n) {
            if (grid[r - 1][c - 1] == grid[r][c] && grid[r - 2][c - 2] == grid[r][c]) {
                return true;
            }
        }
        //checking down right
        if (r + 2 <= _n && c + 2 <= _n) {
            if (grid[r + 1][c + 1] == grid[r][c] && grid[r + 2][c + 2] == grid[r][c]) {
                return true;
            }
        }

        //checking down left
        if (r + 2 <= _n && c - 2 >= 0) {
            if (grid[r + 1][c - 1] == grid[r][c] && grid[r + 2][c - 2] == grid[r][c]) {
                return true;
            }
        }
        
        return false;
    }



    public static void main(String[] args) {
        // Tictactoe game = new Tictactoe();

        // game.gridView();
        // game.add(1, 1, 1);
        // game.gridView();
        Tictactoe game = new Tictactoe();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Player 1 choose a row");
        int row = sc.nextInt();
        System.out.println("Player 1 now choose a column");
        int col = sc.nextInt();
        System.out.println(roll);



    }
    


}
