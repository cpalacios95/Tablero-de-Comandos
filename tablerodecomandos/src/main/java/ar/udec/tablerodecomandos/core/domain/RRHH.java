package ar.udec.tablerodecomandos.core.domain;

import java.time.LocalDate;

public class RRHH {


    private String nombreEmpleado;
    private String departamento;
    private String puesto;
    private double salario;
    private int faltas;
    private int cursosDeCapacitacion;
    private double horasExtras;
    private int despidos;
    private LocalDate fecha;
    private String genero;

    private RRHH(String nombreEmpleado, String departamento, String puesto, double salario, int faltas,
                int cursosDeCapacitacion, double horasExtras, int despidos, LocalDate fecha, String genero){

        this.nombreEmpleado = nombreEmpleado;
        this.departamento = departamento;
        this.puesto = puesto;
        this.salario = salario;
        this.faltas = faltas;
        this.cursosDeCapacitacion = cursosDeCapacitacion;
        this.horasExtras = horasExtras;
        this.despidos = despidos;
        this.fecha = fecha;
        this.genero = genero;
    }

    public static RRHH getInstance(String nombreEmpleado, String departamento, String puesto, double salario, int faltas,
                                   int cursosDeCapacitacion, double horasExtras, int despidos, LocalDate fecha, String genero){
        return new RRHH(nombreEmpleado, departamento, puesto, salario, faltas, cursosDeCapacitacion, horasExtras, despidos, fecha, genero);
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getCursosDeCapacitacion() {
        return cursosDeCapacitacion;
    }

    public void setCursosDeCapacitacion(int cursosDeCapacitacion) {
        this.cursosDeCapacitacion = cursosDeCapacitacion;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getDespidos() {
        return despidos;
    }

    public void setDespidos(int despidos) {
        this.despidos = despidos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
