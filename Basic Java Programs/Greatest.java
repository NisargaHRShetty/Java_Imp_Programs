import java.util.Scanner;

class Greatest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number");
        int a = sc.nextInt();

        System.out.println("Enter a second number");
        int b = sc.nextInt();

         System.out.println("Enter a third number");
        int c = sc.nextInt();

        if(a >= b){
            if(a >= c){
                 System.out.println(a + " is greatest among " + a + b + c);
            }
            else {
        System.out.println(c + " is greatest among " + a + b + c);
            }
        } else {
            if (b >= c) {
                System.out.println(b + " is greatest among " + a + b + c);
            }
            else {
                 System.out.println(c + " is greatest among " + a +","+ b +","+ c);
            }
        
            }
        }
        }