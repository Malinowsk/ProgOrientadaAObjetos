package FinalDePiezas;

import java.util.ArrayList;

public abstract class AtributoCalculado extends Atributo {

    //private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    protected Combo combo;

    public AtributoCalculado(String nombre, Combo combo) {
        super(nombre);
        this.combo=combo;
    }

    @Override
    public abstract String getvalor();

}
