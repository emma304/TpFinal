/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClases;

import DAOInterfaces.DAOLaboreo;
import ModeloDatos.Laboreo;
import java.util.ArrayList;
import Controlador.*;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author mauro
 */
public class LaboreoImpl implements DAOLaboreo{
private Session session;
    @Override
    public void insertar(Laboreo a) {
        try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.save(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Agregado con éxito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
    }

    @Override
    public void modificar(Laboreo a) {
        try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.update(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Modificado con éxito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
    }

    @Override
    public void eliminar(Laboreo a) {
       try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.delete(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Eliminado con éxito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }	
    }

    @Override
    public List<Laboreo> obtenerTodos() {
                Session session = null;
                Transaction tr= null;
		List <Laboreo> laboreo = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    laboreo= session.createCriteria(Laboreo.class).list();
                    session.getTransaction().commit(); //NECESARIO
                } catch (Exception e) {
                    e.printStackTrace();
                    session.getTransaction().rollback(); //NECESARIO
                }
		return laboreo;
    }

    @Override
    public Laboreo obtener(Long id) {
     Laboreo retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (Laboreo) session.get(Laboreo.class, id);
            } catch (NullPointerException e){
                //JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
            }
            return retorno;
        
    }
    
}
