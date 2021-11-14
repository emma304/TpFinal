/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import java.util.*;

/**
 *
 * @author mauro
 */
public class Campo {
    private Long nroCampo;
    private String nombre;
    private int superficie;
    private List <Lote> lotes = new ArrayList();
    private EstadoCampo estado;

    public Campo() {
    }

    public Campo(Long nroCampo, String nombre, int cantidadLotes, int superficie, EstadoCampo estado) {
        this.nroCampo = nroCampo;
        this.nombre = nombre;
        this.superficie = superficie;
        this.estado = estado;
    }

    public Long getNroCampo() {
        return nroCampo;
    }

    public void setNroCampo(Long nroCampo) {
        this.nroCampo = nroCampo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public EstadoCampo getEstado() {
        return estado;
    }

    public void setEstado(EstadoCampo estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Campo{" + "nroCampo=" + nroCampo + ", nombre=" + nombre + ", superficie=" + superficie + ", lotes=" + lotes + ", estado=" + estado + '}';
    } 
}
