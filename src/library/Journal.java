package library;

public class Journal extends Publication{
    private int issue_Number;
    private int year_of_publication;
    public Journal(String title, String publication, int qty, int issue_Number, int year_of_publication){
        super(title, publication, qty);
        this.issue_Number = issue_Number;
        this.year_of_publication = year_of_publication;
    }
    //getters:
    public int getIssue_Number() {return issue_Number;}
    public int getYear_of_publication() {return year_of_publication;}
    //

    public boolean equals(Journal old_journal){
        return old_journal.getIssue_Number() == this.getIssue_Number() && old_journal.getYear_of_publication() == this.getYear_of_publication();
    }

    public String toString(){
        return "Issue Number: " + issue_Number + ", Year of publication: " + year_of_publication;
    }
}
