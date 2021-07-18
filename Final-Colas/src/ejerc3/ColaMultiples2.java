package ejerc3;

import java.util.ArrayList;

public class ColaMultiples2 implements Cola2 {

    Estrategia estrategyadd;
    Estrategia estrategyrecuperar;

    protected ArrayList<Cola2> cola = new ArrayList<Cola2>();

    public ColaMultiples2(Estrategia estrategy , Estrategia estrategy2) {
        this.estrategyadd = estrategy; this.estrategyrecuperar = estrategy2;
    }

    public void agregarCola(Cola2 c){
        cola.add(c);
    }

    @Override
    public int cantColasTerminales() {
        int aunx = 0;
        for (Cola2 i : cola){
            aunx = aunx + i.cantColasTerminales();
        }
        return aunx;
    }

    @Override
    public int cantElem() {
        int aunx = 0;
        for (Cola2 i : cola){
            aunx = aunx + i.cantElem();
        }
        return aunx;
    }

    @Override
    public ColaTerminal2 colamAx() {
        ColaTerminal2 colaMax = new ColaTerminal2();
        int aux= 0;
        for (Cola2 c : cola){
            if(c.colamAx().cantElem() > aux){
                aux = c.colamAx().cantElem();
                colaMax = c.colamAx();
            }
        }
        return colaMax;
    }

    @Override
    public Object recuperarElemento(){
        return cola.get(estrategyrecuperar.elegirPos(cola)).recuperarElemento();
    }

    @Override
    public void addElem(Object o){
        cola.get(estrategyadd.elegirPos(cola)).addElem(o);
    }

    public Estrategia getEstrategyadd() {
        return estrategyadd;
    }

    public Estrategia getEstrategyrecuperar() {
        return estrategyrecuperar;
    }

    public void setEstrategyadd(Estrategia estrategyadd) {
        this.estrategyadd = estrategyadd;
    }

    public void setEstrategyrecuperar(Estrategia estrategyrecuperar) {
        this.estrategyrecuperar = estrategyrecuperar;
    }
}
