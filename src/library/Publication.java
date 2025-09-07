package library;

public class Publication {
    private String title;
    private String publication;
    private int qty;
    final static int Pub_def_id = 10;
    static private int def_id = Pub_def_id;
    public Publication(String title, String publication, int qty) {  //regular constructor.
        this.title = title;
        this.publication = publication;
        this.qty = qty;
        def_id++;
    }
    //getters:
    public String getTitle() {return title;}
    public String getPublication() {return publication;}
    public int getQty() {return qty;}
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
