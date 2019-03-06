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
    private long codigoEstudiante; // k_estudiante 
    private String nombreEstudiante; // n_nombre
    private String apellidoEstudiante; // n_apellido
    private long idEstudiante; //q_identificacion 
    private String tipoIdEstudiante; // n_tipo_identificacion
    private Date fechaNacimientoEstudiante = new Date(); // f_nacimiento 
    private String generoEstudiante; // n_genero    
    private String estadoEstudiante; // i_estado_estudiante

    public long getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(long codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getTipoIdEstudiante() {
        return tipoIdEstudiante;
    }

    public void setTipoIdEstudiante(String tipoIdEstudiante) {
        this.tipoIdEstudiante = tipoIdEstudiante;
    }

    public Date getFechaNacimientoEstudiante() {
        return fechaNacimientoEstudiante;
    }

    public void setFechaNacimientoEstudiante(Date fechaNacimientoEstudiante) {
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
    }

    public String getGeneroEstudiante() {
        return generoEstudiante;
    }

    public void setGeneroEstudiante(String generoEstudiante) {
        this.generoEstudiante = generoEstudiante;
    }

    public String getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(String estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }
    
    
}
