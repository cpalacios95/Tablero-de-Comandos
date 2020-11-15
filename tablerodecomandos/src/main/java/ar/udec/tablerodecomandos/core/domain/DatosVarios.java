package ar.udec.tablerodecomandos.core.domain;

public class DatosVarios {

    private double activoTotal;//suma de activoCorriente y activoNoCorriente
    private double pasivoTotal;//suma de pasivoCorriente y pasivoNoCorriente
    private double gastosComercializacion;
    private double ventasTotales;
    private double activoCorriente;
    private double activoNoCorriente;
    private double pasivoCorriente;
    private double pasivoNoCorriente;
    private double disponibilidades;
    private double inversionesACortoPlazo;
    private double capitalPropio;
    private int anio;

    private DatosVarios(double gastosComercializacion, double ventasTotales, double activoCorriente, double activoNoCorriente,
                        double pasivoCorriente, double pasivoNoCorriente, double disponibilidades, double inversionesACortoPlazo,
                        double capitalPropio, int anio){

        this.gastosComercializacion = gastosComercializacion;
        this.ventasTotales = ventasTotales;
        this.activoCorriente = activoCorriente;
        this.activoNoCorriente = activoNoCorriente;
        this.pasivoCorriente = pasivoCorriente;
        this.pasivoNoCorriente = pasivoNoCorriente;
        this.disponibilidades = disponibilidades;
        this.inversionesACortoPlazo = inversionesACortoPlazo;
        this.capitalPropio = capitalPropio;
        this.anio = anio;
    }

    public static DatosVarios getInstance(double gastosComercializacion, double ventasTotales, double activoCorriente, double activoNoCorriente,
                                          double pasivoCorriente, double pasivoNoCorriente, double disponibilidades, double inversionesACortoPlazo,
                                          double capitalPropio, int anio){
        return new DatosVarios(gastosComercializacion, ventasTotales, activoCorriente, activoNoCorriente, pasivoCorriente, pasivoNoCorriente, disponibilidades, inversionesACortoPlazo, capitalPropio, anio);
    }

    public double getActivoTotal() {
        return activoTotal;
    }

    public void setActivoTotal(double activoTotal) {
        this.activoTotal = activoTotal;
    }

    public double getPasivoTotal() {
        return pasivoTotal;
    }

    public void setPasivoTotal(double pasivoTotal) {
        this.pasivoTotal = pasivoTotal;
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
