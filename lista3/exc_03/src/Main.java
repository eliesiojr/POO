import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                [1] Funcionario Mensalista
                [2] Funcionario Horista
                """);
        int opção = input.nextInt();
        input.nextLine();

        switch (opção){
            case 1:
                FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
                funcionarioMensalista.dados();
                funcionarioMensalista.calcularSalario();
                funcionarioMensalista.getDetalhes();
                break;
            case 2:
                FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
                funcionarioHorista.dados();
                funcionarioHorista.calcularSalario();
                funcionarioHorista.getDetalhes();
        }
    }
}