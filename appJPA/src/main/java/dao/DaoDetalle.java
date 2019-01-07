package dao;
 
import javax.persistence.*;
import java.util.*;
import model.Detalle;

public class DaoDetalle {
    
    private EntityManagerFactory factory;
    private EntityManager em;
    
    private void openConn(){
         factory = Persistence.createEntityManagerFactory("PersisTuto");
         em = factory.createEntityManager();
    }
    
    private void closeConn(){
        em.close();
        factory.close();
    }
 
    public void insert(Detalle detalle) {
        try{
            openConn();
            em.getTransaction().begin();
            em.persist(detalle);
            em.getTransaction().commit();
            closeConn();
            System.out.println("SUCCESS INSERTION");
        }catch(Exception e){
            System.out.println("ERROR in insert" + e);
        }
    }
    
    public Collection<Detalle> findAll(){
         Query query = null;
         Collection<Detalle> list = null;
         try{
            openConn();
            em.getTransaction().begin();
            query = em.createQuery("SELECT e FROM Detalle e");
            list = (Collection<Detalle>) query.getResultList(); 
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return list;
    }
    
    public Detalle findById(int id){
         Detalle  detalle = null;
         try{
            openConn();
            em.getTransaction().begin();
            detalle = em.find(Detalle.class, id);
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findById" + e);
        }
        return detalle;
    }
    
    public void update(Detalle detalle){
        try{
            openConn();
            em.getTransaction().begin();
            em.merge(detalle);
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in update" + e);
        }
    }
    
     public void removeById(int id){
        try{
            openConn();
            em.getTransaction().begin();
            em.remove(em.find(Detalle.class, id));
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in remove" + e);
        }
    }
    
}