public class hiloImpresor implements Runnable {

    private char letra;
    private gestorImpresiones gestor;

    public hiloImpresor(gestorImpresiones g, char l) {
        gestor = g;
        letra = l;
    }

    public void run() {
        while (true) {
            try {
                gestor.imprimir(letra);
            } catch (Exception e) {
            }
        }
    }
}