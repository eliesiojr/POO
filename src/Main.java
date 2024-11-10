import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = input.nextLine();

        System.out.println("Informe sua idade");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Informe seu endereço");
        String endereco = input.nextLine();

        pessoa p1 = new pessoa(nome, idade, endereco);

        System.out.printf("Nome: %s\nIdade: %d \nEndereço %s", p1.getNome(), p1.getIdade(), p1.getEndereço());
    }
}