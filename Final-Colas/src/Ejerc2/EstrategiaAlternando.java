package Ejerc2;

public class EstrategiaAlternando implements Estrategia {

    int contador;

    public EstrategiaAlternando(){
        contador=0;
    }

    @Override
    public int elegirPos(int cantColas) {
        if (contador < cantColas){
            int cont = contador;
            contador++;
            return cont;
        }
        else {
            contador = 0;
            return contador;
        }
    }
}
