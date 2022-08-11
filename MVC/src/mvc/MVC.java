/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;


/**
 *
 * @author los_d
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        modelo mod = new modelo();
        vista vis = new vista();
        
        controlador ctl = new controlador(vis,mod);
        vis.setVisible(true);
        
    }
    
}
