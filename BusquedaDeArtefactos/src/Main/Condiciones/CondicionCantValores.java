package Main.Condiciones;

import Main.Artefacto;

public class CondicionCantValores implements Condicion {

    private int valor;
    private String nombre;

    public CondicionCantValores(String nombre , int valor){
        this.nombre=nombre;
        this.valor=valor;
    }

    @Override
    public boolean cumple(Artefacto a) {
        if (a.getAtributo(this.nombre)!=null)
            return a.getAtributo(this.nombre).cantValores()>this.valor;
        else
            return false;
    }

}
