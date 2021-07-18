package FinalDePiezas;

public class AtributoNElemento extends AtributoCalculado {

    private int posicion;

    public AtributoNElemento(String nombre, Combo combo, int posicion) {
        super(nombre, combo);
        this.posicion=posicion;
    }

    @Override
    public String getvalor() {
        return this.combo.getElementoPos(posicion).getAtributo(this.getNombre());
    }


}
