// A "Spy number" is a number where the sum of its digits equals the product of its digits. For example, 123 is a Spy number because the sum of its digits (1 + 2 + 3) is 6, and the product of its digits (1 * 2 * 3) is also 6.

import java.util.Scanner;

class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;
        int product = 1;

        while(num!=0){
            int digit = num % 10; //To get last digit
            sum = sum + digit;
            product = product * digit;

            num = num/10; //To remove last digit that is used
        }
        if(sum == product){
            System.out.println(m +" is a Spy Number");
    }else{
        System.out.println(m + " is not a Spy Number");
    }
    }
}     
