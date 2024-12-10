import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o contexto matemático
        MathContext mc = new MathContext(10, RoundingMode.HALF_UP);

        // Solicitar o número de valores aleatórios a serem gerados
        System.out.print("Digite a quantidade de números aleatórios a serem gerados: ");
        int quantidade = scanner.nextInt();

        // Validar a quantidade
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        // Gerar números aleatórios e calcular a soma
        BigDecimal soma = BigDecimal.ZERO;
        System.out.println("Números gerados:");

        for (int i = 0; i < quantidade; i++) {
            double numeroAleatorio = Math.random()*1000; // Gera um número aleatório entre 0 e 1000
            BigDecimal numero = new BigDecimal(numeroAleatorio, mc);
            soma = soma.add(numero, mc);

            System.out.printf("%.0f\n",numero); // Exibe o número gerado
        }

        // Calcular a média
        BigDecimal quantidadeBD = new BigDecimal(quantidade, mc);
        BigDecimal media = soma.divide(quantidadeBD, mc);

        // Exibir a média
        System.out.printf("\nMédia dos números gerados: %.0f ", media);

        scanner.close();
    }
}