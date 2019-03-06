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
    private long idMaterial; // k_isbnissn 
    private String tituloMaterial; // n_titulo
    private Date fechaPublicacionMaterial = new Date(); // f_publicacion
    private String tipoMaterial; // n_tipo    
    private String temaMaterial; // n_tema
    
    // Revisar
    private String nombreAutorMaterial; // k_autor, k_isbnissn

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTituloMaterial() {
        return tituloMaterial;
    }

    public void setTituloMaterial(String tituloMaterial) {
        this.tituloMaterial = tituloMaterial;
    }

    public Date getFechaPublicacionMaterial() {
        return fechaPublicacionMaterial;
    }

    public void setFechaPublicacionMaterial(Date fechaPublicacionMaterial) {
        this.fechaPublicacionMaterial = fechaPublicacionMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getTemaMaterial() {
        return temaMaterial;
    }

    public void setTemaMaterial(String temaMaterial) {
        this.temaMaterial = temaMaterial;
    }

    public String getNombreAutorMaterial() {
        return nombreAutorMaterial;
    }

    public void setNombreAutorMaterial(String nombreAutorMaterial) {
        this.nombreAutorMaterial = nombreAutorMaterial;
    }
    
    
}
