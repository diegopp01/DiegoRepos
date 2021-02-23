package gestion_pedidos_comida_commit;

public class Producto_commit {
	/**
	 * Atributos
	 */
	private String nombre;
	private double precio;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param precio
	 */
	public Producto_commit(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	/**
	 * Recoge el nombre del producto
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre.toUpperCase();
	}
	
	/**
	 * Recoge el precio del producto
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio<0) {
			System.out.println("ERROR: El precio no puede ser menor que 0€.");
		}else {
			precio = Math.round(precio*100)/100d;
			this.precio=precio;
		}
	}
	
	/**
	 * Devuelve el nombre del producto
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el precio del producto
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	
	/**
	 * Muestra los datos del producto
	 */
	@Override
	public String toString() {
		return "PRODUCTO -> Nombre: "+getNombre()+", Precio: "+getPrecio()+"€";
	}
	
	public static void main(String[] args) {
		Producto_commit producto1=new Producto_commit("Hamburguesa", 3.50);
		System.out.println(producto1);
	}
}
