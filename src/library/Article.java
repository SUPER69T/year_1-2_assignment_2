package library;

public class Article extends Journal{
    private String Article_name;
    private Author author;
    private String URL;
    public Article(String title, String publication, int qty, int issue_Number, int year_of_publication, String Article_name, Author author, String URL) {
        super(title, publication, qty, issue_Number, year_of_publication);
        this.Article_name = Article_name;
        this.author = author;
        this.URL = URL;
    }
}
