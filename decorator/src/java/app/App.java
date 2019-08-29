package app;

import decorador.BlindajeDecorador;
import interf.CuentaBancaria;
import interf.impl.CuentaAhorro;
import modelo.Cuenta;

public class App {
    
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "Anthony");
        
        CuentaBancaria cuenta = new CuentaAhorro();
        CuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
               
        cuentaBlindada.abrirCuenta(c);
    }
    
}
