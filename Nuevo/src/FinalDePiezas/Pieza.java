package FinalDePiezas;

import java.util.ArrayList;

public class Pieza extends Elemento {


    public Pieza(String nombre) {
        super(nombre);
    }

    @Override
    public Elemento restringir(Condicion cond) {    // getcopia , devulve el null
        if (cond.cumple(this)) {
            Pieza retorno = new Pieza(this.getNombre());
            ArrayList<Atributo> atributos = this.getAtributos();
            for(Atributo a : atributos){
                retorno.agregarAtributo(a);
            }
            return retorno;
        }
        else
            return null;
    }

    @Override
    public ArrayList<Elemento> listado(Condicion cond) {   // no devolver null, sino la lista vacia
        ArrayList<Elemento> retorno = new ArrayList<Elemento>();
        if (cond.cumple(this)){
            retorno.add(this);
        }
        return retorno;
    }


}
