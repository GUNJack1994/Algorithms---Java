
package pracaDomowa3;


import java.util.Comparator;
 
 
public class CompareBook2 implements Comparator<Book> {
 
    @Override
    public int compare(Book o1, Book o2) {
        int compareAuthor = o1.author.compareTo(o2.author);
        return compareAuthor;
    }
 
   
   
}
