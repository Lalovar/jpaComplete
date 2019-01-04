package dao;
 
import javax.persistence.*;
import java.util.*;
import model.Product;

public class DaoProduct {
    
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
 
    public void insert(Product product) {
        try{
            openConn();
            em.getTransaction().begin();
            em.persist(product);
            em.getTransaction().commit();
            closeConn();
            System.out.println("SUCCESS INSERTION");
        }catch(Exception e){
            System.out.println("ERROR in insert" + e);
        }
    }
    
    public Collection<Product> findAll(){
         Query query = null;
         Collection<Product> list = null;
         try{
            openConn();
            em.getTransaction().begin();
            query = em.createQuery("SELECT e FROM Product e");
            list = (Collection<Product>) query.getResultList(); 
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findAll" + e);
        }
        return list;
    }
    
    public Product findById(int id){
         Product  product = null;
         try{
            openConn();
            em.getTransaction().begin();
            product = em.find(Product.class, id);
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in findById" + e);
        }
        return product;
    }
    
    public void update(Product product){
        try{
            openConn();
            em.getTransaction().begin();
            em.merge(product);
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
            em.remove(em.find(Product.class, id));
            em.getTransaction().commit();
            closeConn();
         }catch(Exception e){
            System.out.println("ERROR in remove" + e);
        }
    }
    
}