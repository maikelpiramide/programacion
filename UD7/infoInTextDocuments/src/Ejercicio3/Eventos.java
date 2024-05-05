package Ejercicio3;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Eventos extends DefaultHandler {
    String leido = "";
    private int salariosTotales = 0;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("empieza a leer el documento");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("temina de leer");
        System.out.println("Salarios totales: " + this.salariosTotales + "€");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        this.leido = new String(ch,start,length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("salario"))
            this.salariosTotales += Double.parseDouble(this.leido);
    }
}
