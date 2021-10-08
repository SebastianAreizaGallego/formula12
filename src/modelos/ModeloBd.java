/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class ModeloBd {
    
    private String servidor="jdbc:mysql://localhost/formula12";
    private String usuario="root";
    private String password="";

    public ModeloBd() {
    }
    
     public Connection conectarBd(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidor,usuario,password);
            System.out.println("Exito conectandonos");
            return conexion;
            
        }catch(Exception error){
            
            System.out.println("UPSSS....."+error);
            
            return null;
        }
    }
            
            
            
}
