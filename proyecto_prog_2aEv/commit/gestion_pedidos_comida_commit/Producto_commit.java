package gestion_pedidos_comida_commit;

public class Producto_commit {
	private String nombre;
	private double precio;
	
	public Producto_commit(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre.toUpperCase();
	}
	
	public void setPrecio(double precio) {
		if (precio<0) {
			System.out.println("ERROR: El precio no puede ser menor que 0€.");
		}else {
			precio = Math.round(precio*100)/100d;
			this.precio=precio;
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "PRODUCTO -> Nombre: "+getNombre()+", Precio: "+getPrecio()+"€";
	}
	
	public static void main(String[] args) {
		Producto_commit producto1=new Producto_commit("Hamburguesa", 3.50);
		System.out.println(producto1);
	}
}
