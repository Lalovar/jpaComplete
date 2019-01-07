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
    private     Orden       idOrden;
    @OneToMany
    private     Taco        idProduct;
    private     Integer     cantidad;
    private     float       subtotal;

    public Detalle()
    {
    	
    }
    
    public Detalle(Orden idOrden, Taco idProduct,Integer cantidad,float subtotal)
	{
		super();
		this.idOrden = idOrden;
		this.idProduct = idProduct;
		this.cantidad =cantidad;
		this.subtotal=subtotal;
	}	
	
	public Orden getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Orden idOrden) {
		this.idOrden = idOrden;
	}
	
	public Taco getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Taco idProduct) {
		this.idProduct = idProduct;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
}