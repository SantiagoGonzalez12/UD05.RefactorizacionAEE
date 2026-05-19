package facturacion;

public class FacturacionLegacy {

    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_SOCIO = 0.05;
    private static final int TIPO_PREMIUM = 1;
    private static final int TIPO_SOCIO = 2;

    /**
     * 
     * @param importeBase Importe bruto de la factura en euros. Si es 0 o 
     *                      negativo, el método devuelve 0 sin aplicar descuentos
     * 
     * @param tipoCliente Categoría del cliente: 1 para cliente Premium,
     *                      2 para cliente Socio. 
     *                      Cualquier otro valor no tiene descuentos.
     * 
     * @param esSocioVip Si el cliente Premium es un socio VIP, obtiene un 25% 
     *                      de descuento en vez del 15% normal.
     * 
     * @return Devuelve el importe final en euros después de aplicar el descuento 
     *         correspondiente o devuelve 0 si importeBase no es positivo.
     * 
     */
    
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) return 0;
        
        if (tipoCliente == TIPO_PREMIUM && esSocioVip) return importeBase - (importeBase * DESCUENTO_VIP);
        
        if (tipoCliente == TIPO_PREMIUM) return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        
        if (tipoCliente == TIPO_SOCIO) return importeBase - (importeBase * DESCUENTO_SOCIO);
        
        return importeBase;
    }
}
