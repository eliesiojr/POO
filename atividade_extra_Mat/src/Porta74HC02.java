public class Porta74HC02 {
    private int saida1;
    private int entrada2;
    private int entrada3;
    private int saida4;
    private int entrada5;
    private int entrada6;
    private int entrada8;
    private int entrada9;
    private int saida10;
    private int entrada11;
    private int entrada12;
    private int saida13;
    private boolean led;

    public void setentrada2(int entrada2) {
        this.entrada2 = entrada2;
    }

    public void setentrada3(int entrada3) {
        this.entrada3 = entrada3;
    }
    public int getsaida1(){
        if(entrada2 == 0 && entrada3 == 0){
           return saida1 = 1;
        }else{
           return saida1 = 0;
        }

    }
    public void setentrada5(int entrada5) {
        this.entrada5 = entrada5;
    }

    public void setentrada6(int entrada6) {
        this.entrada6 = entrada6;
    }
    public int getsaida4(){
        if(entrada5 == 0 && entrada6 == 0){
            return saida4 = 1;
        }else{
            return saida4 = 0;
        }

    }

    public void led1(){
        if(saida1 != saida4){
            this.led = true;
        }else{
            this.led = false;
        }
    }

    public void mostrarled1(){
        if(led == true){
            System.out.println("Led Acesso");
        }else{
            System.out.println("Led apagado");
        }
    }
}


