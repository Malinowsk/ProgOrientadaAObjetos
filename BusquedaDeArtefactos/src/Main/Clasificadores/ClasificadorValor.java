package Main.Clasificadores;

import Main.Artefacto;
import Main.Condiciones.Condicion;

public class ClasificadorValor implements Clasificador {

    private Condicion cond;
    private String nombre;
    private Comparable valor;

    public ClasificadorValor(Condicion cond ,String nombre, Comparable valor ){
        this.cond=cond;
        this.nombre=nombre;
        this.valor=valor;
    }



    @Override
    public void clasificar(Artefacto a) {
        if(cond.cumple(a)){
            a.agregarAtributo(this.nombre,this.valor);
        }
    }
}
