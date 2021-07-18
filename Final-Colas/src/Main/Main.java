package Main;

public class Main {

    public static void main(String[] args) {

        Cola hola = new ColaTerminal();
        hola.addElem(1);
        hola.addElem(2);
        System.out.println(hola.cantElem());
        System.out.println(hola.cantElem());
        System.out.println(hola.recuperarElemento());
        System.out.println(hola.recuperarElemento());
        System.out.println(hola.cantElem());
    }

}
