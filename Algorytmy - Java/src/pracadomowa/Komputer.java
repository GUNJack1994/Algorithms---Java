
 
package pracadomowa;


public class Komputer {
   private String cpu;
   private int memory;
   private int hdd;
   private String graphic;
   private double display;
   
   
   public void setCpu(String cpu){
       this.cpu = cpu;
   }
   public String getCpu(){
       return this.cpu;
   }
   public void setMemory(int memory){
       if(memory >= 4){
           this.memory = memory;    
       }
       else{
           System.out.println("Mniej niż 4 GB RAM nie sprzedajemy!!!");
       }
   }
   public int getMemory(){
       return this.memory;
   }
   public void setHdd(int hdd){
       if(hdd >=125){
           this.hdd = hdd;
       }
       else{
           System.out.println("Mniej niż 125 GB nie sprzedajemy!!!");
       }
   }
   public int getHdd(){
       return this.hdd;
   }
   public void setGraphic(String graphic){
       this.graphic = graphic;
   }
   public String getGraphic(){
       return this.graphic;
   }
   public void setDisplay(double display){
       if(display >= 13 && display <=18)
           this.display = display;
       else{
           System.out.println("Dostępne są jedynie ekrany z przedziału od 13"
                   +" "+"do 18 cali");
       }
   }
   public double getDisplay(){
       return this.display;
   }
   Komputer(){
       System.out.println("Dokonałeś zakupu: ");
   }
}
