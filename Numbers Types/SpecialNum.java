// Special number is a number that is Sum of digits plus product of digits it is equal to original number Eg: 59 = 5 + 9 + 5 * 9
import java.util.Scanner;

class SpecialNum {
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
        if(sum + product == m){
            System.out.println(m +" is a Special Number");
    }else{
        System.out.println(m + " is not a Special Number");
    }
    }
}     
