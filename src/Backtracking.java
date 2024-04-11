import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3); 
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


     static void diagonalpath(String p, int r, int c){
     if(r==1 && c==1){
       System.out.println(p);
       return;
     }

     if(r>1 && c>1){
       diagonalpath(p+"D",r-1,c-1);
     }
     if(r>1){
       diagonalpath(p+"V",r-1,c);
     }
     if(c>1){
       diagonalpath(p+"H",r,c-1);
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


    // ALl path
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
}
