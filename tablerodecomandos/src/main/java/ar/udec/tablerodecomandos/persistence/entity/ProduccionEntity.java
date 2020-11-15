package ar.udec.tablerodecomandos.persistence.entity;

import javax.persistence.*;

@Entity(name = "produccion")
public class ProduccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_produccion;

    private String producto;

    @Column(name = "producto_en_espera")
    private double productoEnProceso;

    @Column(name = "productos_terminados")
    private double productosTerminados;

    @Column(name = "productos_defectuosos")
    private double productosDefectuosos;

    public ProduccionEntity() {
    }

    public Integer getId_produccion() {
        return id_produccion;
    }

    public void setId_produccion(Integer id_produccion) {
        this.id_produccion = id_produccion;
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
