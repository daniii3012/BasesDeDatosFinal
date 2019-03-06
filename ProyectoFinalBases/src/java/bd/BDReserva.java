/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Date;
import java.sql.PreparedStatement;
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
    
    public void agregarReserva(Estudiante estudiante){
        try {
            Reserva reserva = new Reserva();
            String strSQL = "INSERT INTO reserva (f_reservacion, i_estado, k_estudiante) VALUES (?,?,?)";
            PreparedStatement pstm = conexion.getConexion().prepareStatement(strSQL);
            pstm.setDate(1, (Date) reserva.getFechaReserva());
            pstm.setString(2, "Activo");
            pstm.setLong(3, estudiante.getIdEstudiante());
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public String getMensaje() {
        return conexion.getMensaje();
    }
}
