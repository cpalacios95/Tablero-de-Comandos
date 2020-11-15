package ar.udec.tablerodecomandos.persistence.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "rrhh")
public class RRHHEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rrhh")
    private Integer idRrhh;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    private String departamento;

    private String puesto;

    private double salario;

    private int faltas;

    @Column(name = "cursos_de_capacitacion")
    private int cursosDeCapacitacion;

    @Column(name = "horas_extras")
    private double horasExtras;

    private int despidos;

    private LocalDate fecha;

    private String genero;

    public RRHHEntity() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdRrhh() {
        return idRrhh;
    }

    public void setIdRrhh(Integer idRrhh) {
        this.idRrhh = idRrhh;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
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
