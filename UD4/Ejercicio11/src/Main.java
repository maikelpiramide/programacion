/*Una empresa monta una competición para centros educativos de FP. Necesita hacer las inscripciones y quiere asegurarse de que:

        - Ningún equipo se inscribe más de una vez en la competición

        - Ningún alumno se mete más de una vez en un equipo

        La información de un alumno es su centro educativo, su DNI, su nombre y su apellido.

        La información de un equipo es el nombre del equipo, el e-mail del responsable y los miembros que lo componen.

        El programa debe mostrar todos los equipos inscritos hasta el momento ordenados según el orden alfabético del nombre de equipo.*/

public class Main {
    public static void main(String[] args) {
        Centro centro01 = new Centro("IES Piramide");
        Alumno alu01 = new Alumno(centro01,"123456789D","pedro","pica piedra");
        Alumno alu02 = new Alumno(centro01,"123456789D","albaro","pica piedra");
        Alumno alu03 = new Alumno(centro01,"987654321Q","pedro","pica piedra");
        Equipo equipo01 = new Equipo("prueba","elu@alu.com");
        equipo01.addAlumno(alu01);
        equipo01.addAlumno(alu02);
        equipo01.addAlumno(alu03);

        equipo01.verEquipo();

    }
}