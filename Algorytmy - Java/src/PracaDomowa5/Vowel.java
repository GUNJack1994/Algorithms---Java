
package PracaDomowa5;

import java.util.Scanner;


public class Vowel {
    static char[] vowels(){
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj Zdanie: ");
        String word = s.nextLine().toLowerCase();
        char[] b = word.toCharArray();
        
        char[] c = {};
        for (int i = 0; i < b.length; i++){
            if ((b[i] == 'a') ||
                (b[i] == 'e') ||
                (b[i] == 'i') ||
                (b[i] == 'o') ||
                (b[i] == 'u') ||
                (b[i] == 'y')){
                System.out.println(b[i]);
            }
            
        }
        return c;
       
    }
    static char vovel2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj Zdaniee: ");
        String word = s.nextLine().toLowerCase();
        char d = ' ';
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ( c == 'a' || c == 'e' || 
                 c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c);
            }
            
        }
       return d;
    }
    
}
