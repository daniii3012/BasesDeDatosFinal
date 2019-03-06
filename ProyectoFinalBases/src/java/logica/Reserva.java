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
public class Reserva {
    private long idReserva; // k_reserva 
    private Date fechaReserva = new Date(); // f_reservacion 
    private Date fechaCancelacionReserva = new Date(); // f_cancelacion 
    private String estadoReserva; // i_estado_reserva

    private long horasReserva; // q_nhoras 

<<<<<<< HEAD
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
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaCancelacionReserva() {
        return fechaCancelacionReserva;
    }

    public void setFechaCancelacionReserva(Date fechaCancelacionReserva) {
        this.fechaCancelacionReserva = fechaCancelacionReserva;
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
    
=======
>>>>>>> 2cefdde72ce43d838ec9c8eed9fbfe354ff33abe
}
