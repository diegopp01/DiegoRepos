package gestion_pedidos_comida_commit;

import java.util.ArrayList;
import java.util.Date;

public class Pedido_commit {
	private Cliente_commit cliente;
	private Date fechaHora;
	private ArrayList<Producto_commit> productos;
	private double importeTotal;
	private PasarelaDePago_commit pago;
	private String estado;
	
	public Pedido_commit(Cliente_commit cliente,Date fechaHora, double importeTotal, PasarelaDePago_commit pago) {
		
	}
	
	public void setCliente(Cliente_commit cliente) {
		this.cliente=cliente;
	}
	
	public void setFechaHora(Date fechaHora) {
		this.fechaHora=fechaHora;
	}
	
	public void setProducto(ArrayList<Producto_commit> productos) {
		this.productos=productos;
	}
	
	public void setImporteTotal(double importeTotal) {
		this.importeTotal=importeTotal;
	}
	
	public void setPago(PasarelaDePago_commit pago) {
		this.pago=pago;
	}
	
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	
	public Cliente_commit getCliente() {
		return cliente;
	}
	
	public Date getFechaHora() {
		return fechaHora;
	}
	
	public ArrayList<Producto_commit> getProducto() {
		return productos;
	}
	
	public double getImporteTotal() {
		return importeTotal;
	}
	
	public PasarelaDePago_commit getPago() {
		return pago;
	}
	
	public String getEstado() {
		return estado;
	}
}
