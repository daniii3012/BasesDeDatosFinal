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
public class Multa {
    private long idMulta; // k_multa 
    private double valorMulta; // v_multa 
    private String estadoMulta; // i_estado_multa
    private Date fechaPagoMulta = new Date(); // f_pago

    public long getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(long idMulta) {
        this.idMulta = idMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getEstadoMulta() {
        return estadoMulta;
    }

    public void setEstadoMulta(String estadoMulta) {
        this.estadoMulta = estadoMulta;
    }

    public Date getFechaPagoMulta() {
        return fechaPagoMulta;
    }

    public void setFechaPagoMulta(Date fechaPagoMulta) {
        this.fechaPagoMulta = fechaPagoMulta;
    }
    
    
    
}
