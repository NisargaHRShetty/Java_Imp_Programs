//a buzz number is a number that is either divisible by 7 or ends with the digit 7. 

 import java.util.Scanner;

class BuzzNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        int m = num;

        if((num % 7 == 0 ) || (num % 10 == 7)){
            System.out.println(m +" is a Buzz Number");
    }else{
        System.out.println(m + " is not a Buzz Number");
    }
    }
}     
