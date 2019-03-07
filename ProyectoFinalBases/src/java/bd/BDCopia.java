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
public class BDCopia {
    
    BDConexion conexion;
    
    public BDCopia(){
        conexion = new BDConexion();
    }
    
    public ResultSet getCopia(String idMaterial) throws SQLException {
        String strSQL = "SELECT * FROM copia WHERE k_isbnissn = '" + idMaterial + "' ORDER BY k_copia";
        PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
    
}
