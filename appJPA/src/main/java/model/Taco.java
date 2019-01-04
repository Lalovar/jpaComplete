package model;
import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name = "producto")
public class Taco implements Serializable {
    
    @Column(name = "idProducto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;
    
    @Column(name = "nombre")
    private String name;
    
    @Column(name = "costo")
    private float price;
 
    @Column(name = "descripcion")
    private String desc;
    
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
    
    public String getdesc() {
        return desc;
    }
 
    public void setdesc(String desc) {
        this.desc = desc;
    }
    
    @Override    
    public String toString(){
        return "id: " + this.idProduct + " taco: " + this.name;
    }
    
}