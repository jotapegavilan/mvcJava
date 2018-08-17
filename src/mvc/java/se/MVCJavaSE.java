/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.java.se;

import Modelo.*;
import Vista.Vista_login;


/**
 *
 * @author Jotape
 */
public class MVCJavaSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = new Empleado("em1", 6900, 38, "12.345-567-8", "Jorge", "Fuentes", "empleado", "admin", "empleado");
        Empleado e1 = new Empleado("em2", 4900, 50, "12.111-567-8", "Pablo", "Toro", "empleado1", "admin1", "empleado");
        Cliente c = new Cliente("cl1",200000, "12.222-567-8", "Loreto", "Perez", "cliente", "admin", "cliente");
        Cliente c1 = new Cliente("cl2",500000, "12.333-567-8", "Maria", "Nuñez", "cliente1", "admin1", "cliente");
        Contedor_personas.empleados.add(e);
        Contedor_personas.empleados.add(e1);
        Contedor_personas.clientes.add(c);
        Contedor_personas.clientes.add(c1);
        Vista.Vista_login vl = new Vista_login();
        vl.setVisible(true);
    }
    
}
