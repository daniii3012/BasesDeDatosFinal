/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;
//import java.sql.Date;

/**
 *
 * @author Daniel
 */
public class Estudiante {
    private int codigoEstudiante; // k_estudiante USAR: BigDecimal.valueOf(codigoEstudiante)
    private String nombreEstudiante; // n_nombre
    private String apellidoEstudiante; // n_apellido
    private int idEstudiante; //q_identificacion USAR: BigDecimal.valueOf(idEstudiante)
    private String tipoIdEstudiante; // n_tipo_identificacion
    private Date fechaNacimientoEstudiante = new Date(); // f_nacimiento 
    private String generoEstudiante; // n_genero    
    private String estadoEstudiante; // i_estado_estudiante
}
