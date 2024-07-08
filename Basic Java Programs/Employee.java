class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void printEmployeeDetails(){
        System.out.println("Employee ID: "+ id);
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Salary: "+ salary);
         System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nisarga", 50000);
        Employee e2 = new Employee(2, "Suarbhi", 60000);

        System.out.println("Employee 1 Details:");
       e1.printEmployeeDetails();

       System.out.println("Employee 2 Details:");
       e2.printEmployeeDetails();
    }
}