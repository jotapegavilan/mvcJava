package Modelo;

/**
 *
 * @author Jotape
 */
public class Cliente extends Persona{
    
     private String codigo_cliente;
   private double cupo_disponible;

    public Cliente(String codigo_cliente, double cupo_disponible,String rut, String nombre, String apellido, String usuario, String clave, String tipo) {
        super(rut,nombre,apellido,usuario,clave,tipo);
        this.codigo_cliente = codigo_cliente;
        this.cupo_disponible = cupo_disponible;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public double getCupo_disponible() {
        return cupo_disponible;
    }

    public void setCupo_disponible(double cupo_disponible) {
        this.cupo_disponible = cupo_disponible;
    }
   
    
    
}
