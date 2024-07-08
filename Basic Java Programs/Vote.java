import java.util.Scanner;

class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("The person is eligible to vote");
        }
        else{
        System.out.println("The person is not eligible to vote");
        }
    }
}