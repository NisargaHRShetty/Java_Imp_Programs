import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Number");
    int num = sc.nextInt();
    int rnum = 0;
     
     while(num!=0){

        //get last digit from num
        int digit = num % 10;
        rnum = rnum * 10 + digit;
        num = num / 10;
     }
     System.out.println(rnum);
    }
}