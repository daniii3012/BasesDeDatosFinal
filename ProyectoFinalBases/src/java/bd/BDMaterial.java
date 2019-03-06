/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class BDMaterial {
    
    BDConexion conexion;
    
    public BDMaterial(){
        conexion = new BDConexion();
    }
    
    public ResultSet getMaterialBibliografico() throws SQLException {
        PreparedStatement pstm = conexion.getConexion().prepareStatement("SELECT * FROM bibliografico");
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
}
