package library;

public class Publication {
    private String title;
    private String publication;
    private int qty;
    private static int Pub_def_id = 9;
    final int def_id;
    public Publication(String title, String publication, int qty) {  //regular constructor.
        this.title = title;
        this.publication = publication;
        this.qty = qty;
        Pub_def_id++;
        this.def_id = Pub_def_id;
    }
    //getters:
    public String getTitle() {return title;}
    public String getPublication() {return publication;}
    public int getQty() {return qty;}
    public int getDef_id() {return def_id;}
    public String getName() {return title;}
    public String getType() {
        if (this instanceof Book) return "Book:           ";
        else if (this instanceof Article) return "Article:        ";
        else if (this instanceof  Journal) return "Journal:         ";
        else if (this instanceof Encyclopedia) return "Encyclopedia:    ";
        else return "Publication";
    }
    //

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Publication) {
            Publication pub = (Publication) obj;
            return this.getPublication().equals(pub.getTitle()) && this.getPublication().equals(pub.getPublication()) && this.getQty() == pub.getQty();
        }
        return false;
    }

    @Override
    public String toString(){
        return "Title: " + this.getTitle() + ", Publication: " + this.getPublication() + ", Qty: " + this.getQty();
    }
}
