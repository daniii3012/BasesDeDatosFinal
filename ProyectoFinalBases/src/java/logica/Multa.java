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
    private int idMulta; // k_multa USAR: BigDecimal.valueOf(idMulta)
    private double valorMulta; // v_multa USAR: BigDecimal.valueOf(valorMulta)
    private String estadoMulta; // i_estado_multa
    private Date fechaPagoMulta = new Date(); // f_pago
    
}
