package day11_practice_tasks;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public char grade;
    public String batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studing");
    }

    public void attendClass() {
        System.out.println(name + " is attending the live class");
    }

    public void printSchoolName() {
        System.out.println(schoolName);
    }

    public void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}