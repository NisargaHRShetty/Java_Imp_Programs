// An armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
// Eg: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//1634 = 1^4 + 6^4 +3^4+ 4^4 = 1 + 1296 + 81 + 256 = 1643

import java.util.Scanner;

class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;
        int d = 0;

        while(num!=0){
             num = num/10;
             d++;
        }
             System.out.println("The number of digits : " + d);
        

        num = m;
        while(num!=0){
            int digit = num % 10; //To get last digit
           sum = (int)(sum + Math.pow(digit, d));
            num = num/10; //To remove last digit that is used
        }
        System.out.println("Sum is " + sum);

        if(sum == m){
            System.out.println(m +" is a ArmStrong Number");
    }else{
        System.out.println(m + " is not a Armstrong Number");
    }
    }
}     
