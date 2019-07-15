
package pracaDomowa3;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
 
 
public class Start {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Podstawy języka Java","A",100));
        books.add(new Book("Java dla opornych","B",100));
        books.add(new Book("Podstawy języka Java","C",150));
        books.add(new Book("C# dla początkujących","B",200));
        books.add(new Book("W pustyni i w puszczy","Henryk Sienkiewicz",350));
       
        for(Book book : books){
            System.out.println(book);
        }
       
        Collections.sort(books);
       
        System.out.println("\nPosortowane naturalnie rosnąco: ");
        for (Book book : books){
            System.out.println(book.toString());
         
        }
        books.sort(new CompareBook());
        System.out.println("\nPosortowane wg. stron: ");
        System.out.println(books.toString());
       
        books.sort(new CompareBook2());
        System.out.println("\nPosorotwane wg. autora malejąco: ");
        System.out.println(books.toString());
       
        Iterator<Book> b = books.iterator();
       
        while (b.hasNext()){
            Book bo = b.next();
            if (bo.pages <= 150){
                b.remove();
            }
        }
        System.out.println("\nUsunięcie z listy wartości mniejszych niż 150: ");
        System.out.println(books);
   
    }
       
    }
