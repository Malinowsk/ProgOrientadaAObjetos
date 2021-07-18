package FinalDePiezas;

public class CondicionValor implements Condicion {
    private String atributo;
    private String valor;

    public CondicionValor(String atributo, String valor){
        this.atributo=atributo;
        this.valor=valor;
    }

    @Override
    public boolean cumple(Elemento e) {
        if (e.getAtributo(this.atributo)!=null) {
            return e.getAtributo(this.atributo).equals(this.valor);
        }
        else
            return false;
    }
}
