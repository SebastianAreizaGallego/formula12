/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formula12;

import controladores.Controlador;
import modelos.ModeloBd;
import vistas.Vista;

/**
 *
 * @author ASUS
 */
public class Formula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ModeloBd modelo=new ModeloBd();
    Vista vista=new Vista();
    vista.setVisible(true);
    Controlador  controlador=new Controlador(modelo,vista);
        
    }
    
}
