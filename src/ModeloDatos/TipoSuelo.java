/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

/**
 *
 * @author mauro
 */
public class TipoSuelo {
    int idTipoSuelo;
    int tipoSuelo;
    String descripcion;

    public TipoSuelo(int idTipoSuelo, int tipoSuelo, String descripcion) {
        this.idTipoSuelo = idTipoSuelo;
        this.tipoSuelo = tipoSuelo;
        this.descripcion = descripcion;
    }
    
    public TipoSuelo() {
    }
    
    public int getIdTipoSuelo() {
        return idTipoSuelo;
    }

    public void setIdTipoSuelo(int idTipoSuelo) {
        this.idTipoSuelo = idTipoSuelo;
    }

    public int getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(int tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoSuelo{" + "idTipoSuelo=" + idTipoSuelo + ", tipoSuelo=" + tipoSuelo + ", descripcion=" + descripcion + '}';
    }
    
}
