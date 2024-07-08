// A Tech number is a number that has an even number of digits and when split into two equal parts, the sum of these parts when squared is equal to the original number. For example, 2025 is a Tech number because when split into two parts, 20 and 25, their sum is 45, and 45^2 = 2025

import java.util.Scanner;

class TechNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();
        int m = num;
        int sum=0, firstHalf=0, secondHalf=0, square =0;

        //for(int i=1000; i<=9999; i++){
            //int n = i;
            firstHalf = num % 100; // to get first half means in 2024 we get 24
            secondHalf = num / 100; //to get second half maens we get 20 in 2024
            sum = firstHalf + secondHalf;
            square = sum * sum;

        //}
        if(square == m){
            System.out.println(m+" is Tech Number");
        }else{
            System.out.println(m+" is not Tech Number");
        }
        
    }
    }