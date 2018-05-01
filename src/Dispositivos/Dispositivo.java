package Dispositivos;

public class Dispositivo {
	String nombre;
	int kwporHora;
	boolean encendido = false;
	
	Dispositivo(String nombreGenerico,int kw){
		this.nombre = nombreGenerico;
		this.kwporHora = kw;
		
	}
	
	public boolean estaEncendido() {
		return encendido;
	}
	public int getConsumo() {
		return kwporHora;
	}
	
	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;
	}
	

}
