/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDatos.*;
import ModeloDatos.*;
import DAOClases.*;
import DAOInterfaces.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author mauro
 */
public class controlador {
     private final CampoImpl campodao = new CampoImpl();
     private final LoteImpl lotedao = new LoteImpl();
     private final TipoSueloImpl tipodao = new TipoSueloImpl();
     private final EstadoCampoImpl estadocampodao = new EstadoCampoImpl();
     private final EstadoProyectoImpl estadoproyectodao = new EstadoProyectoImpl();
     private final LaboreoImpl laboreodao = new LaboreoImpl();
     private final CultivoImpl cultivodao = new CultivoImpl();
     private final ProyectoImpl proyectodao = new ProyectoImpl();
     
     public void AgregarCampo(Campo campo){
         campodao.insertar(campo);
         
    }
     public List<Campo> ObtenerTodosLosCampos(){
         List <Campo> campos = campodao.obtenerTodos();
         return campos;
     }
     
     public Campo ObtenerCampo(Long id){
         Campo campoobtenido = new Campo();
         campoobtenido = campodao.obtener(id);
         return campoobtenido;
     }
     
     public void EditarCampo(Campo campo){
         campodao.modificar(campo);
     }
     
     public void BorrarCampo(Campo campo){
         campodao.eliminar(campo);
     }
     
     public void AgregarLote(Lote lote){
         lotedao.insertar(lote);
     }
     
     public void EditarLote(Lote lote){
         lotedao.modificar(lote);
     }
     
     public void BorrarLote(Lote lote){
         lotedao.eliminar(lote);
     }
     
     public List<Lote> ObtenerTodosLosLotes(){
         List <Lote> lotes = lotedao.obtenerTodos();
         return lotes;
     }
     
     public void AgregarTipoSuelo(TipoSuelo tiposuelo){
         tipodao.insertar(tiposuelo);
     }
     
     public List<TipoSuelo> ObtenerTodosLosTipoSuelo(){
         List <TipoSuelo> tipossuelo = tipodao.obtenerTodos();
         return tipossuelo;
     }
     
     public void AgregarEstadoCampo(EstadoCampo estadocampo){
         estadocampodao.insertar(estadocampo);
     }
     
    public void AgregarEstadoProyecto(EstadoProyecto estadoproyecto){
        estadoproyectodao.insertar(estadoproyecto);
    }
    
    public void AgregarLaboreo(Laboreo laboreo){
        laboreodao.insertar(laboreo);
    }
    
    public void AgregarCultivo(Cultivo cultivo){
        cultivodao.insertar(cultivo);
    }
    
    public List<Cultivo> ObtenerTodosLosCultivos(){
        List <Cultivo> cultivos = cultivodao.obtenerTodos();
        return cultivos;
    }
    
    public void AgregarProyecto(Proyecto proyecto){
        proyectodao.insertar(proyecto);
    }
    
    public void desconectarcampo(){
        campodao.desconectar();
    }
}


