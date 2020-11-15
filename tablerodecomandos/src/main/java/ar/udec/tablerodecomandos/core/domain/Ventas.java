package ar.udec.tablerodecomandos.core.domain;

public class Ventas {


    private String mes;
    private String cliente;
    private double importe;
    private double contado;
    private double credito;
    private String medio;
    private String destino;

    private Ventas(String mes, String cliente, double importe, double contado, double credito, String medio, String destino){
        this.mes = mes;
        this.cliente = cliente;
        this.importe = importe;
        this.contado = contado;
        this.credito = credito;
        this.medio = medio;
        this.destino = destino;
    }

    public static Ventas getInstance(String mes, String cliente, double importe, double contado, double credito, String medio, String destino){
        return new Ventas(mes, cliente, importe, contado, credito, medio, destino);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getContado() {
        return contado;
    }

    public void setContado(double contado) {
        this.contado = contado;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
