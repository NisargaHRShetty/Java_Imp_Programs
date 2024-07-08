// Swap of Two numbers without using temp 

import java.util.Scanner;

class SwapWithoutTemp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
       System.out.println("Before Swapping first number : " + num1 + " Second Number : " + num2 );

       num1 = num1 + num2;
       num2 = num1 - num2;
       num1 = num1 - num2;
       
     System.out.println("After Swapping first number : " + num1 + " Second Number : " + num2 );

    }

    }
