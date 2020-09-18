public class mainABBCCC {

    public static void main(String[] args) {
        gestorImpresiones gestor = new gestorImpresiones();
        hiloImpresor hA = new hiloImpresor(gestor, 'a');
        hiloImpresor hB = new hiloImpresor(gestor, 'b');
        hiloImpresor hC = new hiloImpresor(gestor, 'c');
        Thread A = new Thread(hA);
        Thread B = new Thread(hB);
        Thread C = new Thread(hC);
        A.start();
        B.start();
        C.start();
    }

}
