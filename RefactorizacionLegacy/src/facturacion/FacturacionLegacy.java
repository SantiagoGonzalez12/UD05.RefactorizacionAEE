package facturacion;

public class FacturacionLegacy {

    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_SOCIO = 0.05;
    private static final int TIPO_PREMIUM = 1;
    private static final int TIPO_SOCIO = 2;

    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) return 0;
        
        if (tipoCliente == TIPO_PREMIUM && esSocioVip) return importeBase - (importeBase * DESCUENTO_VIP);
        
        if (tipoCliente == TIPO_PREMIUM) return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        
        if (tipoCliente == TIPO_SOCIO) return importeBase - (importeBase * DESCUENTO_SOCIO);
        
        return importeBase;
    }
}
