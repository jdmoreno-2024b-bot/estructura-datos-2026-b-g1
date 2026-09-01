public class Estudiante {
    String nombre;
    String programa;
    int semestre;

    public Estudiante(String nombre, String programa, int semestre) {
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = semestre;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " de " + programa + " y estoy en semestre " + semestre);
    }
}