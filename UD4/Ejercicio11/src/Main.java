/*Una empresa monta una competición para centros educativos de FP. Necesita hacer las inscripciones y quiere asegurarse de que:

        - Ningún equipo se inscribe más de una vez en la competición

        - Ningún alumno se mete más de una vez en un equipo

        La información de un alumno es su centro educativo, su DNI, su nombre y su apellido.

        La información de un equipo es el nombre del equipo, el e-mail del responsable y los miembros que lo componen.

        El programa debe mostrar todos los equipos inscritos hasta el momento ordenados según el orden alfabético del nombre de equipo.*/

public class Main {
    public static void main(String[] args) {
        Competicion competi = new Competicion("competiPrueba");
        Centro centro01 = new Centro("IES Piramide");
        Alumno alu01 = new Alumno(centro01,"123456789D","pedro","pedro");
        Alumno alu02 = new Alumno(centro01,"123556789D","albaro","albaro");
        Alumno alu03 = new Alumno(centro01,"987654321Q","pepa","pepa");
        Equipo equipo01 = new Equipo("equipo01","elu@alu.com");
        Equipo equipo02 = new Equipo("equipo02","asdf@asdf.com");
        Equipo equipo03 = new Equipo("equipo03","asdf@asdf.com");

        System.out.println();
        System.out.println("equipos de la competi");

        competi.addParticipante(alu01,equipo01);
        competi.addParticipante(alu02,equipo01);
        competi.addParticipante(alu03,equipo03);

        competi.verSize();

        competi.verParticipante(alu01);
        System.out.println();
        System.out.println("pruebas");
        competi.pruebas();

    }
}