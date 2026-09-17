public class Employee {
    String name;
    int age;
    double salary;

    Employee() {
        System.out.println("Name: Unknown\n" +
                "Age: 0\n" +
                "Salary: 0.0");
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println( "Name : "   + this.name);
        System.out.println( "Age : "   + this.age);
        System.out.println( "Salary : "   + this.salary);
    }

}
