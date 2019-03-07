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
    
    public double getCopia(String idMaterial) throws SQLException {
        String strSQL = "SELECT * FROM copia WHERE k_isbnissn = '" + idMaterial + "' ORDER BY k_copia";
        System.out.println(strSQL);
        PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        ResultSet res = pstm.executeQuery();
        double copia1 = 0;
        if (res.next()){
            if (res.getRow() == 1){
                copia1 = res.getDouble("k_copia");
            }  
        }
        return copia1;
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
    
}
