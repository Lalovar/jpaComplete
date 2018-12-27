package model;
 
import java.io.Serializable;
import javax.persistence.*;
import model.Product;
 
@Entity
@Table(name = "sale")
public class Sale implements Serializable {
    
    private Integer idSale;
    private int quantity;
    private Product product;
 
    @Column(name = "idSale")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return idSale;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    @ManyToOne
    @JoinColumn(name = "product")
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
}