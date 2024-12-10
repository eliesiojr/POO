import java.util.Scanner;

public class FuncionarioHorista implements Funcionario {
    private double salario;
    private int horas;
    private double salarioHora;

    Scanner input = new Scanner(System.in);
    public void dados(){
        System.out.println("Informe quantas horas foram trabalhadas: ");
        this.horas = input.nextInt();
        input.nextLine();

        System.out.println("Informe seu Salario");
        this.salario = input.nextDouble();
        input.nextLine();
    }

    @Override
    public void calcularSalario() {
        this.salarioHora = salario / horas;

    }

    @Override
    public void getDetalhes() {
        System.out.printf("Seu salario é de %.2f, trabalhando %d horas no més, sendo seu Salario por hora %.2f", salario, horas, salarioHora);

    }
}
