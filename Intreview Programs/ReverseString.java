//Write a java program to reverse a string 

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String");
    String str = sc.nextLine();
    String rstr = " ";
    char ch;

    for(int i=0; i<str.length(); i++){
        ch = str.charAt(i);
        rstr = ch + rstr;
    }
    System.out.println("Reverse String is : " + rstr);

    }
}