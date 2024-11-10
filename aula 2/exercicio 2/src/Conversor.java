public class Conversor {
    public int converter(int metros){
        return metros/100;
    }
    public double converter(double celsius){
        return celsius * 9/5 + 32;
    }
    public double converter(double valor, String unidade){
        if(unidade.equals("USD")){
            return valor = valor/5.76;
        }else if(unidade.equals("EUR")){
            return valor = valor/6.23;
        }
        return valor;
    }
}
