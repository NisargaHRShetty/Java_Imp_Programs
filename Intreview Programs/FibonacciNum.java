import java.util.Scanner;

class FibonacciNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms in the fibonacci series");
        int terms = sc.nextInt();

        System.out.println("The Fibonnaci series of " + terms +" terms is : ");

        int fisrtTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(fisrtTerm + " ");

        int nextTerm = fisrtTerm + secondTerm;
        fisrtTerm = secondTerm;
        secondTerm = nextTerm;
        }
    }
}