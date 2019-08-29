package decorador;

import interf.CuentaBancaria;
import modelo.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {
    
    public BlindajeDecorador(CuentaBancaria cuentaDecorada) {
        super(cuentaDecorada);
    }
    
    @Override
    public void abrirCuenta(Cuenta c) {
        cuentaDecorada.abrirCuenta(c);
        agregarBlindaje(c);
    }
    
    public void agregarBlindaje(Cuenta c) {
        System.out.println("Se agrego blindaje a la cuenta " + c.getCliente());
    }
}
