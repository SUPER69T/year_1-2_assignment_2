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
    public Publication[] getborrowed_Publications() {return borrowed_Publications;}
    //

    //setters:
     public void setLoanedNum(int loanedNum) {this.loanedNum = loanedNum;}
    public void setborrowed_Publications(Publication[] borrowed_Publications) {this.borrowed_Publications = borrowed_Publications;}
    //
    public int loan_Publication(Publication publication) {
        if (this.getLoanedNum() >= 3) {return 1;}  //checking that the student hasn't loaned more than 2 books.
        else if(publication.getQty() <= 0) {return 2;}  //checking that the Publication quantity is at least 1.
        else if(getLoanedNum() == 0) {
            setborrowed_Publications(new Publication[]{publication});
            setLoanedNum(this.getLoanedNum() + 1);
            return 0;
        }
        else {
            setborrowed_Publications(PublicationUtils.add_Publication(getborrowed_Publications(), publication));
            setLoanedNum(this.getLoanedNum() + 1);
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student number: " + getStudentId() + "      Name: " + getStudentName() + ", Loaned publications: " + getLoanedNum() + ".";
    }
}
