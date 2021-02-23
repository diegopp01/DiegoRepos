package gestion_pedidos_comida_commit;

import java.util.ArrayList;
import java.util.Date;

public class Pedido_commit {
	/**
	 * Atributos
	 */
	private Cliente_commit cliente;
	private Date fechaHora;
	private ArrayList<Producto_commit> productos;
	private double importeTotal;
	private PasarelaDePago_commit pago;
	private String estado;
	
	/**
	 * Constructor
	 * @param cliente
	 * @param fechaHora
	 * @param importeTotal
	 * @param pago
	 */
	public Pedido_commit(Cliente_commit cliente,Date fechaHora, double importeTotal, PasarelaDePago_commit pago) {
		this.setCliente(cliente);
		this.setFechaHora(fechaHora);
		this.setProducto(new ArrayList<Producto_commit>());
		this.setImporteTotal(importeTotal);
		this.setPago(pago);
		this.setEstado(estado);
	}
	/**
	 * Sobrecarga constructor
	 * @param cliente
	 * @param importeTotal
	 */
	public Pedido_commit(Cliente_commit cliente, double importeTotal) {
		this.setCliente(cliente);
		this.setFechaHora(fechaHora);
		this.setProducto(productos);
		this.setImporteTotal(importeTotal);
		this.setPago(pago);
		this.setEstado(estado);
	}
	
	/**
	 * Recoge los datos del cliente
	 * @param cliente
	 */
	public void setCliente(Cliente_commit cliente) {
		this.cliente=cliente;
	}
	
	/**
	 * Recoge la fecha y hora de alta
	 * @param fechaHora
	 */
	public void setFechaHora(Date fechaHora) {
		this.fechaHora=fechaHora;
	}
	
	/**
	 * Recoge la lista de productos
	 * @param productos
	 */
	public void setProducto(ArrayList<Producto_commit> productos) {
		this.productos=productos;
	}
	
	/**
	 * Recoge el importe total a pagar
	 * @param importeTotal
	 */
	public void setImporteTotal(double importeTotal) {
		this.importeTotal=importeTotal;
	}
	
	/**
	 * Para pagar el pedido
	 * @param pago
	 */
	public void setPago(PasarelaDePago_commit pago) {
		this.pago=pago;
	}
	
	/**
	 * Recoge el estado del pedido
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado=estado;
	}
	
	/**
	 * Devuelve los datos del cliente
	 * @return
	 */
	public Cliente_commit getCliente() {
		return cliente;
	}
	
	/**
	 * Devuelve la fecha y hora de alta
	 * @return
	 */
	public Date getFechaHora() {
		return fechaHora;
	}
	
	/**
	 * Devuelve la lista de productos
	 * @return
	 */
	public ArrayList<Producto_commit> getProducto() {
		return productos;
	}
	
	/**
	 * Devuelve el importe total a pagar
	 * @return
	 */
	public double getImporteTotal() {
		return importeTotal;
	}
	
	/**
	 * Para pagar el pedido 
	 * @return
	 */
	public PasarelaDePago_commit getPago() {
		return pago;
	}
	
	/**
	 * Devuelve el estado del pedido
	 * @return
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * Selecciona el tipo de pago
	 * @param TipoPago
	 */
	public void pagar(PasarelaDePago_commit TipoPago) {
		
	}
	
	/**
	 * Agrega un producto a la colección de productos del pedido
	 * @param producto
	 */
	public void agregarProducto(Producto_commit producto) {
		productos.add(producto);
	}
	
	/**
	 * Elimina un producto de la colección de productos del pedido
	 * @param posicion
	 */
	public void eliminarProducto(int posicion) {
		if (posicion<=productos.size() && posicion>=0) {
			productos.remove(posicion);
		}
	}
	
	/**
	 * Muestra los datos del pedido
	 */
	@Override
	public String toString() {
		return "CANT.               PRODUCTO               PRECIO UD.         TOTAL"
				+"\n=====               ========               =========          ====="
				+"\n               "+getProducto()+
				"\nTOTAL ---------------------------------------------------> "+getImporteTotal();
	}
}
