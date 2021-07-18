package Main.Condiciones;

import Main.Artefacto;
import Main.Atributo;

import java.util.ArrayList;

public class CondicionValorLista implements Condicion {

    private ArrayList<Comparable> valores;
    private String nombre;

    public CondicionValorLista(String nombre , ArrayList<Comparable> valores){
        this.nombre=nombre;
        this.valores=valores;
    }

    @Override
    public boolean cumple(Artefacto a) {
        if (a.getAtributo(this.nombre)!=null) {
            Atributo aux = a.getAtributo(this.nombre);
            for(Comparable c : valores){
                if (aux.poseeValor(c)){
                    return true;
                }
            }
            return false;
        }
        else
            return false;
    }

}
