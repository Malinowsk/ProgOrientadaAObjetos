package FinalDePiezas;

public class CondicionMenor implements Condicion {
    private String atributo;
    private String valor;

    public CondicionMenor(String atributo, String valor){
        this.atributo=atributo;
        this.valor=valor;
    }

    @Override
    public boolean cumple(Elemento e) {
        if (e.getAtributo(this.atributo)!=null) {
            int aux1 = Integer.parseInt(e.getAtributo(this.atributo));
            int aux2 = Integer.parseInt(this.valor);
            if (aux1 < aux2)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
