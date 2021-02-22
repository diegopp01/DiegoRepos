package gestion_pedidos_comida_commit;

import java.util.ArrayList;
import java.util.Date;

public class Cliente_commit {
	private String nombre;
	private String apellidos;
	private Date fechaDeAlta;
	private String telefono;
	private String direccion;
	private ArrayList<Pedido_commit> historial;
	
	public Cliente_commit(String nombre, String apellidos, Date fechaDeAlta, String telefono, String direccion) {
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setFechaDeAlta(fechaDeAlta);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
		this.setHistorial(new ArrayList<Pedido_commit>());
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre.toLowerCase();
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos.toUpperCase();
	}
	
	public void setFechaDeAlta(Date fechaDeAlta) {
		if (this.fechaDeAlta==null) {
			this.fechaDeAlta=new Date();
		}else {
			this.fechaDeAlta=fechaDeAlta;
		}
	}
	
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
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public void setHistorial(ArrayList<Pedido_commit> historial) {
		this.historial=historial;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public ArrayList<Pedido_commit> getHistorial() {
		return historial;
	}

	
	public void agregarPedido(Pedido_commit pedido) {
		if (historial!=null) {
			historial.add(pedido);
		}
	}
}