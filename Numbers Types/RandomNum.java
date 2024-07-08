// Java program that generates a random number between a specified range using the Random class from Java's java.util package:

import java.util.Random;
import java.util.Scanner;


class RandomNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Starting Number :");
        int min = sc.nextInt();

        System.out.println("Enter a Last Upto Number ");
        int max = sc.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(min, max);
        System.out.println("Random Number Between "+min+" and "+max+" is : " + randomNumber);
    }
}