public class gestorImpresiones {

    private char turno;

    public gestorImpresiones() {
        turno = 'a';
    }

    public synchronized void imprimirA() {
        System.out.print("A");
    }

    public synchronized void imprimirB() {
        System.out.print("BB");
    }

    public synchronized void imprimirC() {
        System.out.println("CCC");
    }

    public void imprimir(char letra) {
        if (letra == turno) {
            if (letra == 'a') {
                this.imprimirA();
                turno = 'b';
            } else {
                if (letra == 'b') {
                    this.imprimirB();
                    turno = 'c';
                } else {
                    this.imprimirC();
                    turno = 'a';
                }
            }
        }
    }
}
