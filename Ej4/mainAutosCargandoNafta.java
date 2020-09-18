public class mainAutosCargandoNafta {

    public static void main(String[] args) {
        Reserva r = new Reserva();
        Auto car1 = new Auto(r);
        Auto car2 = new Auto(r);
        Auto car3 = new Auto(r);
        Auto car4 = new Auto(r);
        Auto car5 = new Auto(r);
        Thread a1 = new Thread(car1, "rojo");
        Thread a2 = new Thread(car2, "azul");
        Thread a3 = new Thread(car3, "amarillo");
        Thread a4 = new Thread(car4, "verde");
        Thread a5 = new Thread(car5, "naranja");
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
    
}
