package library;

public class Student {
    private String StudentName;
    private static int Student_id = 0;
    final int def_id;
    private int loanedNum;
    private Publication[]borrowed_Publications;
    public Student(String StudentName) {
        this.StudentName = StudentName;
        this.loanedNum = 0;
        Student_id++;
        this.def_id = Student_id;
        Publication[] borrowed_Publications = new Publication[0];
    }

    //getters:
    public String getStudentName() {return StudentName;}
    public int getStudentId() {return def_id;}
    public int getLoanedNum() {return loanedNum;}
    //

    public void loan_Publication(Publication publication) {
        if (this.getLoanedNum() < 3 && publication.getQty() > 0) {  //checking that the student hasn't loaned more than 2 books and that the Publication quantity is at least 1.
            PublicationUtils.add_Publication(borrowed_Publications, publication);
            this.loanedNum++;
        }
    }

    @Override
    public String toString() {
        return "Student number: " + getStudentId() + "      Name: " + getStudentName() + ", Loaned publications: " + getLoanedNum() + ".";
    }
}
