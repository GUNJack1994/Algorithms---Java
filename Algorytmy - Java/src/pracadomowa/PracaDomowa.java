package pracadomowa;




public class PracaDomowa {


    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.setCpu("i7-4700MQ");
        komputer.setMemory(8);
        komputer.setHdd(1000);
        komputer.setGraphic("NVIDIA GeForce GT 755M");
        komputer.setDisplay(15.6);
        
        System.out.println(komputer.getCpu());
        System.out.println(komputer.getMemory()+" "+"GB");
        System.out.println(komputer.getHdd()+" "+"GB");
        System.out.println(komputer.getGraphic());
        System.out.println(komputer.getDisplay());
    }
    
}
