package library;

import com.sun.source.tree.BreakTree;

public class PublicationUtils {
    public static Publication[] sort_Publications_Arr(Publication[] pub_Array) {
        int actual_Arr_Length = 0;
        for(Publication pub : pub_Array) {
            if(pub == null) break;
            actual_Arr_Length++;
        }
        Publication[][] index_Sorted_Array = new Publication[5][pub_Array.length];
        Publication[] new_Pub_Array = new Publication[actual_Arr_Length];
        int index0 = 0, index1 = 0, index2 = 0, index3 = 0, index4 = 0;
        for (int i = 0; i < actual_Arr_Length; i++) {  //sorting in an indexed array to iterate over pub_Array only once: 'B' = 0, 'J' = 1, 'A' = 2, 'E' = 3, 'P' = 4.
            if (pub_Array[i] == null) break;
            switch (pub_Array[i].getType_char()) {
                case 'B':
                    index_Sorted_Array[0][index0++] = pub_Array[i];
                    break;
                case 'J':
                    index_Sorted_Array[1][index1++] = pub_Array[i];
                    break;
                case 'A':
                    index_Sorted_Array[2][index2++] = pub_Array[i];
                    break;
                case 'E':
                    index_Sorted_Array[3][index3++] = pub_Array[i];
                    break;
                case 'P':
                    index_Sorted_Array[4][index4++] = pub_Array[i];
                    break;
            }
        }
        int new_Index = 0;
        int indexed_Length = 0;
        for (int j = 0; j < 5; j++) {
            indexed_Length = switch (j) {
                case 0 -> index0;
                case 1 -> index1;
                case 2 -> index2;
                case 3 -> index3;
                case 4 -> index4;
                default -> indexed_Length;
            };
            for (int k = 0; k < indexed_Length; k++) {
                if(index_Sorted_Array[j][k] == null) break;
                new_Pub_Array[new_Index] = index_Sorted_Array[j][k];
                new_Index++;
            }
        }
        return new_Pub_Array;
    }
    public static Publication[] add_Publication(Publication[] pub_Array, Publication publication) {
        Publication[] new_Pub_Array = new Publication[pub_Array.length + 1];
        System.arraycopy(pub_Array, 0, new_Pub_Array, 0, pub_Array.length);
        new_Pub_Array[pub_Array.length] = publication;
        publication.setQty(publication.getQty() - 1);  //removing one from the library's Publication.Qty count.
        return new_Pub_Array;
    }
}