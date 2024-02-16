package day13_practice_tasks;

public class Driver extends Employee{

    public Driver(String employeeName, String employeeId, String jobTitle, double salary, String companyName) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(getEmployeeName() + " is driving");
    }
}