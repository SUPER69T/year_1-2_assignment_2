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

    public boolean equals(Book old_book) {
        return this.author.equals(old_book.getAuthor()) && this.editor.equals(old_book.getEditor()) && this.year_of_publication == old_book.year_of_publication;
    }

    public String toString() {
        return "Author: " + author + ", Editor: " + editor + ", Year of publication: " + year_of_publication;
    }
}