package FinalDePiezas;

public class AtributoSimple extends Atributo {

    private String valor;

    public AtributoSimple(String nombre, String valor) {
        super(nombre);
        this.valor=valor;
    }

    @Override
    public String getvalor() {
        return this.valor;
    }

}
