public class verificarCuenta implements Runnable {

    private cuentaBancaria cb = new cuentaBancaria();


    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                cb.hacerRetiro(10);
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta está sobregirada.");

                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(verificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}