package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.name = "asdef";
        employee1.age = 24;
        employee1.gender = 'M';
        employee1.jobTitle = "Manager";
        employee1.salary = 100_000;

        employee1.work();
        System.out.println(employee1);

        Employee employee2 = new Employee();


        employee2.name = "xwyz";
        employee2.age = 21;
        employee2.gender = 'F';
        employee2.jobTitle = "Doctor";
        employee2.salary = 150_000;

        employee2.work();
        System.out.println(employee2);


    }
}
