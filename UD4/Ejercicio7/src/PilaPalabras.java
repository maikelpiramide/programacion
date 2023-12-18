import java.util.ArrayList;

public class PilaPalabras {
    ArrayList<String> palabras;

    public PilaPalabras(){
        this.palabras = new ArrayList<String>();
    }

    public void apilarPalabra(String palabra){
        this.palabras.add(palabra);
    }
    public void desapilarPalabra(){
        int pop = this.palabras.size();
        String remove = this.palabras.remove(pop-1);
        System.out.println(remove);
    }
    public void obtenerPalabraCima(){
        int index = this.palabras.size();
        String content = this.palabras.get(index-1);
        System.out.println(content);
    }
    public void pilaPalabrasVacia(){
        if(this.palabras.isEmpty()){
            System.out.println("La pila de palabras está vacía");
        }
        else{
            System.out.println("La pila de palabras no está vacía");
        }
    }
}
