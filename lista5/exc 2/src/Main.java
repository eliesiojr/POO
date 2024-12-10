import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o contexto matemático com precisão e modo de arredondamento
        MathContext mc = new MathContext(10, RoundingMode.HALF_UP);


        System.out.print("Digite o primeiro valor: ");
        BigDecimal valor1 = new BigDecimal(scanner.nextLine());

        System.out.print("Digite o segundo valor: ");
        BigDecimal valor2 = new BigDecimal(scanner.nextLine());

        // Operação de soma
        BigDecimal soma = valor1.add(valor2, mc);
        System.out.println("Resultado da soma: " + soma);

        // Operação de divisão
        System.out.print("Digite o divisor: ");
        BigDecimal div = new BigDecimal(scanner.nextLine());

        if (div.compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal divisao = valor1.divide(div, mc);
            System.out.println("Resultado da divisão: " + divisao);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        scanner.close();
    }
}