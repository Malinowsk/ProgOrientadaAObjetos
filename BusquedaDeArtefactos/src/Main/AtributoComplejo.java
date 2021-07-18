package Main;

import java.util.ArrayList;

public class AtributoComplejo extends Atributo {

    protected ArrayList<Comparable> valores = new ArrayList<Comparable>();

    public AtributoComplejo(String nombre) {
        super(nombre);
    }

    @Override
    public boolean poseeValor(Comparable c) {
        for (Comparable a : valores){
            if (c.compareTo(a)==0){
                return true;
            }
        }
        return false;
    }



    @Override
    public void setValor(Comparable valor){
        valores.add(valor);
    }

    @Override
    public int compararValor(Comparable valor) {
        return 0;
    }

    @Override
    public int cantValores() {
        return valores.size();
    }

    public boolean eliminarValor(Comparable v) {
        if (valores.contains(v)){
            valores.remove(v);
            return true; }
        else
            return false;
    }

}
