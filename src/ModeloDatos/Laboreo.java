/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.sql.Date;

/**
 *
 * @author mauro
 */
public class Laboreo {
    int idLaboreo;
    String descripcion;

    public Laboreo(int idLaboreo, String descripcion) {
        this.idLaboreo = idLaboreo;
        this.descripcion = descripcion;
    }

    public Laboreo() {
    }

    public int getIdLaboreo() {
        return idLaboreo;
    }

    public void setIdLaboreo(int idLaboreo) {
        this.idLaboreo = idLaboreo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Laboreo{" + "idLaboreo=" + idLaboreo + ", descripcion=" + descripcion + '}';
    }

}
