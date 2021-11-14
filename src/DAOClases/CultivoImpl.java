/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClases;

import Controlador.HibernateSession;
import DAOInterfaces.DAOCultivo;
import ModeloDatos.Campo;
import ModeloDatos.Cultivo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mauro
 */
public class CultivoImpl implements DAOCultivo{
private Session session;
    @Override
    public void insertar(Cultivo a) {
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
    public void modificar(Cultivo a) {
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
    public void eliminar(Cultivo a) {
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
    public List<Cultivo> obtenerTodos() {
        Session session = null;
                Transaction tr= null;
		List <Cultivo> cultivo = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    cultivo= session.createCriteria(Cultivo.class).list();
                    session.getTransaction().commit(); //NECESARIO
                } catch (Exception e) {
                    e.printStackTrace();
                    session.getTransaction().rollback(); //NECESARIO
                }
		return cultivo;
    }

    @Override
    public Cultivo obtener(Long id) {
     Cultivo retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (Cultivo) session.get(Cultivo.class, id);
            } catch (NullPointerException e){
                //JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
            }
            return retorno;   
    }
    
}
