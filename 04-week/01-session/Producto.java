import java.util.Objects;

public class Producto {
    private final String codigo; // solo lectura
    private String nombre;
    private double precio;
    private int stock;

    // 2. Constructor completo con validación
    public Producto(String codigo, String nombre, double precio, int stock) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Codigo no puede ser vacio");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("Precio no puede ser negativo");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock no puede ser negativo");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 2. Constructor que delega con this()
    public Producto(String codigo, String nombre) {
        this(codigo, nombre, 0, 0);
    }

    // Getters y Setters - codigo solo tiene get
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("Precio >= 0");
        this.precio = precio;
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock >= 0");
        this.stock = stock;
    }

    // 3. toString()
    @Override
    public String toString() {
        return "Producto{codigo='" + codigo + "', nombre='" + nombre + "', precio=" + precio + ", stock=" + stock + "}";
    }

    // 4. equals y hashCode por codigo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}