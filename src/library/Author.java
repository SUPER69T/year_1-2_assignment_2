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
        return this.name.equals(old_author.name) && this.email.equals(old_author.email);
    }

    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }
}
