package library;

public class Author {
    private String name;
    private String email;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    //getters:
    public String getName() {return name;}
    public String getEmail() {return email;}
    //

    public boolean equals(Author old_author) {
        return this.getName().equals(old_author.getName()) && this.getEmail().equals(old_author.getEmail());
    }

    public String toString() {
        return "Name: " + this.getName() + ", Email: " + this.getEmail();
    }
}
