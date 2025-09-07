package library;

public class Encyclopedia extends Publication {
    private String editor;
    private int volume;
    public Encyclopedia(String title, String publication, int qty, String editor, int volume){
        super(title, publication, qty);
        this.editor = editor;
        this.volume = volume;
    }
    //getters:
    public String getEditor() {return editor;}
    public int getVolume() {return volume;}
    //

    public boolean equals(Encyclopedia old_encyclopedia){
        return this.editor.equals(old_encyclopedia.getEditor()) && this.volume == old_encyclopedia.getVolume();
    }

    public String toString(){
        return "Editor: " + editor + ", Volume: " + volume;
    }
}
