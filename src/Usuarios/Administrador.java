package Usuarios;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Administrador {
	String nombre;
	String apellido;
	String Domicilio;
	GregorianCalendar fechaAlta;
	int id;
	String usuario;
	String password;
	
	Administrador(String nom, String ap, String dom, int dia, int mes, int anio, int identificacion, String us, String pass){
		this.nombre = nom;
		this.apellido = ap;
		this.Domicilio = dom;
		this.fechaAlta =  new GregorianCalendar(dia,mes,anio);
		this.id = identificacion;
		this.usuario = us;
		this.password = pass;
	}
	
	public int cantidadDeMesesTrabajando() {
		Calendar c = Calendar.getInstance();
		int anioActual = c.get(Calendar.YEAR);
		int mesActual = c.get(Calendar.MONTH);
		int anioAlta = fechaAlta.get(Calendar.YEAR);
		int mesAlta = fechaAlta.get(Calendar.MONTH);
		if(c.get(Calendar.DAY_OF_MONTH) >= fechaAlta.get(Calendar.DAY_OF_MONTH)) {
			return ((anioActual-anioAlta) * 12) + mesActual - mesAlta;
		}else return ((anioActual-anioAlta) * 12) + mesActual - mesAlta-1;
	}
	
}
