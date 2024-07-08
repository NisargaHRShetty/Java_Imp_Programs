//Write a java program to check a number is pallindrome or not 

import java.util.Scanner;

class PallindromeNumber{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number");
    int num = sc.nextInt();
    int temp = num;
    int rnum = 0;
     
     while(num!=0){

        //get last digit from num
        int digit = num % 10;
        rnum = rnum * 10 + digit;
        num = num / 10;
     }
        if(temp == rnum){
            System.out.println("The number is pallindrome");
        }else{
            System.out.println("The number is not pallindrome");
        }
    }
}