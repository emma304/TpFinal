/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Controlador.controlador;
import Controlador.HibernateSession;
import InterfazPrincipal.Principal;

/**
 *
 * @author mauro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        controlador Control = new controlador();
        
        Principal prin = new Principal(Control);     
        prin.show(true);
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
    }
}
