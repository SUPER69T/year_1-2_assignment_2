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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Encyclopedia) {
            Encyclopedia old_encyclopedia = (Encyclopedia) obj;
            return this.getEditor().equals(old_encyclopedia.getEditor()) && this.getVolume() == old_encyclopedia.getVolume();
        }
        return false;
    }

    @Override
    public String toString(){
        String spaces = " ".repeat(22);
        if(this.getEditor().isEmpty()) return this.getTitle() + " Vol. " + this.getVolume() + ",\n" + spaces + "published by " + getPublication() + " edited by unknown";
        return this.getTitle() + " Vol. " + this.getVolume() + ",\n" + spaces + "published by " + getPublication() + " edited by " + this.getEditor();
    }
}
