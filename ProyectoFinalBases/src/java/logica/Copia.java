/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author 
 */
public class Copia {
    private long idCopia; // k_copia 
    private String estadoPrestamoCopia; // i_estado_prestamo
    private String estadoFisicoCopia; // i_estado_fisico
    private String disponibleCopia; // i_disponible

    public long getIdCopia() {
        return idCopia;
    }

    public void setIdCopia(long idCopia) {
        this.idCopia = idCopia;
    }

    public String getEstadoPrestamoCopia() {
        return estadoPrestamoCopia;
    }

    public void setEstadoPrestamoCopia(String estadoPrestamoCopia) {
        this.estadoPrestamoCopia = estadoPrestamoCopia;
    }

    public String getEstadoFisicoCopia() {
        return estadoFisicoCopia;
    }

    public void setEstadoFisicoCopia(String estadoFisicoCopia) {
        this.estadoFisicoCopia = estadoFisicoCopia;
    }

    public String getDisponibleCopia() {
        return disponibleCopia;
    }

    public void setDisponibleCopia(String disponibleCopia) {
        this.disponibleCopia = disponibleCopia;
    }
    
}
