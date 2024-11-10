public class ProcessadorTexto {
    String texto;

    public ProcessadorTexto(String texto) {
        this.texto = texto;
    }
    public int contador(){
        return texto.split("\\s+").length;
    }
    public int contador(String texto, String letra){
        cont = 0;
        texto = texto.toLowerCase();
        if(texto.split().equals(letra)) {
            cont ++;
        }
        return cont;
    }
}