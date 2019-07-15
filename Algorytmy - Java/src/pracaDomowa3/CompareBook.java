
package pracaDomowa3;

import java.util.Comparator;
 
 
public class CompareBook implements Comparator<Book> {
 
   
 
    @Override
    public int compare(Book o1, Book o2) {
        int a = o2.pages - o1.pages;
        if (a == 0){
            a = o1.author.compareTo(o2.author);
        }
       
            return a;
       
    }
 
   
}
