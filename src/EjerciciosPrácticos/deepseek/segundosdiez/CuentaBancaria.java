package EjerciciosPrácticos.deepseek.segundosdiez;

/*
  Crea una clase `CuentaBancaria` con saldo, titular y un historial de movimientos. Permite depositar y retirar
  validando saldo suficiente, y guarda cada movimiento en un `ArrayList<String>`.
 */

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private double saldo;
    private final String TITULAR;
    List<String> movimientos = new ArrayList<>();
    private int movimientoID = 0;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.TITULAR = titular;
    }

    public void consultarSaldo() {
        System.out.println("Su saldo es de " + saldo);
        registrarMovimiento("Consultar saldo");
    }

    public void depositarSaldo(double saldo) {
        this.saldo += saldo;
        registrarMovimiento("Depositar saldo: " + saldo);
    }
    public void retirarSaldo(double saldo) {
        if (saldo > this.saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        this.saldo -= saldo;
        registrarMovimiento("Retirar saldo: " + saldo);
    }

    private void registrarMovimiento(String movimiento) {
        movimientos.add(movimiento + " --> #" + String.valueOf(movimientoID));
        ++movimientoID;
    }

    public void consultarMovimientos() {
        System.out.println(movimientos);
    }
}
