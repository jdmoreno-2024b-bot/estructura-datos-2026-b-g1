public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Anos de Soledad", "Garcia Marquez", 432);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupery", 96);

        libro1.describir();
        System.out.println("Es largo? " + libro1.esLargo());
        libro2.describir();
        System.out.println("Es largo? " + libro2.esLargo());

        Libro otro = libro1;
        otro.titulo = "TITULO CAMBIADO";
        System.out.println("libro1 ahora es: " + libro1.titulo);
    }
}