// Write a java program to check number is greater than or smaller than or equals to 10

import java.util.Scanner;

class Program1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>10){
            System.out.println("The number is greater than 10");
        }
        else{
            if(num==10){
        System.out.println("The number is equals to 10");
            }
            else{
                System.out.println("The number is smaller than 10");
            }
        }
    }
}