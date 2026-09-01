public class CuentaBancaria {
    private final String id; // solo lectura
    private double saldo;    // invariante: saldo >= 0

    public CuentaBancaria(String id, double saldoInicial) {
        this.id = id;
        // validamos la invariante desde el inicio
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // solo getters, NO setter para id porque es final
    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    // operaciones de dominio, no setSaldo generico
    public boolean consignar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: monto a consignar debe ser > 0");
            return false;
        }
        this.saldo += monto;
        return true;
    }

    public boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: monto a retirar debe ser > 0");
            return false;
        }
        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente. Saldo actual: " + saldo);
            return false;
        }
        this.saldo -= monto;
        return true;
    }
}