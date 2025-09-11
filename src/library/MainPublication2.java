package library;

public class MainPublication2 {
    public static void main(String[] args) {
        Publication[] publications = new Publication[100];
        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee","harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald","scott@somwhere.com");
        authors[2] = new Author("Amos Oz","oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron","giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud","avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad","ezra@somwhere.com");

        publications[0]= new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.", 2, authors[0],"Tay Hohoff", 1960);
        publications[1]=new Article("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",0,297,2020, "Yanshuf Aezim", authors[5], "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2]=new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",1);
        publications[4]=new Article("Masa Hakesem Hamadaii","Weizmann IOS",0,102,2021, "Alufot Eropa le-Mathematica", authors[4], "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",3);
        publications[6]=new Book("The Great Gatsby", "Charles Scribner's Sons", 1, authors[1],"Maxwell Perkins", 1925);
        publications[7]=new Journal("Teva Hadvarim","Hahevra le-Heker Haadam ve-Hasovev ltd",5,297,2020);
        publications[8]=new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9]=new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt", 1, authors[2],"", 2002);
        publications[10]=new Article("Masa Hakesem Hamadaii","Weizmann IOS",0,106,2022, "AI (artificial intelligence) is upgrading", authors[3], "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11]=new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "",2);
        publications[12]=new Journal("Nature","Springer Nature", 5,  590,2021 );

        //סעיפים ד-ה'
        System.out.println("List of publication in the order they were entered: \n");
        for(int i = 0 ; i < publications.length ; i++){
            if(publications[i] == null) break;  //assuming that all variables are being inputted in order.
            System.out.println(publications[i].getDef_id() + " - " + publications[i].getType_print() +publications[i].toString() + ".\n");
        }
        //

    Publication[] new_Sorted_Array = sort_Publication(publications);
    }
    public Publication[] sort_Publications(Publication[] pub_Array){
        Publication[][] index_Sorted_Array = new Publication[5][];
        Publication[] new_Pub_Array = new Publication[pub_Array.length];
        int index0 = 0, index1 = 0, index2 = 0, index3 = 0, index4 = 0;
        char current_Char = 0;
        for (int i = 0; i < pub_Array.length; i++) {  //sorting in an indexed array to iterate over pub_Array only once: 'B' = 0, 'J' = 1, 'A' = 2, 'E' = 3, 'P' = 4.
            switch (pub_Array[i].getType_char()) {
                case 'B':
                    index_Sorted_Array[0][index0] = pub_Array[i];
                    index0++;
                case 'J':
                    index_Sorted_Array[1][index1] = pub_Array[i];
                    index0++;
                case 'A':
                    index_Sorted_Array[2][index2] = pub_Array[i];
                    index0++;
                case 'E':
                    index_Sorted_Array[3][index3] = pub_Array[i];
                    index0++;
                case 'P':
                    index_Sorted_Array[4][index4] = pub_Array[i];
                    index0++;
            }
        }
        int new_Index = 0;
        for(int j = 0 ; j < 5 ; j++){
            for(int k = 0 ; k < index_Sorted_Array[j].length ; k++){
                new_Pub_Array[new_Index] = index_Sorted_Array[j][k];
                        new_Index++;
            }
        }
        return new_Pub_Array;
    }
}
