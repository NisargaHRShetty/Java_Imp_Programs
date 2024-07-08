// A Neon number is a number where the sum of the digits of the square of the number is equal to the number itself. For example, 9 is a Neon number because the square of 9 is 81, and the sum of the digits of 81 is 8 + 1 = 9.

import java.util.Scanner;

class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;
        num = num * num;

        while(num!=0){
            int digit = num % 10; //To get last digit
            sum = sum + digit;
            num = num/10; //To remove last digit that is used
        }
        if(sum == m){
            System.out.println(m +" is a Neon Number");
    }else{
        System.out.println(m + " is not a Neon Number");
    }
    }
}     
