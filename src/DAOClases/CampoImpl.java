/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClases;

import ModeloDatos.Campo;
import DAOInterfaces.DAOCampo;
import java.util.ArrayList;
import Controlador.*;
import java.util.Arrays;
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
public class CampoImpl implements DAOCampo{
 private Session session;
    
    @Override
    public void insertar(Campo a) {
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
    public void modificar(Campo a) {
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
    public void eliminar(Campo a) {
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
    public List<Campo> obtenerTodos() {
         Session session = null;
                Transaction tr= null;
		List <Campo> campo = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    campo= session.createCriteria(Campo.class).list();
                    session.getTransaction().commit(); //NECESARIO
                } catch (Exception e) {
                    e.printStackTrace();
                    session.getTransaction().rollback(); //NECESARIO
                }
		return campo;
                
    }

    @Override
    public Campo obtener(Long id) {
     Campo retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (Campo) session.get(Campo.class, id);
            } catch (NullPointerException e){
                //JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
            }
            return retorno;
    }
    
    public void desconectar(){
        try {
			if (this.session != null) {
				if (this.session.isConnected()) {
					this.session.disconnect();
				}

				if (this.session.isOpen()) {
					this.session.close();
				}
			}
		} catch (HibernateException e) {
			System.out.println(e);
                         System.out.println("Fallo");
		}
    }
}
