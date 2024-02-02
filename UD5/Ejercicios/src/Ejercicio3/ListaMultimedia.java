package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaMultimedia {
    private ArrayList<Multimedia> lista;
    public ListaMultimedia(){
        this.lista = new ArrayList<>();
    }
    public void addItem(Multimedia item){
        lista.add(item);
    }
    public void getItems(){
        Iterator iterador = lista.iterator();
        for (Multimedia item : lista){
            if (iterador.hasNext()){
                System.out.println(iterador.next());
            }
        }
    }
    public double getDuraciones(){
        double acumulacion = 0;
        for (Multimedia item : this.lista){
            acumulacion += item.getDuracion();
        }
        return acumulacion;
    }
    public int getDiscosRock(){
        int acumulador = 0;
        for (Multimedia item : this.lista){
            if (item instanceof Disco){
                Disco disco = (Disco)item;
                if(disco.getGenero().equalsIgnoreCase("rock")){
                    acumulador +=1;
                }
            }
        }
        return acumulador;
    }

    public int getPelisSinActriz(){
        int acumulador = 0;
        for (Multimedia item : this.lista){
            if (item instanceof Pelicula){
                Pelicula peli = (Pelicula)item;
                if(peli.getActrizPrincipal() == null){
                    acumulador +=1;
                }
            }
        }
        return acumulador;
    }
}
