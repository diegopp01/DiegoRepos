package gestion_pedidos_comida_commit;

import java.util.ArrayList;
import java.util.Date;

public class Cliente_commit {
	/**
	 * Atributos
	 */
	private String nombre;
	private String apellidos;
	private Date fechaDeAlta;
	private String telefono;
	private String direccion;
	private ArrayList<Pedido_commit> historial;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param apellidos
	 * @param fechaDeAlta
	 * @param telefono
	 * @param direccion
	 */
	public Cliente_commit(String nombre, String apellidos, Date fechaDeAlta, String telefono, String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechaDeAlta(fechaDeAlta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(new ArrayList<Pedido_commit>());
	}
	/**
	 * Sobrecarga constructor
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 * @param direccion
	 */
	public Cliente_commit(String nombre, String apellidos, String telefono, String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechaDeAlta(fechaDeAlta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(historial);
	}
	
	/**
	 * Recoge el nombre del cliente
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre.toLowerCase();
	}
	
	/**
	 * Recoge los apellidos del cliente
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos.toUpperCase();
	}
	
	/**
	 * Recoge la fecha de alta del cliente
	 * @param fechaDeAlta
	 */
	public void setFechaDeAlta(Date fechaDeAlta) {
		if (this.fechaDeAlta==null) {
			this.fechaDeAlta=new Date();
		}else {
			this.fechaDeAlta=fechaDeAlta;
		}
	}
	
	/**
	 * Recoge el teléfono del cliente
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		telefono = telefono.replace(" ", "");
		if (telefono.length() != 9) {
			System.out.println("ERROR: El número de teléfono debe tener 9 números.");
			this.telefono = "000000000";
		} else {
			if (telefono.charAt(0) != '6' &&
				telefono.charAt(0) != '7' &&
				telefono.charAt(0) != '8' &&
				telefono.charAt(0) != '9') {
				System.out.println("ERROR: El número de teléfono debe empezar por 8, 9 (teléfono) o 6, 7 (móvil)");
				this.telefono = "000000000";
			} else {
				this.telefono = telefono;
			}
		}
	}
	
	/**
	 * Recoge la dirección del cliente
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	/**
	 * Recoge el historial de pedidos del cliente
	 * @param historial
	 */
	public void setHistorial(ArrayList<Pedido_commit> historial) {
		this.historial=historial;
	}
	
	/**
	 * Devuelve el nombre del cliente
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve los apellidos del cliente
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Devuelve la fecha de alta del cliente
	 * @return
	 */
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}
	
	/**
	 * Devuelve el teléfono del cliente
	 * @return
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * Devuelve la dirección del cliente
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Devuelve el historial de pedidos del cliente
	 * @return
	 */
	public ArrayList<Pedido_commit> getHistorial() {
		return historial;
	}

	/**
	 * Agrega un pedido al historial del cliente
	 * @param pedido
	 */
	public void agregarPedido(Pedido_commit pedido) {
		if (historial!=null) {
			historial.add(pedido);
		}
	}
	
	/**
	 * Muestra los datos del cliente
	 */
	@Override
	public String toString() {
		return "CLIENTE -> Nombre completo: "+getNombre()+" "+getApellidos()+", Fecha: "+getFechaDeAlta()+
				", Teléfono: "+getTelefono()+", Calle: "+getDireccion()+", Pedido: "+getHistorial();
	}
	
	public static void main(String[] args) {
		Cliente_commit cliente1=new Cliente_commit("Pepe","Martínez Pérez","857 881 205","C/ Vegabaja, nº 17");
		
		System.out.println(cliente1);
	}
}