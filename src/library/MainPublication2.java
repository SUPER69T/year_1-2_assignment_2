package library;

public class MainPublication2 {
    public static void main(String[] args) {  //I made a separate database class called: publication_DATABASE, to hold the Publication[]publications array for it to be able to be used in the Students main.
        //סעיפים ד-ה'
        System.out.println("List of publications in the order they were entered: \n");
        for (int i = 0; i < publication_DATABASE.get_Arr_Length(); i++) {
            if (publication_DATABASE.get_Publication_By_Index(i) == null) break;  //assuming that all variables are being inputted in order.
            System.out.println(publication_DATABASE.get_Publication_By_Index(i).getThis_id() + " - " + publication_DATABASE.get_Publication_By_Index(i).getType_print() + publication_DATABASE.get_Publication_By_Index(i).toString() + ".\n");
        }
        //

        //סעיף ו'
        Publication[] new_Sorted_Array = PublicationUtils.sort_Publications_Arr(publication_DATABASE.get_Publications_Arr());
        System.out.println("List of sorted publications: \n");
        for (Publication publication : new_Sorted_Array) {
            System.out.println(publication.getThis_id() + " - " + publication.getType_print() + publication.toString() + ".\n");
        }
        //
    }
}