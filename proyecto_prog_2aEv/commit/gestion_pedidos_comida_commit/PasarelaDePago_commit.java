package gestion_pedidos_comida_commit;

import java.util.Date;
import java.util.Scanner;

public class PasarelaDePago_commit {
	private double importe;
	private long codigoPago;
	private static double cantidadEntrega;
	
	public PasarelaDePago_commit(double importe, long codigoPago,double cantidadEntrega) {
		this.setImporte(importe);
		this.setCodigoPago();
		this.cantidadEntrega=cantidadEntrega;
	}
	
	public PasarelaDePago_commit(double importe) {
		this.setImporte(importe);
		this.setCodigoPago();
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
	
	
	public void efectivo(double cantidadEntrega) {
		Scanner teclado = new Scanner(System.in);
		double entregar = 0.0;
		double cambio = 0.0;
		int billete50 = 0;
		int billete20 = 0;
		int billete10 = 0;
		int billete5 = 0;
		int moneda1 = 0;
		double cent = 0.0;
		
		System.out.println("Introduce la cantidad a entregar:");
		entregar = teclado.nextFloat();
		while (entregar < importe) {
			System.out.println(
					"La cantidad a entregar debe ser mayor que el importe.\nIntroduce la cantidad a entregar:");
			entregar = teclado.nextFloat();
		}
		cambio = entregar - importe;
		System.out.println("SU CAMBIO\n**************************************");
		// El siguiente conjunto de while sirve para contar el número de billetes y
		// monedas que te devuelven en el cambio
		while ((cambio - 50) >= 0) {
			billete50++;
			cambio = cambio - 50;
		}
		while ((cambio - 20) >= 0) {
			billete20++;
			cambio = cambio - 20;
		}
		while ((cambio - 10) >= 0) {
			billete10++;
			cambio = cambio - 10;
		}
		while ((cambio - 5) >= 0) {
			billete5++;
			cambio = cambio - 5;
		}
		while ((cambio - 1) >= 0) {
			moneda1++;
			cambio = cambio - 1;
		}
		cent = cambio * 100;
		cent = Math.round(cent);
		cent = cent / 100d;
		System.out.println("50€       " + billete50 + " billete(s)\n20€       " + billete20
				+ " billete(s)\n10€       " + billete10 + " billete(s)\n5€        " + billete5
				+ " billete(s)\n1€        " + moneda1 + " euro(s)\ncent      " + cent + " céntimo(s)");
		cambio = entregar - importe;
		cambio = cambio * 100;
		cambio = Math.round(cambio);
		cambio = cambio / 100d;
		System.out.println("Total devolución: " + cambio + " €\nGRACIAS POR SU VISITA");
	}
	
	@Override
	public String toString() {
		return "Importe: "+getImporte()+"€, Código de pago: "+getCodigoPago();
	}
}
