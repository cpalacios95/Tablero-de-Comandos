package ar.udec.tablerodecomandos.controller.dtomodel;


import com.fasterxml.jackson.annotation.JsonProperty;

public class VentasDTO {

    @JsonProperty
    private String mes;
    @JsonProperty
    private String cliente;
    @JsonProperty
    private double importe;
    @JsonProperty
    private double contado;
    @JsonProperty
    private double credito;
    @JsonProperty
    private String medio;
    @JsonProperty
    private String destino;

    public VentasDTO(String mes, String cliente, double importe, double contado, double credito, String medio, String destino) {
        this.mes = mes;
        this.cliente = cliente;
        this.importe = importe;
        this.contado = contado;
        this.credito = credito;
        this.medio = medio;
        this.destino = destino;
    }

    public String getMes() {
        return mes;
    }

    public String getCliente() {
        return cliente;
    }

    public double getImporte() {
        return importe;
    }

    public double getContado() {
        return contado;
    }

    public double getCredito() {
        return credito;
    }

    public String getMedio() {
        return medio;
    }

    public String getDestino() {
        return destino;
    }
}
