//Write a java program to calculate facotorial number

import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial of numbers");
        int num = sc.nextInt();

        long facotorial = 1;

        for (int i = 1; i <= num; i++) {
            facotorial = facotorial * i;
        }
        System.out.print("The Factorial of " + num +" is : " + facotorial);
        }
    }