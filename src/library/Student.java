package library;

public class Student {
    private String StudentName;
    private static int Student_id = 0;
    final int def_id;
    private int loanedNum;
    public Student(String StudentName) {
        this.StudentName = StudentName;
        this.loanedNum = 0;
        Student_id++;
        this.def_id = Student_id;
        Publication[] borrowed_Publications = new Publication[0];
    }

    //getters:
    public String getStudentName() {return this.StudentName;}
    public int getStudentId() {return this.def_id;}
    public int getLoanedNum() {return this.loanedNum;}
    //

    @Override
    public String toString() {
        return "Student number: " + getStudentId() + "      Name: " + getStudentName() + ", Loaned publications: " + getLoanedNum() + ".";
    }
}
