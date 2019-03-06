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
 * @author 
 */
public class Prestamo {
    private long idPrestamo; // k_prestamo 
    private Date fechaReclamacion = new Date(); // f_reclamacion    
    private Date fechaDevolucionPrestamo = new Date(); // f_devolucion
    private Date fechaLimiteDevolucionPrestamo = new Date(); // f_limite_devolucion

    public long getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(long idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaReclamacion() {
        return fechaReclamacion;
    }

    public void setFechaReclamacion(Date fechaReclamacion) {
        this.fechaReclamacion = fechaReclamacion;
    }

    public Date getFechaDevolucionPrestamo() {
        return fechaDevolucionPrestamo;
    }

    public void setFechaDevolucionPrestamo(Date fechaDevolucionPrestamo) {
        this.fechaDevolucionPrestamo = fechaDevolucionPrestamo;
    }

    public Date getFechaLimiteDevolucionPrestamo() {
        return fechaLimiteDevolucionPrestamo;
    }

    public void setFechaLimiteDevolucionPrestamo(Date fechaLimiteDevolucionPrestamo) {
        this.fechaLimiteDevolucionPrestamo = fechaLimiteDevolucionPrestamo;
    }
    
    
}
