/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class BDConexion {
    static String bd = "ProyectoFinalBibliotecaV2"; // Nombre de la base de datos
    static String login = "postgres";
    static String password = "Brayan.29.Postgres"; //Debe reemplazarse por el password en su propia instalación

    static String url = "jdbc:postgresql://localhost:5432/"+bd;

    static String mensaje = "";
    
    Connection conexion = null;
    /**
     * Constructor de la clase
     */
    public BDConexion() {
        try{
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection(url,login,password);

                if (conexion!=null){
                        System.out.println("Conexión a base de datos "+bd+" OK");
                }
        }catch(SQLException e){
                mensaje = e.getMessage();
        }catch(ClassNotFoundException e){
                mensaje = e.getMessage();
        }
    }
    
    /**
     * Metodo para retornar mensajes de control
     * @return 
     */
    public static String getMensaje() {
        return mensaje;
    }

    /**
     * Metodo para setear mensajes de control
     * @param mensaje 
     */
    public static void setMensaje(String mensaje) {
        BDConexion.mensaje = mensaje;
    }
     
    /**
     * metodo que retorna la conexion a la bd
     * @return 
     */
    public Connection getConexion(){
        return conexion;
    }

    /**
     * metodo que desconecta la base de datos
     */
    public void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BDConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
