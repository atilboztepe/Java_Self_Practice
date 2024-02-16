package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Xavi", 40);
        System.out.println(employee1);

        System.out.println();

        Employee employee2 = new Employee("Iniesta", 34, "Doctor", 'M');
        System.out.println(employee2);
        System.out.println(employee2.work());

        System.out.println();

        Employee employee3 = new Employee("Bob", 54, "Driver", 'F',60_000.00);
        System.out.println(employee3);
        System.out.println(employee3.work());


    }
}
