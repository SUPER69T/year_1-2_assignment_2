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
        int loops1 = 0;
        int student_ID_input = -1;
        while (true) {
            if (loops1 == 0)
                System.out.println("Welcome to the library's publication-loaning service. please enter your student ID number: ");
            else {
                if (loops1 % 3 == 0) System.out.println("Enter -1 to exit the menu.");
                System.out.println("Please re-enter the Student ID number: ");
            }
            Scanner input = new Scanner(System.in);
            try {
                student_ID_input = input.nextInt();
            } catch (InputMismatchException type_Exception) {
                System.out.println("You have entered invalid characters, Please try again.");
                loops1++;
                continue;
            }
            if (student_ID_input == -1) {
                System.out.println("Have a pleasant day! :)");
                break;
            }
            if (3 < student_ID_input || student_ID_input < 0) {
                System.out.println("You have entered an invalid number, Please try again.");
                loops1++;
                continue;
            }
            //

            //second while loop - checking for publication ID:
            int loops2 = 0;
            int publication_ID = -1;
            boolean breaking = false;
            while (true) {
                if (loops2 == 0)
                    System.out.println("Hello, " + students[student_ID_input].getStudentName() + ", please enter the publication ID number:");
                else {
                    if (loops2 % 3 == 0) System.out.println("Enter -1 to return.");
                    System.out.println("Please re-enter the publication ID number: ");
                }
                try {
                    publication_ID = input.nextInt();
                } catch (InputMismatchException type_Exception) {
                    System.out.println("You have entered invalid characters, Please try again.");
                    loops2++;
                    continue;
                }
                if (publication_ID == -1) {
                    breaking = true;
                    break;
                }
                if (10 > publication_ID || publication_ID > publication_DATABASE.get_Last_ID__from_DATABASE()) {  //
                    System.out.println("No such publication ID exists, Please try again.");
                    loops2++;
                    continue;
                }
                break;
            }
            if (breaking) {
                continue;
            }  //all of that for a nice menu SMH :(..
            Publication current_Pub = PublicationUtils.find_Publication(publication_ID);
            switch (students[student_ID_input].loan_Publication(current_Pub)) {
                case 0:
                    break;
                case 1:
                    System.out.println("This publication is out of stock. returning to menu:");
                    continue;
                case 2:
                    System.out.println("You have exceeded the limit of owned publications. returning to menu:");
                    continue;
        }
            System.out.println("Loan Report:\nStudent ID:" + student_ID_input + "." + " ".repeat(7) + "Loaned by: " + students[student_ID_input].getStudentName() + ", Currently loaning: " + students[student_ID_input].getLoanedNum() + ".");
            System.out.println("You have successfully loaned:\n" + publication_ID + "-" + current_Pub.getType_print() + current_Pub.getName() + " Quantity: " + current_Pub.getQty() + "-left.");
        }
    }
}