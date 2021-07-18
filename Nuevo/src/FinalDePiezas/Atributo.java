package FinalDePiezas;

import java.util.Objects;

public abstract class Atributo {

    private String nombre;

    public Atributo (String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    @Override
    public boolean equals(Object o) {
        Atributo atributo = (Atributo) o;
        return this.getNombre().equals(atributo.getNombre());
    }

    public abstract String getvalor();

}
