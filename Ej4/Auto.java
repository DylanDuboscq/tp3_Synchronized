public class Auto implements Runnable {

    private String patente;
    private String modelo;
    private String marca;
    private String kmFaltantesService;
    private Reserva reserva;

    public Auto(Reserva r) {
        reserva = r;
    }

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " está manejando");
            try {
                Thread.sleep((long) Math.random() * 1000);
                reserva.cargarNafta();
            } catch (Exception e) {
            }
        }
    }
}