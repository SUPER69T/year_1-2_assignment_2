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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Journal) {
            Journal old_journal = (Journal) obj;
            return this.getIssue_Number() == old_journal.getIssue_Number() && this.getYear_of_publication() == old_journal.getYear_of_publication();
        }
        return false;
    }

    @Override
    public String toString(){
        String spaces = " ".repeat(22);
        return this.getTitle() + "(" + this.getIssue_Number() + "),\n" + spaces + "published by " + this.getPublication() + "(" + this.getYear_of_publication() + ")";
    }
}
