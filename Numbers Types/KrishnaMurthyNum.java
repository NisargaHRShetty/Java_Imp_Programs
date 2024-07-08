// A Krishna Murthy number (also known as a Strong number) is a number whose sum of the factorial of its digits is equal to the number itself. For example, 145 is a Krishna Murthy number because 1! + 4! + 5! = 145

import java.util.Scanner;

class KrishnaMurthyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int m = num;
        int sum = 0;
        
        while(num!=0){
            int digit = num % 10; //To get last digit of given num
            int fact = 1;
            for(int i=1; i<=digit; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            num = num/10; //To remove last digit that is used
        }
            
        if(sum == m){
            System.out.println(m +" is a Krishna Murthy Number");
    }else{
        System.out.println(m + " is not a Krishna Murthy Number");
    }
    }
}     
