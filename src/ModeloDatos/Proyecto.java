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
public class Proyecto {
    private int númeroProyecto;
    private Date fecha;
    private EstadoProyecto estado;
    private Cultivo cultivo;
    
    public Proyecto() {
    }

    public Proyecto(int númeroProyecto, Date fecha, EstadoProyecto estado, Cultivo cultivo) {
        this.númeroProyecto = númeroProyecto;
        this.fecha = fecha;
        this.estado = estado;
        this.cultivo = cultivo;
    }

    public Cultivo getCultivo() {
        return cultivo;
    }

    public void setCultivo(Cultivo cultivo) {
        this.cultivo = cultivo;
    }

    public int getNúmeroProyecto() {
        return númeroProyecto;
    }

    public void setNúmeroProyecto(int númeroProyecto) {
        this.númeroProyecto = númeroProyecto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "n\u00fameroProyecto=" + númeroProyecto + ", fecha=" + fecha + ", estado=" + estado + ", cultivo=" + cultivo + '}';
    }

    
    
}
