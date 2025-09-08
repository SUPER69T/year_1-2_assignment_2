package library;

public class Book extends Publication {
    private Author author;
    private String editor;
    private int year_of_publication;
    public Book(String title, String publication, int qty, Author author, String editor, int year_of_publication) {
        super(title, publication, qty);
        this.author = author;
        this.editor = editor;
        this.year_of_publication = year_of_publication;
    }
    //getters:
    public Author getAuthor() {return author;}
    public String getEditor() {return editor;}
    public int getYear_of_publication() {return year_of_publication;}
    //

    //@Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book old_book = (Book) obj;
            return this.getAuthor().equals(old_book.getAuthor()) && this.getEditor().equals(old_book.getEditor()) && this.getYear_of_publication() == old_book.getYear_of_publication();
        }
        return false;
    }

    public String toString() {
        return this.getTitle() + " by " + this.getAuthor().getName() + " at " + this.getAuthor().getEmail() + " published by " + this.getPublication() + " edited by " + this.getEditor() + "(" + this.getYear_of_publication() + ")";
    }
}