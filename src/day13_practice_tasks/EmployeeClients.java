package day13_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester employee1 = new Tester("Bob", "3245", "Tester",
                70_000, "Cydeo");
        System.out.println("Employee1: " + employee1);
        employee1.work();

        Developer employee2 = new Developer("Mike", "M6798", "Developer",
                60_000, "Cydeo", "Java");
        System.out.println("Employee2: " + employee2);
        employee2.work();

        Teacher employee3 = new Teacher("Ely", "9384", "Teacher",
                80_000, "Cydeo");
        System.out.println("Employee3: " + employee3);
        employee3.work();

        Driver employee4 = new Driver("Anda", "6833", "Driver",
                50_000, "Cydeo");
        System.out.println("Employee4: " + employee4);
        employee4.work();

    }
}
