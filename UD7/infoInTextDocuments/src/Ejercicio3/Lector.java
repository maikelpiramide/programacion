package Ejercicio3;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class Lector {
    private File fichero;


    Lector(String fichero){
        this.fichero = new File(fichero);

    }
    public void leerFichero(){
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try{
            SAXParser sp = spf.newSAXParser();

            sp.parse(this.fichero,new Eventos());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
