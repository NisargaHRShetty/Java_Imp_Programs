/*

1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

*/

import java.util.Scanner;

class NumPat1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Size");
    int n = sc.nextInt();

    for(int i = 1, p=1; i<=n ;i++, p++){
        for(int j=1 ; j<=n ; j++){
                System.out.print(p+" ");
            }
        System.out.println();
    }
    }

    }


