package Main;

import java.util.Objects;

public abstract class Atributo {

    private String nombre ;

    public Atributo (String nombre){
        this.nombre=nombre;
    }

    @Override
    public boolean equals (Object o){
        Atributo aux = (Atributo) o;
        return this.nombre.equals(aux.getNombre());
    }


    public String getNombre(){
        return  this.nombre;
    }

    public abstract boolean poseeValor(Comparable c);

    public abstract void setValor(Comparable valor);

    public abstract int compararValor(Comparable valor);

    public abstract int cantValores();
}
