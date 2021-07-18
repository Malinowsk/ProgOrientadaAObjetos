package FinalDePiezas;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Elemento {


    protected ArrayList<Atributo> atributos = new ArrayList<Atributo>();
    private String nombre;

    public Elemento(String nombre){
        this.nombre=nombre;
    }


    public String getNombre(){
        return this.nombre;
    }

    public void agregarAtributo(Atributo atributo){
        if (!atributos.contains(atributo)){
            atributos.add(atributo);
        }
    }

    public String getAtributo(String nombre){
        for(Atributo a : atributos){
            if(a.getNombre().equals(nombre)){
                return a.getvalor();
            }
        }
        return null;
    }

    public ArrayList<Atributo> getAtributos (){

        return (ArrayList<Atributo>) Collections.unmodifiableList(this.atributos);
    }

    public abstract Elemento restringir(Condicion cond);

    public abstract ArrayList<Elemento> listado(Condicion cond);



}
