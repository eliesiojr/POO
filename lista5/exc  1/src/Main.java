import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = input.nextDouble();
        input.nextLine();


        System.out.print("Digite o expoente: ");
        int exp = input.nextInt();
        input.nextLine();


        //potência usando Math.pow
        double result = Math.pow(base, exp);
        System.out.println("O resultado da potenciacao e " + result);

        System.out.print("Digite a base: ");
        double baseman = input.nextDouble();
        input.nextLine();


        System.out.print("Digite o expoente: ");
        int expman = input.nextInt();
        input.nextLine();

        //potencia manual
        double resultman = 1.0;
        for (int i = 0; i < expman; i++) {
            resultman *= baseman;
        }

        System.out.println("O resultado da potenciacao manual e " + resultman);
    }
}