public class ProcessadorTexto {
    String palavra;
    String frase;
    char letra;


    public int contar(String frase) {
        int numerodepalavras = frase.split(" ").length;
        return numerodepalavras;

    }
    public int contar(char letra, String frase) {

        char letraAlvo = letra;
        int contador = 0;

        for(int i = 0; i<frase.length(); i++) {
            if(frase.charAt(i) == letraAlvo) {
                contador++;
            }
        }
        return contador;
    }

    public int contar(String palavra, String frase) {
        String [] palavras = frase.split(" ");
        String palavraAlvo = palavra;
        int contador = 0;


        for(int i = 0; i<palavras.length; i++) {
            if(palavras[i].equals(palavraAlvo)) {
                contador++;
            }
        }
        return contador;
    }

}