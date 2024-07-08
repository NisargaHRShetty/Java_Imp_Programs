// A "Sunny number" is a number where if 1 is added to it, the result is a perfect square. For example, 3 is a Sunny number because 3 + 1 = 4, which is a perfect square (2^2).

import java.util.Scanner;

class SunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Emter a Number");
        int num = sc.nextInt();

        if(isSunnyNumber(num)){
            System.out.println(num + " is Sunny Number");
        }else{
            System.out.println(num + " is not a Sunny Number");
        }
    }
    public static boolean isSunnyNumber(int num){
        int nextNum = num +1;
        int sqrt = (int)Math.sqrt(nextNum);
        return sqrt * sqrt ==  nextNum;
    }
}