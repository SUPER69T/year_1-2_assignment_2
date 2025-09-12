package library;

public class MainPublication2 {
    public static void main(String[] args) {  //...Students class requires access to the Publication[]publications array while the MainPublication2 class is initially being declared 'VOID'. I had to change that in order for the assignment to have a solution.
        Publication[] publications = new Publication[100];

        Author[] authors = new Author[100];
        authors[0] = new Author("Harper Lee", "harper@somwhere.com");
        authors[1] = new Author("F. Scott Fitzgerald", "scott@somwhere.com");
        authors[2] = new Author("Amos Oz", "oz@somwhere.com");
        authors[3] = new Author("Giora Alexandron", "giora@somwhere.com");
        authors[4] = new Author("Avraham Aizenbud", "avi@somwhere.com");
        authors[5] = new Author("Ezra Hadad", "ezra@somwhere.com");

        publications[0] = new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.", 2, authors[0], "Tay Hohoff", 1960);
        publications[1] = new Article("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 0, 297, 2020, "Yanshuf Aezim", authors[5], "http://www.tevahadvarim.co.il/wp-content/uploads/2020/11/297_farticle_pdf_9.pdf");
        publications[2] = new Journal("Scientific American", "Springer Nature", 5, 135, 2021);
        publications[3] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 1);
        publications[4] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 102, 2021, "Alufot Eropa le-Mathematica", authors[4], "https://heb.wis-wander.weizmann.ac.il/computer-science-math/n-11335");
        publications[5] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 3);
        publications[6] = new Book("The Great Gatsby", "Charles Scribner's Sons", 1, authors[1], "Maxwell Perkins", 1925);
        publications[7] = new Journal("Teva Hadvarim", "Hahevra le-Heker Haadam ve-Hasovev ltd", 5, 297, 2020);
        publications[8] = new Encyclopedia("Encyclopedia Americana", "Scholastic Corporation", 1, "", 30);
        publications[9] = new Book("Sippur Al Ahava VeChoshech", "Houghton Mifflin Harcourt", 1, authors[2], "", 2002);
        publications[10] = new Article("Masa Hakesem Hamadaii", "Weizmann IOS", 0, 106, 2022, "AI (artificial intelligence) is upgrading", authors[3], "https://heb.wis-wander.weizmann.ac.il/science-teaching/n-11735");
        publications[11] = new Encyclopedia("Encyclopedia Britannica", "Encyclopedia Britannica, Inc.", 1, "", 2);
        publications[12] = new Journal("Nature", "Springer Nature", 5, 590, 2021);

        //סעיפים ד-ה'
        System.out.println("List of publications in the order they were entered: \n");
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null) break;  //assuming that all variables are being inputted in order.
            System.out.println(publications[i].getThis_id() + " - " + publications[i].getType_print() + publications[i].toString() + ".\n");
        }
        //

        //סעיף ו'
        Publication[] new_Sorted_Array = PublicationUtils.sort_Publications_Arr(publications);
        System.out.println("List of sorted publications: \n");
        for (Publication publication : new_Sorted_Array) {
            System.out.println(publication.getThis_id() + " - " + publication.getType_print() + publication.toString() + ".\n");
        }
        //
    }
}