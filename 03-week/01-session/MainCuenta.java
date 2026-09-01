public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-Juan", 100.0);
        System.out.println("Cuenta " + cuenta.getId() + " - Saldo inicial: " + cuenta.getSaldo());

        System.out.println("\n--- Intentando violar la invariante ---");
        
        // Intento 1: consignar negativo
        System.out.println("Intento consignar -50:");
        cuenta.consignar(-50);
        System.out.println("Saldo sigue siendo: " + cuenta.getSaldo()); // debe seguir en 100

        // Intento 2: retirar mas de lo que hay
        System.out.println("\nIntento retirar 500 (mas que el saldo):");
        cuenta.retirar(500);
        System.out.println("Saldo sigue siendo: " + cuenta.getSaldo()); // debe seguir en 100

        // Intento 3: retirar negativo
        System.out.println("\nIntento retirar -20:");
        cuenta.retirar(-20);
        System.out.println("Saldo sigue siendo: " + cuenta.getSaldo());

        System.out.println("\n--- Operaciones validas ---");
        cuenta.consignar(50);
        System.out.println("Consigne 50, saldo ahora: " + cuenta.getSaldo());
        
        cuenta.retirar(30);
        System.out.println("Retire 30, saldo ahora: " + cuenta.getSaldo());

        System.out.println("\nINVARIANTE NUNCA SE VIOLO: saldo >= 0 siempre -> " + cuenta.getSaldo());
        
        // Esto NO compila, por eso id es de solo lectura:
        // cuenta.id = "otro";
        // cuenta.saldo = -1000; // no se puede porque es private
    }
}