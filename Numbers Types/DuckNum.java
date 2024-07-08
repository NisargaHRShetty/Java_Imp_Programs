// A "Duck Number" is number which has Zero present in it. Eg: 402, 280,100
//A "Duck number" is a positive number that contains at least one zero in it but there should be no zero present in the beginning of the number. For example, 3210, 707, and 450 are Duck numbers, but 0123 is not.

import java.util.Scanner;

class DuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int count = 0;

        while(num!=0){
            int digit = num % 10; //To get last digit
            if(digit == 0){
                count++;
            }
            num = num/10; //To remove last digit that is used
        }
        if(count > 0){
            System.out.println(m +" is a Duck Number");
    }else{
        System.out.println(m + " is not a Duck Number");
    }
    }
}     
