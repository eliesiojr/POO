public class Main {
    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        transporte.mover();

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.mover();

        Carro carro = new Carro();
        carro.mover();

        Aviao aviao = new Aviao();
        aviao.mover();
    }
}