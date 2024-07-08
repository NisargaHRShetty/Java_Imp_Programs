//Write a java program to check a string is pallindrome or not 

import java.util.Scanner;

class Pallindrome{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a String");
    String str = sc.nextLine();
    String rstr = " ";
    char ch;
    int flag = 0;

    for(int i=0; i<str.length(); i++){
        ch = str.charAt(i);
        rstr = ch + rstr;
    }
    for(int i = 0; i<str.length(); i++){
        if(str.charAt(i)==rstr.charAt(i)){
            flag = 0;
        }
        else{
            flag = 1;
            break;
        }
    }
    if( flag == 1){
        System.out.println("The Given String is not pallindrome");
   }else{
    System.out.println("The given string is pallindrome");
   }
    
    }
}