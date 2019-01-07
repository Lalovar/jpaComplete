package dao;
 
import javax.persistence.*;
import java.util.*;
import model.Taco;

public class DaoTaco {
    
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
 
    public void insert(Taco taco) {
        try{
            openConn();
            em.getTransaction().begin();
            em.persist(taco);
            em.getTransaction().commit();
            closeConn();
            System.out.println("SUCCESS INSERTION");
        }catch(Exception e){
            System.out.println("ERROR in insert" + e);
        }
    }
    
    public Collection<Taco> findAll(){
         Query query = null;
         Collection<Taco> list = null;
         try{
            openConn();
            em.getTransaction().begin();
            query = em.createQuery("SELECT e FROM Taco e");
            list = (Collection<Taco>) query.getResultList(); 
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return list;
    }
    
    public Taco findById(int id){
         Taco  taco = null;
         try{
            openConn();
            em.getTransaction().begin();
            taco = em.find(Taco.class, id);
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findById in TACO " + e);
        }
        return taco;
    }
    
    public void update(Taco taco){
        try{
            openConn();
            em.getTransaction().begin();
            em.merge(taco);
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
            em.remove(em.find(Taco.class, id));
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in remove" + e);
        }
    }
    
}