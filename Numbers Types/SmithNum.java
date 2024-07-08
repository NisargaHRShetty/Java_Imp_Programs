// A Smith number is a composite number for which the sum of its digits is equal to the sum of the digits in its prime factorization. For example, 666 is a Smith number because the sum of its digits (6+6+6) is equal to the sum of the digits of its prime factors (2, 3, and 3), which is 2+3+3+37 = 3+7 = 18

import java.util.Scanner;

class SmithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;

    // Calculate the sum of the digits of the number
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

    //Calculate the sum of the digits of the prime factors of the number
         int sum2 = 0;
         num = m;

    // Checking and summing the digits of prime factors
            for(int i=2; i<= num; i++){
            while ( num % i == 0){

                //Sum the digits of the prime factor
               int factor = i;
                    while (factor != 0){
                    int digit = factor % 10;
                    sum2 = sum2 + digit;
                    factor = factor / 10;
                    }
                    num = num / i;
                }
            }

        if ( sum2 == sum){
            System.out.println(m +" is a Smith Number");

        } else {
            System.out.println(m + " is not a Smith Number");
        }

        
    }
}

