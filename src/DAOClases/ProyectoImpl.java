/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClases;

import DAOInterfaces.DAOProyecto;
import ModeloDatos.Proyecto;
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
public class ProyectoImpl implements DAOProyecto{
private Session session;
    @Override
    public void insertar(Proyecto a) {
        try {
            session = null;
            session= HibernateSession.getSession();
            session.beginTransaction();
            session.save(a);
            session.getTransaction().commit();
            //session.close();       SI CIERRA NO FUNCIONA LO SIGUIENTE A ESTE INSERTAR
            System.out.println("Agregado con éxito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
    }

    @Override
    public void modificar(Proyecto a) {
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
    public void eliminar(Proyecto a) {
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
    public List<Proyecto> obtenerTodos() {
        Session session = null;
                Transaction tr= null;
		List <Proyecto> proyecto = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    proyecto= session.createCriteria(Proyecto.class).list();
                    session.getTransaction().commit(); //NECESARIO
                } catch (Exception e) {
                    e.printStackTrace();
                    session.getTransaction().rollback(); //NECESARIO
                }
		return proyecto;
    }

    @Override
    public Proyecto obtener(Long id) {
      Proyecto retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (Proyecto) session.get(Proyecto.class, id);
            } catch (NullPointerException e){
                //JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
            }
            return retorno;
        
    }
    
}
