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

    //setters:
     public void setLoanedNum(int loanedNum) {this.loanedNum = loanedNum;}
    //
    public void loan_Publication(Publication publication) {
        if (this.getLoanedNum() >= 3) {  //checking that the student hasn't loaned more than 2 books.
            System.out.println("You have exceeded the limit of owned publications.");
        }
        else if(publication.getQty() <= 0) {  //checking that the Publication quantity is at least 1.
            System.out.println("You have exceeded the limit of owned publications.");
        }
        else if(getLoanedNum() == 0) {
            borrowed_Publications = new Publication[]{publication};
            setLoanedNum(this.getLoanedNum() + 1);
        }
        else {
            borrowed_Publications = PublicationUtils.add_Publication(borrowed_Publications, publication);
            setLoanedNum(this.getLoanedNum() + 1);
        }
    }

    @Override
    public String toString() {
        return "Student number: " + getStudentId() + "      Name: " + getStudentName() + ", Loaned publications: " + getLoanedNum() + ".";
    }
}
