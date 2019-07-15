
package pracaDomowa4;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;



    public class Start{
        public static void main(String[] args) {
            
            Map<String, Integer> map1 = new HashMap<>();            
            map1.put("R", 1);            
            map1.put("A", 1);                        
            map1.put("D", 1);                        
            map1.put("I", 1);            
            map1.put("O", 1);
            
            Map<String, Integer> map2 = new HashMap<>();
            map2.put("R", 2);
            map2.put("A", 2);
            map2.put("D", 2);
            map2.put("I", 2);
            map2.put("O", 2);
            
            Map<String, Integer> map3 = new HashMap<>();
            map3.put("R", 3);
            map3.put("A", 3);
            map3.put("D", 3);
            map3.put("I", 3);
            map3.put("O", 3);
            try{
            Scanner s = new Scanner(System.in);
            System.out.println("Podaj jedną z liter: R,A,D,I,O: ");
            
            String letter = s.nextLine();
            System.out.println("Podaj liczbę od 1 do 3: ");
            int value = s.nextInt();
            
            if (!map1.containsKey(letter)){
                System.out.println("Nie ma takiej litery!");
                return;
            }
            
            
            if("R".equals(letter) && value == 1){
            if (map1.containsKey(letter) && map1.containsValue(value)){
                System.out.println("Brawo wygrałeś 15 zł!!!");
            }
 
            
            }
      
            if("A".equals(letter) && value == 1){
            if (map1.containsKey(letter) && map1.containsValue(value)){
                System.out.println("Brawo wygrałeś 50 zł!!!");
            }
            
            
            }
            
            if("D".equals(letter) && value == 1){
            if (map1.containsKey(letter) && map1.containsValue(value)){
                System.out.println("Brawo wygrałeś 70 zł!!!");
            }
            
            
            }
            
            if("I".equals(letter) && value == 1){
            if (map1.containsKey(letter) && map1.containsValue(value)){
                System.out.println("Brawo wygrałeś 30 zł!!!");
            }
            
            
            }
            
            if("O".equals(letter) && value == 1){
            if (map1.containsKey(letter) && map1.containsValue(value)){
                System.out.println("Brawo wygrałeś 60 zł!!!");
            }
            
            
            }
            
            
            
            if("R".equals(letter) && value == 2){
            if (map2.containsKey(letter) && map2.containsValue(value)){
                System.out.println("Brawo wygrałeś 10 zł!!!");
            }
            
            
            }
            if("A".equals(letter) && value == 2){
            if (map2.containsKey(letter) && map2.containsValue(value)){
                System.out.println("Brawo wygrałeś 75 zł!!!");
            }
            
            
            }
            if("D".equals(letter) && value == 2){
            if (map2.containsKey(letter) && map2.containsValue(value)){
                System.out.println("Brawo wygrałeś 95 zł!!!");
            }
            
            
            }
            if("I".equals(letter) && value == 2){
            if (map2.containsKey(letter) && map2.containsValue(value)){
                System.out.println("Brawo wygrałeś 1 zł!!!");
            }
            
            
            }
            if("O".equals(letter) && value == 2){
            if (map2.containsKey(letter) && map2.containsValue(value)){
                System.out.println("Brawo wygrałeś 25 zł!!!");
            }
            
            
            }
            
            
            if("R".equals(letter) && value == 3){
            if (map3.containsKey(letter) && map3.containsValue(value)){
                System.out.println("Brawo wygrałeś 2 zł!!!");
            }
            
            
            }
            if("A".equals(letter) && value == 3){
            if (map3.containsKey(letter) && map3.containsValue(value)){
                System.out.println("Brawo wygrałeś 99 zł!!!");
            }
            
            
            }
            if("D".equals(letter) && value == 3){
            if (map3.containsKey(letter) && map3.containsValue(value)){
                System.out.println("Brawo wygrałeś 100 zł!!!");
            }
            
            
            }
            if("I".equals(letter) && value == 3){
            if (map3.containsKey(letter) && map3.containsValue(value)){
                System.out.println("Brawo wygrałeś 72 zł!!!");
            }
            
            
            }
            if("O".equals(letter) && value == 3){
            if (map3.containsKey(letter) && map3.containsValue(value)){
                System.out.println("Brawo wygrałeś 49 zł!!!");
            }
            
            
            }
            }catch(InputMismatchException e){
                System.err.println("Podana wartość musi być liczbą całkowitą: " + e);
            }catch(Exception e){
                System.err.println("Błąd" + e);
            }
                
            
           
      }
            
        }
            
            
            
            
            
            
        

    
    
    
    

