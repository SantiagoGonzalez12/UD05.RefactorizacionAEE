package facturacion;

public class FacturacionLegacy {

    private static final double DESCUENTO_VIP      = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_SOCIO    = 0.05;
    private static final int    TIPO_PREMIUM       = 1;
    private static final int    TIPO_SOCIO         = 2;

    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase > 0) {
            if (tipoCliente == TIPO_PREMIUM) {
                if (esSocioVip == true) return importeBase - (importeBase * DESCUENTO_VIP);
                else return importeBase - (importeBase * DESCUENTO_ESTANDAR);
            } else {
                if (tipoCliente == TIPO_SOCIO) {
                    return importeBase - (importeBase * DESCUENTO_SOCIO);
                } else {
                    return importeBase;
                }
            }
        } else {
            return 0;
        }
    }
}
