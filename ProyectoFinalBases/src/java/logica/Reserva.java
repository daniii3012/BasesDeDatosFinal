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
    private int idReserva; // k_reserva USAR: BigDecimal.valueOf(idReserva)
    private Date fechaReserva = new Date(); // f_reservacion 
    private Date fechaCancelacionReserva = new Date(); // f_cancelacion 
    private String estadoReserva; // i_estado_reserva
    private int horasReserva; // q_nhoras USAR: BigDecimal.valueOf(horasReserva)
}
