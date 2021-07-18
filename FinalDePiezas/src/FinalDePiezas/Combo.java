package FinalDePiezas;

import java.util.ArrayList;

public class Combo extends Elemento {

    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    public Combo(String nombre) {
        super(nombre);
    }

    public void agregarElem(Elemento elem){
        elementos.add(elem);
    }

    @Override
    public Elemento restringir(Condicion cond) {
        if (cond.cumple(this)){
            Combo retorno = new Combo(this.getNombre());
            ArrayList<Atributo> atributos = this.getAtributos();
            for(Atributo a : atributos){
                retorno.agregarAtributo(a);
                }
            for(Elemento e : elementos){
                if (cond.cumple(e)){
                    retorno.agregarElem(e.restringir(cond));
                }
            }
            return retorno;
        }
        return null;
    }



    public Elemento restringir2(Condicion cond) {
            Combo retorno = new Combo(this.getNombre());
            ArrayList<Atributo> atributos = this.getAtributos();
            for(Atributo a : atributos){
                retorno.agregarAtributo(a);
            }
            for(Elemento e : elementos){
                if (cond.cumple(e)){
                    retorno.agregarElem(e.restringir(cond));
                }
            }
            if (retorno.tamanioElementos()>0)
                return retorno;
            else
                return null;
    }

    @Override
    public ArrayList<Elemento> listado(Condicion cond) {
        ArrayList<Elemento> retorno = new ArrayList<Elemento>();
        if (cond.cumple(this)){
            retorno.add(this);
        }
        else
            for (Elemento e : elementos) {
                retorno.addAll(e.listado(cond));
            }
            return retorno;
    }


    public Elemento getElementoPos(int pos){
        return elementos.get(pos-1);
    }

    public int tamanioElementos(){
        return elementos.size();
    }


}
