public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.dadosLivro();

        System.out.printf("Titulo: %s \nAutor: %s \nAno de Publicacao: %s", livro.getTitulo(), livro.getAutor(), livro.getAnoPublicacao());
    }
}