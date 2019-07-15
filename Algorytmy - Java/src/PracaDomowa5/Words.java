
package PracaDomowa5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Words {
    
    
    public static void main(String[] args) {
        String word1 = "Wlazl kotek na plotek";
        System.out.println("Wlzazl kotek na plotek --> " + word1.substring(6).replace("ek", "").
                replace("plot", "most"));
        String word2 = new String("Dobry wieczor");
        System.out.println("Dobry wieczor --> " + word2.replace("obry", "zien").
                replace("wieczor", "dobry"));
        String word3 = "Zielona pilka";
        System.out.println("Zielona pilka --> " + word3.replace("ielona", "lapalem").
                replace("pilka", "pilke"));
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String word = s.nextLine().toLowerCase();
        
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ( c == 'a' || c == 'e' || 
                 c == 'i' || c == 'o' || c == 'u') {
                Integer count = map.get(c);
                
                map.put(c, (count == null ? 1 : count + 1));
                
            }
        }
        /*Integer cou = map.get(Vowel.vovel2());
        map.put(Vowel.vovel2(), cou);*/
        System.out.println(map);
        
        Map<Character, Integer> map2 = new HashMap<>();
        Integer get = map2.get(Vowel.vovel2());
        map2.put(Vowel.vovel2(), (get == null ? 1 : get + 1)
        
        );
        
    }
       
       
        
    }
    

