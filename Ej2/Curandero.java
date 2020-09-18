public class Curandero implements Runnable {

    private personaje persona;

    public curandero(personaje p) {
        persona = p;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            persona.curar();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            };
        }
    }
}