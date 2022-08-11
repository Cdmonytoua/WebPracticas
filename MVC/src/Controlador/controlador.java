/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author los_d
 */

public class controlador implements ActionListener{
    
   private vista view;
   private modelo model;

   public controlador(vista view, modelo model){
       
       this.model = model;
       this.view = view;
       this.view.boton.addActionListener(this);
       
   }
   

   @Override
   public void actionPerformed(ActionEvent e){
       model.setNumuno(Integer.parseInt(view.num1.getText()));
       model.setNumdos(Integer.parseInt(view.num2.getText()));
       model.suma();
       view.resultado.setText(String.valueOf(model.getResultado()));
   }
   
}
