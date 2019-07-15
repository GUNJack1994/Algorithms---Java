
package pracaDomowa3;

import java.util.Objects;
 
 
public class Book implements Comparable<Book> {
   
    private String title;
    String author;
    int pages;
 
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
   
    }
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.title);
        hash = 31 * hash + Objects.hashCode(this.author);
        hash = 31 * hash + this.pages;
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.pages != other.pages) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + '}';
    }
    @Override
    public int compareTo(Book o){
        int compareTitle = title.compareTo(o.title);
       
        if (compareTitle == 0){
            return author.compareTo(o.author);
        }
        else{
            return compareTitle;
        }
    }
 
   
   
}
