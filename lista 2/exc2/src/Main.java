import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CRIANDO O CONTADOR
        ProcessadorTexto contador = new ProcessadorTexto();
        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma frase: \n");
        String frase = input.nextLine();

        //INICIANDO OS METODOS DO CONTADOR
        System.out.println("Total de palavras: " + contador.contar(frase));

        System.out.println("Informe uma letra especifica para ser verificada: \n");
        char letra = input.next().charAt(0);
        input.nextLine();
        System.out.println("Resultado: " + contador.contar(letra, frase));

        System.out.println("Informe uma palavra especifica  para ser analisada: \n");
        String palavra = input.nextLine();

        System.out.println("Resultado: " + contador.contar(palavra, frase));

    }

}
