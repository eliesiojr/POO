import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    String AnoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void dadosLivro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o titulo do livro:");
        this.titulo = input.nextLine();

        System.out.println("Informe a autor do livro:");
        this.autor = input.nextLine();

        System.out.println("Informe a ano cujo o livro foi publicado:");
        this.AnoPublicacao = input.nextLine();
    }

}
