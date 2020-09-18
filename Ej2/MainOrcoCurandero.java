public class mainOrcoCurandero {

    public static void main(String[] args) {
        // TODO code application logic here

        personaje p = new personaje();

        curandero c = new curandero(p);

        orco o = new orco(p);

        Thread curandero = new Thread(c);
        Thread orco = new Thread(o);
        curandero.start();
        orco.start();
    }
}