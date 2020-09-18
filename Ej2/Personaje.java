public class Personaje {
    private int vida = 10;
    
    public synchronized int getVida(){
        return vida;
    }
    
    public synchronized void dañar(){
        vida = vida-3;
        if(vida < 0){
            vida = 0;
        }
        System.out.println(vida);
    }
    
    public synchronized void curar(){
        if(vida >= 10){
            vida = 10;
        }else{
        vida = vida+3;
    }
        System.out.println(vida);
 }
}