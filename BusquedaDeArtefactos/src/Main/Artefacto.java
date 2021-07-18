package Main;

import java.util.ArrayList;

public class Artefacto {

    protected ArrayList<Atributo> atributos = new ArrayList<Atributo> ();

    public Artefacto(){} // constructor

    public void agregarAtributo(Atributo a){
        if(this.atributos.contains(a)){
           this.atributos.remove(a);
        }
        this.atributos.add(a);
    }


    public void agregarAtributo(String nombre, Comparable valor){
        Atributo a = new AtributoSimple(nombre);
        a.setValor(valor);
        if(this.atributos.contains(a)){
            this.atributos.get(atributos.indexOf(a)).setValor(valor);
        }
        this.atributos.add(a);
    }

    public Atributo getAtributo(String nombre){
        for(Atributo a : atributos){
            if(nombre.equals(a.getNombre())){
                return a;
            }
        }
        return null;
    }

}
