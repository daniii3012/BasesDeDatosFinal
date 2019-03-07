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
    
    public void agregarReserva(double idEstudiante){
        try {
            String strSQL = "INSERT INTO reserva (f_reservacion, i_estado_reserva, k_estudiante) VALUES (current_date,?,?)";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);         
            pstm.setString(1, "Activo");
            pstm.setDouble(2, idEstudiante);
            
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public double getReserva(Double idEstudiante) throws SQLException {
        String strSQL = "SELECT k_reserva FROM reserva WHERE k_estudiante = ?";
        PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
        pstm.setDouble(1, idEstudiante);
        ResultSet res = pstm.executeQuery();
        //1597536842
        double llave_reserva = 0;
        while (res.next()){
            if (res.getRow() == 1){
                llave_reserva = res.getDouble("k_reserva");
            }
        }
        return llave_reserva;
    }
    
    public void agregarReservaCopia(double idReserva, double idCopia){
        try {
            //Reserva reserva = new Reserva();
            System.out.println("Entre");
            String strSQL = "INSERT INTO reserva_copia (k_reserva, k_copia) VALUES (?,?)";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            
            pstm.setDouble(1, idReserva);
            pstm.setDouble(2, idCopia);
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
}
