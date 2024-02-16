package day11_practice_tasks;

public class CydeoStudentsClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudents1 = new CydeoStudent("Bob", 28, 1903, 'B', "CY03", 333);
        cydeoStudents1.schoolName = "Cydeo";
        cydeoStudents1.programmingLanguage = "Java";
        cydeoStudents1.study();
        cydeoStudents1.attendClass();
        cydeoStudents1.printSchoolName();
        cydeoStudents1.printProgLanguage();
        System.out.println(cydeoStudents1);

    }
}