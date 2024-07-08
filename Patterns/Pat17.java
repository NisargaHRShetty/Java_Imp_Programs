/*


******** 
        *
       * *
      *   *
     *     *
    *       *
   *         *
  *           *
 *             *
 

*/

import java.util.Scanner;

class Pat17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Size");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.print("*");
    }
    System.out.println(" ");

    for(int i = 1; i<=n ;i++){
        for(int j=i ; j<=n ; j++){
                System.out.print(" ");
        }
        for(int j=1 ; j<i ; j++){
              if(j==1){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
        }
        for(int j=1 ; j<=i ; j++){
            if( j==i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
}

