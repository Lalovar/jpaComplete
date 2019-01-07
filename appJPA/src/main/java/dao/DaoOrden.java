package dao;
 
import javax.persistence.*;
import java.util.*;
import model.Orden;

public class DaoOrden {
    
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
 
    public void insert(Orden orden) {
        try{
            openConn();
            em.getTransaction().begin();
            em.persist(orden);
            em.getTransaction().commit();
            closeConn();
            System.out.println("SUCCESS INSERTION");
        }catch(Exception e){
            System.out.println("ERROR in insert" + e);
        }
    }
    
    public Collection<Orden> findAll(){
         Query query = null;
         Collection<Orden> list = null;
         try{
            openConn();
            em.getTransaction().begin();
            query = em.createQuery("SELECT e FROM Orden e");
            list = (Collection<Orden>) query.getResultList(); 
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return list;
    }
    
    public Orden findById(int id){
         Orden  orden = null;
         try{
            openConn();
            em.getTransaction().begin();
            orden = em.find(Orden.class, id);
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findById Order: " + e);
        }
        return orden;
    }
    
    public void update(Orden orden){
        try{
            openConn();
            em.getTransaction().begin();
            em.merge(orden);
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
            em.remove(em.find(Orden.class, id));
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in remove" + e);
        }
    }
    
}