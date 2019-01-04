package model;
 
import java.io.Serializable;
import javax.persistence.*;
import model.Product;
import java.util.*;
 
@Entity
@Table(name = "sale")
public class Sale implements Serializable {
    
    @Column(name = "idSale")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;
    
    @Column(name = "quantity")
    private int quantity;
    
    @ManyToOne
    private Product product;
 
    public void setidSale(int idSale) {
        this.idSale = idSale;
    }
 
    public Integer getId() {
        return idSale;
    }
    
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
}