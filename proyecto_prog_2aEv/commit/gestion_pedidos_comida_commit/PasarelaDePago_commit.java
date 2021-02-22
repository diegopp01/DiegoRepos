package gestion_pedidos_comida_commit;

import java.util.Date;

public class PasarelaDePago_commit {
	private double importe;
	private long codigoPago;
	private static double cantidadEntrega;
	
	public PasarelaDePago_commit(double importe, long codigoPago,double cantidadEntrega) {
		
	}
	
	public void setImporte(double importe) {
		importe = Math.round(importe*100)/100d;
		this.importe=importe;
	}
	
	public void setCodigoPago() {
		this.codigoPago=new Date().getTime();
	}
	
	
	public double getImporte() {
		return importe;
	}
	
	public long getCodigoPago() {
		return codigoPago;
	}
}
