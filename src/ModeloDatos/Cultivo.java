/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauro
 */
public class Cultivo {
    private Long idCultivo;
    private String nombreCultivo;
    private List <Laboreo> laboreos = new ArrayList();
    private TipoSuelo tiposuelo;

    public Cultivo(Long idCultivo, String nombreCultivo, TipoSuelo tiposuelo) {
        this.idCultivo = idCultivo;
        this.nombreCultivo = nombreCultivo;
        this.tiposuelo = tiposuelo;
    }

   

    public Cultivo() {
    }

    public Long getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Long idCultivo) {
        this.idCultivo = idCultivo;
    }

    
   
    public String getNombreCultivo() {
        return nombreCultivo;
    }

    public void setNombreCultivo(String nombreCultivo) {
        this.nombreCultivo = nombreCultivo;
    }

    public List<Laboreo> getLaboreos() {
        return laboreos;
    }

    public void setLaboreos(List<Laboreo> laboreos) {
        this.laboreos = laboreos;
    }

    public TipoSuelo getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(TipoSuelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    @Override
    public String toString() {
        return "Cultivo{" + "idCultivo=" + idCultivo + ", nombreCultivo=" + nombreCultivo + ", laboreos=" + laboreos + ", tiposuelo=" + tiposuelo + '}';
    }
    
    
    
    
    
}
