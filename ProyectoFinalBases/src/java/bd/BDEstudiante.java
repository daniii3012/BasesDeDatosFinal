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
public class BDEstudiante {
    BDConexion conexion;
    
    public BDEstudiante(){
        conexion = new BDConexion();
    }
    
    public ResultSet getEstudianteById(int id) throws SQLException {
        String strSQL = "SELECT * FROM estudiante WHERE k_estudiante = ?";
        PreparedStatement pstm = conexion.getConexion().prepareStatement("strSQL");
        pstm.setInt(1, id);
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
}
