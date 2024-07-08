//Find area Program

import java.util.Scanner;

class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area");
        System.out.println("1, Circle");
        System.out.println("2, Rectangle");
        System.out.println("3, Square");
        System.out.println("4, TRiangle");
        System.out.println("Enter your choice (1/2/3/4) : ");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("Enter a radius of circle");
                double radius = sc.nextDouble();
                double area = Math.PI*radius*radius;
                System.out.println("The area of circle " +radius+ " is " +area);
                break;
            
            case 2: 
                System.out.println("Enter length of the rectangle : ");
                double length = sc.nextDouble();
                System.out.println("Enter width of the rectangle : ");
                double width = sc.nextDouble();
                double areaRec = length * width;
                System.out.println("The area of rectangle " +areaRec);
                break;
            
            case 3:
                System.out.println("Enter side length of the square : ");
                double side = sc.nextDouble();
                double areaSq = side * side;
                System.out.println("The area of Square " +areaSq);
                break;

            case 4: 
                System.out.println("Enter base of the triangle : ");
                double base = sc.nextDouble();
                System.out.println("Enter height of the triangle : ");
                double height = sc.nextDouble();
                double areaTri = 0.5 * base * height;
                System.out.println("The area of triangle " +areaTri);
                break;

            default:
                System.out.println("Invalid choice entered");
                break;
        }
        
    }
}