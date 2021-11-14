
package DAOClases;

/**
 *
 * @author mauro
 */
import ModeloDatos.Campo;
import DAOInterfaces.DAOCampo;

import Controlador.*;
import DAOInterfaces.DAOEstadoCampo;
import ModeloDatos.EstadoCampo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class EstadoCampoImpl implements DAOEstadoCampo{
private Session session;
    @Override
    public void insertar(EstadoCampo a) {
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
    public void modificar(EstadoCampo a) {
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
    public void eliminar(EstadoCampo a) {
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
    public List<EstadoCampo> obtenerTodos() {
                Session session = null;
                Transaction tr= null;
		List <EstadoCampo> estadocampo = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    estadocampo= session.createCriteria(EstadoCampo.class).list();
                    session.getTransaction().commit(); //NECESARIO
                } catch (Exception e) {
                    e.printStackTrace();
                    session.getTransaction().rollback(); //NECESARIO
                }
		return estadocampo;
    }

    @Override
    public EstadoCampo obtener(Long id) {
        EstadoCampo retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (EstadoCampo) session.get(EstadoCampo.class, id);
            } catch (NullPointerException e){
                //JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
            }
            return retorno;
       
    }  
}
