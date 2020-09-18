public class Reserva {

    public synchronized void cargarNafta() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " está cargando nafta");
        Thread.sleep((long) (Math.random() * 1000));
        System.out.println(Thread.currentThread().getName() + " cargó nafta");
    }
}