package ar.udec.tablerodecomandos.core.domain;

public class Produccion {


    private String producto;
    private double productoEnProceso;
    private double productosTerminados;
    private double productosDefectuosos;

    private Produccion(String producto, double productoEnProceso, double productosTerminados, double productosDefectuosos){

        this.producto = producto;
        this.productoEnProceso = productoEnProceso;
        this.productosTerminados = productosTerminados;
        this.productosDefectuosos = productosDefectuosos;
    }


    public static Produccion getInstance(String producto, double productoEnProceso, double productosTerminados, double productosDefectuosos){
        return new Produccion(producto, productoEnProceso, productosTerminados, productosDefectuosos);
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getProductoEnProceso() {
        return productoEnProceso;
    }

    public void setProductoEnProceso(double productoEnProceso) {
        this.productoEnProceso = productoEnProceso;
    }

    public double getProductosTerminados() {
        return productosTerminados;
    }

    public void setProductosTerminados(double productosTerminados) {
        this.productosTerminados = productosTerminados;
    }

    public double getProductosDefectuosos() {
        return productosDefectuosos;
    }

    public void setProductosDefectuosos(double productosDefectuosos) {
        this.productosDefectuosos = productosDefectuosos;
    }
}
