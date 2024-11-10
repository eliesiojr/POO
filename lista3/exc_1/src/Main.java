public class Main {
    public static void main(String[] args) {
        transporte carro = new carro();
        carro.iniciar();
        carro.parar();
        System.out.println("\n");

        transporte bicicleta = new bicicleta();
        bicicleta.iniciar();
        bicicleta.parar();
        System.out.println("\n");

        transporte aviao = new aviao();
        aviao.iniciar();
        aviao.parar();
    }
}