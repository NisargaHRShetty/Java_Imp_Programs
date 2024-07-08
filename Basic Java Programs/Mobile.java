//Created a class called Mobile
public class Mobile{

// Declare variables for brand and cost
String brand;
double cost;

//Constructor to initialize the mobile object
public Mobile(String brand, double cost) {
    this.brand = brand;
    this.cost = cost;
}

public static void main(String[] args) {
    Mobile mb = new Mobile("OppoA5", 13000);

    //Print the brand and cost
    System.out.println("Brand :" + mb.brand);
    System.out.println("Cost :" + mb.cost);
}

}