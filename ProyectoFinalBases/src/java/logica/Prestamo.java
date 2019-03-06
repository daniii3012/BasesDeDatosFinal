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
    private int idPrestamo; // k_prestamo USAR: BigDecimal.valueOf(idPrestamo)
    private Date fechaReclamacion = new Date(); // f_reclamacion    
    private Date fechaDevolucionPrestamo = new Date(); // f_devolucion
    private Date fechaLimiteDevolucionPrestamo = new Date(); // f_limite_devolucion
    
}
