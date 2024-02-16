package day13_practice_tasks;

    public class StudentClients {
        public static void main(String[] args) {
            GraduateStudent graduateStudent = new GraduateStudent("Bob", 26, "male","8","SDET",'A',"Cydeo");
            System.out.println(graduateStudent);
            graduateStudent.study();

            UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Merry", 25, "female","12","SDET",'B',"Cydeo");
            System.out.println(undergraduateStudent);
            undergraduateStudent.study();


            CydeoStudent cydeoStudent = new CydeoStudent("Messi",33,"male","13","SDET",'F',"Cydeo",6,23,"Python");
            System.out.println(cydeoStudent);
            cydeoStudent.study();
        }

}
