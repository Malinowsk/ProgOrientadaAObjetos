package Main;

public class ColaMultipleAzar extends ColaMultiples {

    public ColaMultipleAzar(){
        super();
    }

    @Override
    public Object recuperarElemento() {
        double aux = Math.random();
        aux = aux * cola.size();
        int aux2 = (int)aux;

        return cola.get(aux2).recuperarElemento();
    }

    @Override
    public void addElem(Object o) {
        double aux = Math.random();
        aux = aux * cola.size();
        int aux2 = (int)aux;
        cola.get(aux2).addElem(o);
    }
}
