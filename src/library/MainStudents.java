package library;

import java.util.Scanner;

import java.util.InputMismatchException;

public class MainStudents {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");
        //listStudents(students);  //סעיף ב'
        //first while loop - checking for student ID:
        int student_ID_input = -1;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the library, please enter your student ID number: ");
            try {student_ID_input = input.nextInt();}
            catch (InputMismatchException  type_Exception) {
                System.out.println("You have entered invalid characters, Please try again.");
                continue;
            }
            if (3 < student_ID_input || student_ID_input < 0) {
                System.out.println("You have entered an invalid number, Please try again.");
                continue;
            }
            //

            //second while loop - checking for publication ID:
            int loops = 0;
            int publication_ID = -1;
            while (true) {
                if (loops == 0)
                    System.out.println("Hello, " + students[student_ID_input].getStudentName() + ", please enter the publication ID number:");
                else System.out.println("Please re-enter the publication ID number: ");
                try {publication_ID = input.nextInt();}
                catch (InputMismatchException type_Exception) {
                    System.out.println("You have entered invalid characters, Please try again.");
                    loops++;
                    continue;
                }
                if (10 > publication_ID || publication_ID > Publication.getLastID()) {
                    System.out.println("No such publication ID exists, Please try again.");
                    loops++;
                    continue;
                }
                break;
                students[student_ID_input].loan_Publication(PublicationUtils.find_Publication(publication_ID));
            }
            //

            //students[student_ID_input].
        }
    }
    /*use incase of need to check type exception:
    public class Test {
        public static void checkAge(int age) {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or older");
            }
            System.out.println("Age is valid: " + age);
        }
    }
    */
}