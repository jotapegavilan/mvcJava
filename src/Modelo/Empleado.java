package Modelo;

/**
 *
 * @author Jotape
 */
public class Empleado extends Persona{
  private String codigo_empleado;
    private double sueldo_horas;
    private int horas_semana;
    private final double POR_DESC = 0.2;

    public Empleado(String codigo_empleado, double sueldo_horas, int horas_semana, String rut, String nombre, String apellido, String usuario, String clave, String tipo) {
        super(rut, nombre, apellido, usuario, clave, tipo);
        this.codigo_empleado = codigo_empleado;
        this.sueldo_horas = sueldo_horas;
        this.horas_semana = horas_semana;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public double getSueldo_horas() {
        return sueldo_horas;
    }

    public void setSueldo_horas(double sueldo_horas) {
        this.sueldo_horas = sueldo_horas;
    }

    public int getHoras_semana() {
        return horas_semana;
    }

    public void setHoras_semana(int horas_semana) {
        this.horas_semana = horas_semana;
    }
    public double calcular_sueldo(){
        return sueldo_horas * horas_semana * 4 *POR_DESC;
    }
   
}
