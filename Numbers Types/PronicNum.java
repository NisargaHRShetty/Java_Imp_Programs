// A pronic number (also known as a rectangular number, oblong number, or heteromecic number) is a number which is the product of two consecutive integers, that is, a number of the form n(n+1).

import java.util.Scanner;

class PronicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        
        boolean isPronic = false;
        
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }

        if (isPronic) {
            System.out.println(num + " is a Pronic Number");
        } else {
            System.out.println(num + " is not a Pronic Number");
        }
    }
}

