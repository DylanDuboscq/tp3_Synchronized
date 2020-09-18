public class NewMain {

    public static void main(String[] args) {
        verificarCuenta vc = new verificarCuenta();
        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");
        Luis.start();
        Manuel.start();
    }

}