package library;

public class StudentUtils {
    public static void listStudents(Student[] students) {
        int actual_Arr_Length = 0;
        for(Student student : students) {
            if(student == null) break;
            actual_Arr_Length++;
        }
        Student[] students_Arr = new Student[actual_Arr_Length];
        for(int i = 0; i < actual_Arr_Length; i++) {

        }
    }
}
