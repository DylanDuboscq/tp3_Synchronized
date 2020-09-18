public class Orco implements Runnable {

    private personaje persona;

    public orco(personaje p) {
        persona = p;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {          
            persona.dañar();
        try{
            Thread.sleep(1000);
        }catch(Exception e){};
    }
 }
}