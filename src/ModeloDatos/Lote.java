/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.awt.Choice;

/**
 *
 * @author mauro
 */
public class Lote {
    private int idLote;
    private int superficie;
    private TipoSuelo tiposuelo;
    private Proyecto proyecto;
    
    public Lote() {
    }

    public Lote(int idLote, int superficie, TipoSuelo tiposuelo, Proyecto proyecto) {
        this.idLote = idLote;
        this.superficie = superficie;
        this.tiposuelo = tiposuelo;
        this.proyecto = proyecto;
    }

    public Lote(int idLote, int superficie, TipoSuelo tiposuelo) {
        this.idLote = idLote;
        this.superficie = superficie;
        this.tiposuelo = tiposuelo;
    }
    
    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public TipoSuelo getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(TipoSuelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Lote{" + "idLote=" + idLote + ", superficie=" + superficie + ", tiposuelo=" + tiposuelo + ", proyecto=" + proyecto + '}';
    }

   
    
}
