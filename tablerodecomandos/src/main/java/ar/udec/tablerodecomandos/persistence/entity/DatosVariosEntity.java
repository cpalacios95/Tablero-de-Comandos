package ar.udec.tablerodecomandos.persistence.entity;

import javax.persistence.*;

@Entity(name = "datosvarios")
public class DatosVariosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id_datosvarios;

    @Column(name = "gastos_comercializacion")
    private double gastosComercializacion;

    @Column(name = "ventas_totales")
    private double ventasTotales;

    @Column(name = "activo_corriente")
    private double activoCorriente;

    @Column(name = "activo_nocorriente")
    private double activoNoCorriente;

    @Column(name = "pasivo_corriente")
    private double pasivoCorriente;

    @Column(name = "pasivo_nocorriente")
    private double pasivoNoCorriente;

    private double disponibilidades;

    @Column(name = "inversiones_acortoplazo")
    private double inversionesACortoPlazo;

    @Column(name = "capital_propio")
    private double capitalPropio;

    private int anio;


    public DatosVariosEntity() {
    }

    public Integer getId_datosvarios() {
        return id_datosvarios;
    }

    public void setId_datosvarios(Integer id_datosvarios) {
        this.id_datosvarios = id_datosvarios;
    }

    public double getGastosComercializacion() {
        return gastosComercializacion;
    }

    public void setGastosComercializacion(double gastosComercializacion) {
        this.gastosComercializacion = gastosComercializacion;
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public double getActivoCorriente() {
        return activoCorriente;
    }

    public void setActivoCorriente(double activoCorriente) {
        this.activoCorriente = activoCorriente;
    }

    public double getActivoNoCorriente() {
        return activoNoCorriente;
    }

    public void setActivoNoCorriente(double activoNoCorriente) {
        this.activoNoCorriente = activoNoCorriente;
    }

    public double getPasivoCorriente() {
        return pasivoCorriente;
    }

    public void setPasivoCorriente(double pasivoCorriente) {
        this.pasivoCorriente = pasivoCorriente;
    }

    public double getPasivoNoCorriente() {
        return pasivoNoCorriente;
    }

    public void setPasivoNoCorriente(double pasivoNoCorriente) {
        this.pasivoNoCorriente = pasivoNoCorriente;
    }

    public double getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(double disponibilidades) {
        this.disponibilidades = disponibilidades;
    }

    public double getInversionesACortoPlazo() {
        return inversionesACortoPlazo;
    }

    public void setInversionesACortoPlazo(double inversionesACortoPlazo) {
        this.inversionesACortoPlazo = inversionesACortoPlazo;
    }

    public double getCapitalPropio() {
        return capitalPropio;
    }

    public void setCapitalPropio(double capitalPropio) {
        this.capitalPropio = capitalPropio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
