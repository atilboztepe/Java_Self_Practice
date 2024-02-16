package day11_practice_tasks;

public class Employee {
    String name, jobTitle;
    int age;
    char gender;
    double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, String jobTitle, char gender) {
        this(name, age);
        this.jobTitle = jobTitle;
        this.gender = gender;
    }

    public Employee(String name, int age, String jobTitle, char gender, double salary) {
        this(name, age, jobTitle, gender);
        this.salary = salary;
    }

    public String work() {

        return jobTitle + " " + name + " is working.";

    }

    public String toString() {
        return "Employee's " +
                "name: " + name +
                ", jobTitle: " + jobTitle +
                ", age: " + age +
                ", gender: " + gender +
                ", salary: $" + salary;
    }
}
