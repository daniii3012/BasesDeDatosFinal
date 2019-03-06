/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.util.Date;

/**
 *
 * @author 
 */
public class Reserva {
    Date fecha = new Date();
    
    private long idReserva; // k_reserva 
    private java.sql.Date fechaReserva = new java.sql.Date(fecha.getTime()); // f_reservacion 
    private java.sql.Date fechaCancelacionReserva = new java.sql.Date(fecha.getTime()); // f_cancelacion 
    private String estadoReserva; // i_estado_reserva

    private long horasReserva; // q_nhoras 

    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = (java.sql.Date) fechaReserva;
    }

    public Date getFechaCancelacionReserva() {
        return fechaCancelacionReserva;
    }

    public void setFechaCancelacionReserva(Date fechaCancelacionReserva) {
        this.fechaCancelacionReserva = (java.sql.Date) fechaCancelacionReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public long getHorasReserva() {
        return horasReserva;
    }

    public void setHorasReserva(long horasReserva) {
        this.horasReserva = horasReserva;
    }
}
