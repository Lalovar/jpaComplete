package model;
import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name = "product")
public class Product implements Serializable {
    
    @Column(name = "idProduct")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "price")
    private float price;
 
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
    public Integer getIdProduct() {
        return idProduct;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
}