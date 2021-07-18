package Main.Condiciones;

import Main.Artefacto;

public class CondicionValor implements Condicion {

    private Comparable valor;
    private String nombre;

    public CondicionValor(String nombre , Comparable valor){
        this.nombre=nombre;
        this.valor=valor;
    }

    @Override
    public boolean cumple(Artefacto a) {
        if (a.getAtributo(this.nombre)!=null)
            return a.getAtributo(this.nombre).poseeValor(this.valor);
        else
            return false;
    }
}
