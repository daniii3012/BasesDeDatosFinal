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
public abstract class Material {
    private int idMaterial; // k_isbnissn USAR: BigDecimal.valueOf(idMaterial)
    private String tituloMaterial; // n_titulo
    private Date fechaPublicacionMaterial = new Date(); // f_publicacion
    private String tipoMaterial; // n_tipo    
    private String temaMaterial; // n_tema
    
    // Revisar
    private String nombreAutorMaterial; // k_autor, k_isbnissn
}
