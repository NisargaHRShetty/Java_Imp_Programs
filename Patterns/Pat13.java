/*
          * 
        *   * 
      *       * 
    *           * 
  * * * * * * * * * 
*/

import java.util.Scanner;

class Pat13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Size");
    int n = sc.nextInt();

    for(int i = 1; i<=n ;i++){
        for(int j=i ; j<=n ; j++){
                System.out.print("  ");
        }
        for(int j=1 ; j<i ; j++){
              if(i==n || j==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
        }
        for(int j=1 ; j<=i ; j++){
            if(i==n || j==i){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    }
}

