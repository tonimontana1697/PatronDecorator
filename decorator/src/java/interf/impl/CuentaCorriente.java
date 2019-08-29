package interf.impl;

import interf.CuentaBancaria;
import modelo.Cuenta;

public class CuentaCorriente implements CuentaBancaria {
    
    @Override
    public void abrirCuenta(Cuenta c){
        System.out.println("-------------------------");
        System.out.println("Se abrio una cuenta corriente");
        System.out.println("Cliente: " + c.getCliente());    
    }
    
}
