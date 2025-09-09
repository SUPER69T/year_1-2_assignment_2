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
    //getters:
    public String getArticle_name() {return Article_name;}
    public Author getAuthor() {return author;}
    public String getURL() {return URL;}
    //

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Article) {
            Article old_article = (Article) obj;
            return this.getArticle_name().equals(old_article.getArticle_name()) && this.getAuthor().equals(old_article.getAuthor()) && this.getURL().equals(old_article.getURL());
        }
        return false;
    }

    @Override
    public String toString() {
        String spaces = " ".repeat(22);
        return "'" + this.getArticle_name() + "', by "+ this.getAuthor().getName() + " at " + this.getURL() + ",\n" + spaces + this.getTitle() + "(" + this.getIssue_Number() + "),\n" + spaces + "published by " + this.getPublication() + "(" + this.getYear_of_publication() + ")";
    }
}
