package Main;

import Main.Clasificadores.Clasificador;
import java.util.ArrayList;

public class PlantaFabrica {

    private ArrayList<Artefacto> artefactos = new ArrayList<>();
    private ArrayList<Clasificador> clasificadores = new ArrayList<>();


    public PlantaFabrica(){}

    public void agregarArtefacto(Artefacto a){
        for(Clasificador c : clasificadores){
            c.clasificar(a);
        }
        artefactos.add(a);
    }

}
