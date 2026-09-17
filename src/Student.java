public class Student {

    String name;
    int age;
    char grade;

    Student() {
        System.out.println("Empty field:");
    }

    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void displayDetails() {

        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Grade " + this.grade);
    }


    }

