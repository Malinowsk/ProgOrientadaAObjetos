package Main.Condiciones;

import Main.Artefacto;

public class CondicionMayor implements Condicion {

    private Comparable valor;
    private String nombre;

    public CondicionMayor(String nombre , Comparable valor){
        this.nombre=nombre;
        this.valor=valor;
    }

    @Override
    public boolean cumple(Artefacto a) {
        if (a.getAtributo(this.nombre)!=null)
            return a.getAtributo(this.nombre).compararValor(valor)==1;
        else
            return false;
    }
}