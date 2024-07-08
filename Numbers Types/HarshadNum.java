// A "Harshad or Niven Number" is number which is divisible by the sum of its digits Eg: 156 = 1 + 5 + 6 = 12

import java.util.Scanner;

class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;

        while(num!=0){
            int digit = num % 10; //To get last digit
            sum = sum + digit;
            num = num/10; //To remove last digit that is used
        }
        if(m % sum == 0){
            System.out.println(m +" is a Harshad Number");
    }else{
        System.out.println(m + " is not a Harshad Number");
    }
    }
}     
