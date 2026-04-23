package programacion3;

import java.awt.Font;

import javax.swing.JButton;

public class BotonesGatoRaton extends JButton{
	private String estado;
	private int posicion;
	
	public BotonesGatoRaton(int posicion) {
		this.posicion=posicion;
		this.estado="";	
		setFont(new Font("Segoe UI", Font.BOLD, 80));
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	

}
