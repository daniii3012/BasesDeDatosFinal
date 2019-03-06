/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import logica.Material;

/**
 *
 * @author 
 */
public class BDReserva {
    
    BDConexion conexion;
    
    public BDReserva(){
        conexion = new BDConexion();
    }
    
    public void agregarReserva(Material material){
        try {
            String strSQL = "SELECT * FROM audiovisual";
            PreparedStatement pstm = conexion.getConexion().prepareStatement("insert into personaje (n_nombre, n_habilidad, n_color) values (?,?,?)");
            pstm.setString(1, personaje.getNombre());
            pstm.setString(2, personaje.getHabilidad());
            pstm.setString(3, personaje.getEspecie());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
