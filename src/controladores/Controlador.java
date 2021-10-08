/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.ModeloBd;
import vistas.Vista;

/**
 *
 * @author ASUS
 */
public class Controlador implements ActionListener {
    
    ModeloBd modelo=new ModeloBd();
    Vista vista=new Vista();

    public Controlador(ModeloBd modelo,Vista vista) {
        this.modelo=modelo;
        this.vista=vista;
        vista.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelo.conectarBd();
        
        
        
    }
    
    
    
    
}
