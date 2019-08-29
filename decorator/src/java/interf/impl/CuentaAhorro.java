package interf.impl;

import interf.CuentaBancaria;
import modelo.Cuenta;

public class CuentaAhorro implements CuentaBancaria {
    
    @Override
    public void abrirCuenta(Cuenta c){
        System.out.println("-------------------------");
        System.out.println("Se abrio una cuenta ahorro");
        System.out.println("Cliente: " + c.getCliente());    
    }
    
}
