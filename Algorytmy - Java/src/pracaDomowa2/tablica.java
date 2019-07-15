
package pracaDomowa2;

import java.util.Random;



public class tablica {
    
    public static void main(String[] args) {
        Random r = new Random();
        int a = 100;
        int b = 1000;
        double[] table = new double[10];
        double[] table2 = new double[10];
        double sum = 0;
        for (int i = 0;i < table.length;i++){
            table[i] = r.nextInt(b-a+1)+a;
            
            System.out.println("Wylosowana liczba: "+table[i]);
        }
        for(double i:table)
            sum+=i;
        System.out.println("Suma: " + sum);
        System.out.println("Średnia: " + sum/10);
        table2 = table;
        for (int i = 0;i < table2.length;i++){
            if (table2[i] >= 500){
                System.out.println("Liczby większe od 500: " + table2[i]);  
            }
                
                
                
            
            
        }
        
    }
    
}
