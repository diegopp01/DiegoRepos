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
}
