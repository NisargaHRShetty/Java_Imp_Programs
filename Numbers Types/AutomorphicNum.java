// An automorphic number is a number whose square ends with the same digits as the number itself. For example, 5 is an automorphic number because 
//5 = 5*5 = 25 which ends in 5.


import java.util.Scanner;

class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;
        int flag = 0;
        int sq = num * num;

        while(num!=0){
            int digit = num % 10; //To get last digit of given num
            int digit1 = sq % 10; //to get last digit of squared num
            if(digit != digit1){
                flag = 1;
            }
            num = num/10; //To remove last digit that is used
            sq = sq / 10; //To remove last digit in squared number that is used
        }
        if(flag==0){
            System.out.println(m +" is a Automorphic Number");
    }else{
        System.out.println(m + " is not a Automorphic Number");
    }
    }
}     
