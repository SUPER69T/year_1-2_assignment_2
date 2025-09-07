package library;
public class Publication {
    private String title;
    private String publication;
    private int qty;
    final static int Pub_def_id = 10;
    static private int def_id = Pub_def_id;
    public Publication(String title, String publication, int qty){
        this.title = title;
        this.publication = publication;
        this.qty = qty;
        def_id++;
    }
    //@Override
    public boolean equals(Publication old_pub){
        return (this.title.equals(old_pub.title) && (this.publication.equals(old_pub.publication))) && (this.qty == old_pub.qty);
    }
    @Override
    public String toString(){
        return "Title: " + title + ", Publication: " + publication + ", Qty: " + qty;
    }
}
