import java.util.Scanner;

public class FuncionarioMensalista implements Funcionario {
    private double valorHora;
    private int horas;
    private double salarioMensal;

    Scanner input = new Scanner(System.in);

    public void dados(){System.out.println("Informe quantas horas foram trabalhadas: ");
        this.horas = input.nextInt();
        input.nextLine();

        System.out.println("Informe o valor da sua hora trabalhada: ");
        this.valorHora = input.nextDouble();

    }
    @Override
    public void calcularSalario() {
        salarioMensal = valorHora * horas;

    }

    @Override
    public void getDetalhes() {
        input.nextLine();
        System.out.printf("Você trabalhou %d horas, sendo R$%.2f o valor de sua hora, assim seu Salario Mensal foi de R$%.2f", horas, valorHora, salarioMensal);

    }
}
