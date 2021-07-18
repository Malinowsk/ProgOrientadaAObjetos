package Ejerc2;

public class EstrategiaAzar implements Estrategia {


    public EstrategiaAzar(){

    }

    @Override
    public int elegirPos(int cantColas) {
        double aux = Math.random();
        aux = aux * cantColas;
        int aux2 = (int)aux;
        return aux2;
    }
}
