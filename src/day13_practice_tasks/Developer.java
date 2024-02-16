package day13_practice_tasks;

    public class Developer extends Employee{

        public String programmingLanguage;

        public Developer(String employeeName, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
            super(employeeName, employeeId, jobTitle, salary, companyName);
            this.programmingLanguage = programmingLanguage;
        }
        public void work (){
            System.out.println(getJobTitle() + " " + getEmployeeName() + " is coding in " + programmingLanguage);
        }

        @Override
        public String toString() {
            return "Developer{" +
                    "employeeName='" + getEmployeeName() + '\'' +
                    ", employeeId='" + getEmployeeId() + '\'' +
                    ", jobTitle='" + getJobTitle() + '\'' +
                    ", salary=" + getSalary() +
                    ", companyName='" + getCompanyName() + '\'' +
                    "programmingLanguage='" + programmingLanguage + '\'' +
                    '}';
        }
    }
