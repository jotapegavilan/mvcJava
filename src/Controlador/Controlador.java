package Controlador;

import Modelo.*;
import Vista.*;

/**
 *
 * @author Jotape
 */
public class Controlador {
    public static boolean esEmpleado(String usuario, String clave){
        for(Empleado e : Contedor_personas.empleados){
            if(e.getUsuario().equals(usuario)&&e.getClave().equals(clave)){
                Vista_empleado ve=
                        new Vista_empleado(e.getRut(),
                                e.getCodigo_empleado(),
                                e.getNombre(),
                                e.getApellido(),
                                e.getUsuario(),
                                e.calcular_sueldo());
                ve.setVisible(true);
                return true;
            }
        }
        return false;
    }
    
    public static boolean esCliente(String usuario, String clave){
        for(Cliente c : Contedor_personas.clientes){
            if(c.getUsuario().equals(usuario)&&c.getClave().equals(clave)){
                Vista_cliente vc=
                        new Vista_cliente(c.getRut(),
                                c.getCodigo_cliente(),
                                c.getNombre(),
                                c.getApellido(),
                                c.getUsuario(),
                                c.getCupo_disponible());
                vc.setVisible(true);
                return true;
            }
        }
        return false;
    }
}
