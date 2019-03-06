/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class BDMaterial {
    
    Connection conexion;
    
    public BDMaterial(){
        conexion = ServiceLocator.getInstance().tomarConexion();
    }
    
    public ResultSet getMaterialBibliografico() throws SQLException {
        String strSQL = "SELECT * FROM bibliografico";
        PreparedStatement pstm = conexion.prepareStatement(strSQL);
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
}
