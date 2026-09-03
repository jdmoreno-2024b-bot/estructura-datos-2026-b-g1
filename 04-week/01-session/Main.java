import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 5. Crear productos
        Producto p1 = new Producto("A001", "Arroz", 2500, 20);
        Producto p2 = new Producto("A002", "Aceite", 8000, 10);
        Producto p3 = new Producto("A001", "Arroz Costeño", 3000, 5); // mismo codigo que p1
        Producto p4 = new Producto("A003", "Sal"); // usa this()

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p4);

        // Comparar dos con mismo codigo
        System.out.println("\n¿p1 equals p3? " + p1.equals(p3)); // debe dar true

        // Prueba con HashSet
        Set<Producto> inventario = new HashSet<>();
        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3); // no se debe duplicar

        System.out.println("\nTamaño del HashSet: " + inventario.size()); // debe ser 2
        System.out.println("Productos en HashSet:");
        for (Producto p : inventario) {
            System.out.println(p);
        }
    }
}