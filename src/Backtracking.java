  import java.util.*;

  class Main {
      public static void main(String[] args) {
          boolean[][] board = {
              {true, true, true},
              {true, true, true},
              {true, true, true}
          };

          // allpath("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allpathprint("",board, 0, 0,1,path);
      }

      static int count(int r, int c) {
          if (r == 1 || c == 1) {
              return 1;
          }

          int left = count(r - 1, c);
          int right = count(r, c - 1);

          return left + right;
      }

      static void path(String p, int r, int c) {
          if (r == 1 && c == 1) {
              System.out.println(p);
              return;
          }

          if (r > 1) {
              path(p + "D", r - 1, c);
          }
          if (c > 1) {
              path(p + "R", r, c - 1);
          }
      }

      static void diagonalpath(String p, int r, int c) {
          if (r == 1 && c == 1) {
              System.out.println(p);
              return;
          }

          if (r > 1 && c > 1) {
              diagonalpath(p + "D", r - 1, c - 1);
          }
          if (r > 1) {
              diagonalpath(p + "V", r - 1, c);
          }
          if (c > 1) {
              diagonalpath(p + "H", r, c - 1);
          }
      }

      static void pathwithrestrictions(String p, boolean[][] maze, int r, int c) {
          if (r == maze.length - 1 && c == maze[0].length - 1) {
              System.out.println(p);
              return;
          }

          if (!maze[r][c]) {
              return;
          }

          if (r < maze.length - 1) {
              pathwithrestrictions(p + "D", maze, r + 1, c);
          }
          if (c < maze[0].length - 1) {
              pathwithrestrictions(p + "R", maze, r, c + 1);
          }
      }

    static void allpath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allpath(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allpath(p + "R", maze, r, c + 1);
        }
        if (r > 0) { 
            allpath(p + "U", maze, r - 1, c); 
        }

        maze[r][c] = true;
     
    }

    static void allpathprint(String p, boolean[][] maze, int r, int c ,int step , int[][] path) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
          path[r][c] =step;
           for(int[] arr :path){
             System.out.println(Arrays.toString(arr));
           }
          
          System.out.println(p);
          System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
         path[r][c] =step;

        if (r < maze.length - 1) {
              allpathprint(p + "D", maze, r + 1, c, step+1 ,  path);
        }
        if (c < maze[0].length - 1) {
              allpathprint(p + "R", maze, r, c + 1, step+1 , path);
        }
        if (r > 0) { 
          allpathprint(p + "U", maze, r - 1, c, step+1 ,  path); 
        }

        maze[r][c] = true;
      path[r][c] =0;
    }
  }
