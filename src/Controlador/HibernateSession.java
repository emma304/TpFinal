/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author Agustin
 */
public class HibernateSession {
    private static SessionFactory sessionFactory;
    private static Session session;    
    
     /**
     * Devuelve la sesión actual. Si no existe o está cerrada,
     * crea o abre respectivamente.
     * @return
     */
    public static Session getSession() {
        if (sessionFactory == null){
            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("Hibernate/hibernate.cfg.xml").build();
            try {
                sessionFactory = new Configuration().configure("Hibernate/hibernate.cfg.xml").buildSessionFactory(registry);           
            }
            catch (Exception e) {
                System.out.println("Error al crear factory: " + e.getMessage());
                StandardServiceRegistryBuilder.destroy( registry );
            }
            session = sessionFactory.openSession();
        }
        if (session == null || !session.isOpen())
            session = sessionFactory.openSession();             
        
        return session;
    } 
    
    public static void desconectar() {
            try {
                if (session != null) {
                    if (session.isConnected()) {
                        session.disconnect();
                    }

                    if (session.isOpen()) {
                        session.close();
                        
                    }
                }
            } catch (HibernateException e) {
                System.out.println(e);
                System.out.println("Fallo");
            }
        }
}