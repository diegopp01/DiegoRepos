package gestion_pedidos_comida_commit;

public class Producto_commit {
	private String nombre;
	private double precio;
	
	public Producto_commit(String nombre, double precio) {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre.toUpperCase();
	}
	
	public void setPrecio(double precio) {
		if (precio<0) {
			System.out.println("ERROR: El precio no puede ser menor que 0�.");
		}else {
			precio = Math.round(precio*100)/100d;
			this.precio=precio;
		}
	}
}
