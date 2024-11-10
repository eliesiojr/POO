public class Main {
    public static void main(String[] args){
        Conversor conversor = new Conversor();
        System.out.println(conversor.converter(5));
        System.out.println(conversor.converter(10.0));
        System.out.println(conversor.converter(10.0, "EUR"));
    }
}