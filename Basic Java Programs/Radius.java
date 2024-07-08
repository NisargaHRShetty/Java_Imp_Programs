import java.util.Scanner;

class Radius{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of a Circle: ");
       double radius = sc.nextDouble();

       double area = Math.PI*radius*radius; // math.PI is double so when we write in float then we have to cast to float 
        //float area = (float) (Math.PI*radius*radius);
        System.out.println("The area of the circle is : " + area);

    }
}