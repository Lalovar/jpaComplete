package model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
 
@Entity
@Table(name = "orden")
public class Orden implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private     Integer     idOrden;
    private     char        estatus;
    private     float       total;
    private     int         numeroMesa;
    private     Date        fechaPedido;
    private     Date        fechaEntrega;
    
    public Orden(){
    	
    }
    
    public Orden(Integer idOrden, char estatus, float total, int numeroMesa, Date fechaPedido, Date fechaEntrega) {
			super();
			this.idOrden = idOrden;
			this.estatus = estatus;
			this.total = total;
			this.numeroMesa = numeroMesa;
			this.fechaPedido = fechaPedido;
			this.fechaEntrega = fechaEntrega;
	}

	public Integer getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Integer idOrden) {
		this.idOrden = idOrden;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	    
	    
}