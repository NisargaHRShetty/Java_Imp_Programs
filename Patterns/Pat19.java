/*

** 
* *  
***
* *  
* *  

*/

import java.util.Scanner;

public class Pat19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Size");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 1 && j <= 2) {
                    System.out.print("*");
                } else if (i == 3) {
                    System.out.print("*");
                } else if (j == 1 || j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
