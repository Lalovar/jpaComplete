package dao;
 
import javax.persistence.*;
import java.util.*;
import model.Sale;

public class DaoSale {
    
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
 
    public void insert(Sale sale) {
        try{
            openConn();
            em.getTransaction().begin();
            em.persist(sale);
            em.getTransaction().commit();
            closeConn();
            System.out.println("SUCCESS INSERTION");
        }catch(Exception e){
            System.out.println("ERROR in insert" + e);
        }
    }
    
    public Collection<Sale> findAll(){
         Query query = null;
         Collection<Sale> list = null;
         try{
            openConn();
            em.getTransaction().begin();
            query = em.createQuery("SELECT e FROM Sale e");
            list = (Collection<Sale>) query.getResultList(); 
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return list;
    }
    
    public Sale findById(int id){
         Sale  sale = null;
         try{
            openConn();
            
            em.getTransaction().begin();
            sale = em.find(Sale.class, id);
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return sale;
    }
    
    public void update(Sale sale){
        try{
            openConn();
            em.getTransaction().begin();
            em.merge(sale);
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
            em.remove(em.find(Sale.class, id));
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in remove" + e);
        }
    }
    
    
}