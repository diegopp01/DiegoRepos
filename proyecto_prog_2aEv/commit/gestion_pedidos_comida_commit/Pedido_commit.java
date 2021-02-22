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
		this.setCliente(cliente);
		this.setFechaHora(fechaHora);
		this.setProducto(new ArrayList<Producto_commit>());
		this.setImporteTotal(importeTotal);
		this.setPago(pago);
		this.setEstado(estado);
	}
	
	public Pedido_commit(Cliente_commit cliente, double importeTotal) {
		this.setCliente(cliente);
		this.setFechaHora(fechaHora);
		this.setProducto(productos);
		this.setImporteTotal(importeTotal);
		this.setPago(pago);
		this.setEstado(estado);
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
	
	
	public void pagar(PasarelaDePago_commit TipoPago) {
		
	}
	
	public void agregarProducto(Producto_commit producto) {
		productos.add(producto);
	}
	
	public void eliminarProducto(int posicion) {
		if (posicion<=productos.size() && posicion>=0) {
			productos.remove(posicion);
		}
	}
}
