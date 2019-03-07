/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import logica.Estudiante;
import logica.Material;
import logica.Reserva;

/**
 *
 * @author 
 */
public class BDReserva {
    
    BDConexion conexion;
    
    public BDReserva(){
        conexion = new BDConexion();
    }
    
    public void agregarReserva(long idEstudiante){
        try {
            String strSQL = "INSERT INTO reserva (f_reservacion, i_estado_reserva, k_estudiante) VALUES (current_date,?,?)";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            
            pstm.setString(1, "Activo");
            pstm.setLong(2, idEstudiante);
            
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public ResultSet getReserva(long idEstudiante) throws SQLException {
        String strSQL = "SELECT k_reserva FROM reserva WHERE k_estudiante = ?";
        PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        pstm.setLong(1, idEstudiante);
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public void agregarReservaCopia(long idReserva, long idCopia){
        try {
            Reserva reserva = new Reserva();
            String strSQL = "INSERT INTO reserva_copia (k_reserva, k_copia) VALUES (?,?)";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            pstm.setLong(1, idReserva);
            pstm.setLong(2, idCopia);
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
}
