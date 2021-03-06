//Andriy Zasyppkin
//2016-03-18
//Practice 2011 - 05: Robot in a Maze

import java.util.*;

public class Main {
  public static boolean goalNear(int k, int l, int[][] map) {
    if(l+1 < map[k].length && map[k][l+1] == -1)
      return true;
    if(l-1 >= 0 && map[k][l-1] == -1)
      return true;
    if(k+1 < map.length && map[k+1][l] == -1)
      return true;
    if(k-1 >= 0 && map[k-1][l] == -1)
      return true;
    return false;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nCases = scan.nextInt(); scan.nextLine();

    case_loop:
    for(int i=0; i<nCases; i++) {
      int H = scan.nextInt();
      int W = scan.nextInt(); scan.nextLine();

      int[][] map = new int[H][W];
      for(int[] row : map) {
        int j = 0;
        char[] line = scan.nextLine().toCharArray();
        for(char c : line) {
          if(c == 'S') {
            row[j] = 1;
          }
          else if(c == 'X') {
            row[j] = -2;
          }
          else if(c == 'G') {
            row[j] = -1;
          }
          else {
            row[j] = 0;
          }
          j++;
        }
      }
      int j = 0;
      do {
        j = 0;
        for(int k=0; k<map.length; k++) {
          for(int l=0; l<map[k].length; l++) {
            if(map[k][l] > 0) {
              if(l+1 < map[k].length && map[k][l+1] == 0) {
                map[k][l+1] = map[k][l]+1;
                j++;
              }
              if(l-1 >= 0 && map[k][l-1] == 0) {
                map[k][l-1] = map[k][l]+1;
                j++;
              }
              if(k+1 < map.length && map[k+1][l] == 0) {
                map[k+1][l] = map[k][l]+1;
                j++;
              }
              if(k-1 >= 0 && map[k-1][l] == 0) {
                map[k-1][l] = map[k][l]+1;
                j++;
              }
            }
            if(map[k][l] > 0 && goalNear(k,l,map)) {
              System.out.println("Shortest Path: "+map[k][l]);
              continue case_loop;
            }
          }
        }
      } while(j > 0);
      System.out.println("No Exit");
    }

    System.exit(0);
  }
}
