package model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import model.*;
 
@Entity
@Table(name = "detalle")
public class Detalle implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private     Integer     idDetalle;
    @OneToMany
    private     Taco        idProduct;
    @OneToMany
    private     Orden       idOrden;
    private     int         cantidad;
    private     float       subtotal;

	public Detalle(){
		
	}

    public Detalle(Taco idProduct, Orden idOrden, int cantidad, float subtotal) {
		super();
		this.idProduct = idProduct;
		this.idOrden = idOrden;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Taco getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Taco idProduct) {
		this.idProduct = idProduct;
	}

	public Orden getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Orden idOrden) {
		this.idOrden = idOrden;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
    
	
}