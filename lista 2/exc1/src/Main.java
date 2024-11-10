public class Main {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcular(5, 10));
        System.out.println(calculadora.calcular(15.0));
        System.out.println(calculadora.calcular(5.0, 3.0));
    }
}