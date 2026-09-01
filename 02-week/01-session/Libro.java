public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void describir() {
        System.out.println(titulo + " de " + autor + " con " + paginas + " paginas");
    }

    public boolean esLargo() {
        return paginas > 300;
    }
}