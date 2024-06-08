package PatternPrinting.SQUARE.SpecialPattern2;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Odd N : ");
        int n = sc.nextInt();
        int m = (n+1)/2;
      for (int i = 1; i <= n; i++){
          for (int j = 1; j <= n; j++){
              if (i == m || j == m)
                  System.out.print("* ");
              else System.out.print(" "+" ");
          }
          System.out.println();
      }
    }
}
