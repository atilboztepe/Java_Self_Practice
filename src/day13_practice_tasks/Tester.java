package day13_practice_tasks;

public class Tester extends Employee{

    public Tester(String employeeName, String employeeId, String jobTitle, double salary, String companyName) {
        super(employeeName, employeeId, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(getJobTitle() + " " + getEmployeeName() + " is testing");
    }
}