public class Cliente implements Runnable{

    public void run() {
        System.out.println("soy" + Thread.currentThread().getName());
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        };

    }