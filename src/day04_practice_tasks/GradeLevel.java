package day04_practice_tasks;

public class GradeLevel {
    public static void main(String[] args) {

                byte gradeLevel = 18;
                String result;

                if (1 <= gradeLevel && gradeLevel <= 18) {
                    result = "Elementary school";
                    if (6 <= gradeLevel) {
                        result = "Middle school";
                        if (9 <= gradeLevel) {
                            result = "High School";
                            if (13 <= gradeLevel) {
                                result = "College";
                                if (17 <= gradeLevel) {
                                    result = "Grad School";
                                }
                            }
                        }
                    }
                } else {
                    result = "Invalid level.";
                }
                System.out.println(result);
            }
        }


