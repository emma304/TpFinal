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
public class EstadoProyecto {
    int idEstadoProyecto;
    String descripción;

    public EstadoProyecto(int idEstadoProyecto, String descripción) {
        this.idEstadoProyecto = idEstadoProyecto;
        this.descripción = descripción;
    }

    public EstadoProyecto() {
    }

    public int getIdEstadoProyecto() {
        return idEstadoProyecto;
    }

    public void setIdEstadoProyecto(int idEstadoProyecto) {
        this.idEstadoProyecto = idEstadoProyecto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "EstadoProyecto{" + "idEstadoProyecto=" + idEstadoProyecto + ", descripci\u00f3n=" + descripción + '}';
    }
    
}
