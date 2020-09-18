public class cuentaBancaria {

    private int balance = 50;

    public cuentaBancaria() {
    }

    public int getBalance() {
        return balance;
    }

    private void retiroBancario(int retiro) {
        balance = balance - retiro;
    }

    public synchronized void hacerRetiro(int cantidad) throws InterruptedException {
        if (this.balance >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " está realizando un retiro de: " + cantidad + ".");
            Thread.sleep(1000);
            this.retiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + ":Retiro realizado.");
            System.out.println(Thread.currentThread().getName() + ": Los fondos son de: " + this.balance);
        } else {
            System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr." + Thread.currentThread().getName());
            System.out.println("Su saldo actual es de "+ this.balance);
            Thread.sleep(1000);
        }
    }
}