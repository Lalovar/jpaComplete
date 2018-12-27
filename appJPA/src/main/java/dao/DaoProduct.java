package dao;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Product;

public class DaoProduct {
 
    public void run() {
        try{
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersisTuto");
            EntityManager entityManager = factory.createEntityManager();
             
            entityManager.getTransaction().begin();
             
            Product product = new Product();
            product.setName("holaPrueba");
            product.setPrice(12);
             
            entityManager.persist(product);
             
            entityManager.getTransaction().commit();
             
            entityManager.close();
            factory.close();
            System.out.println("SUCCES");
        }catch(Exception e){
            System.out.println("ERROR " + e);
        }
    }
}