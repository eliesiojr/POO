public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.dados();

        System.out.printf("Seu nome é: %s \nVoce tem: %d anos \nVoce mora no endereco: %s"
                ,pessoa.getNome(), pessoa.getIdade(), pessoa.getEndereco());

    }
}