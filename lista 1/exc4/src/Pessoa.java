import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    String endereco;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }


    public void dados(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        this.nome = input.nextLine();

        System.out.println("Informe sua idade: ");
        this.idade = input.nextInt();
        input.nextLine();

        System.out.println("Informe seu endereço");
        this.endereco = input.nextLine();
    }

}
