package Main;

public class AtributoSimple extends Atributo {

    Comparable valor;

    public AtributoSimple(String nombre) {
        super(nombre);
    }

    @Override
    public boolean poseeValor(Comparable c) {
        return c.compareTo(this.valor)==0;
    }

    @Override
    public void setValor(Comparable valor){
        this.valor = valor;
    }

    @Override
    public int compararValor(Comparable valor) {
        return this.valor.compareTo(valor);
    }

    @Override
    public int cantValores() {
        return 1;
    }


}
