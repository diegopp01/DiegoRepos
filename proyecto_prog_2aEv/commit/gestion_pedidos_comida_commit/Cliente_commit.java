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
			System.out.println("ERROR: El n�mero de tel�fono debe tener 9 n�meros.");
			this.telefono = "000000000";
		} else {
			if (telefono.charAt(0) != '6' &&
				telefono.charAt(0) != '7' &&
				telefono.charAt(0) != '8' &&
				telefono.charAt(0) != '9') {
				System.out.println("ERROR: El n�mero de tel�fono debe empezar por 8, 9 (tel�fono) o 6, 7 (m�vil)");
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
}