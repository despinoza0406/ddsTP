package Usuarios;

import java.util.*;
import java.util.stream.Collectors;

import Dispositivos.Dispositivo;
import Categorias.Categoria;
import Categorias.*;


enum TipoDocumento{
	DNI,CI,LE,LC
}

public class Cliente {
	String nombre;
	String apellido;
	TipoDocumento doc;
	int numeroDoc;
	int telfContacto;
	String Domicilio;
	GregorianCalendar fechaAlta;
	Categoria categoria;
	String usuario;
	String password;
	List<Dispositivo> dispositivos;
	
	
	Cliente(String nom, String ap, TipoDocumento docum, int numeroDocum,
			int telefono, String dom, int dia, int mes, int anio, 
			Categoria cat, String us, String pass){
		this.nombre = nom;
		this.apellido = ap;
		this.doc = docum;
		this.numeroDoc = numeroDocum;
		this.telfContacto = telefono;
		this.Domicilio = dom;
		this.fechaAlta = new GregorianCalendar(dia,mes,anio);
		this.categoria = new R1();
		this.usuario = us;
		this.password = pass;
	}
	
	public boolean algunDispositivoEncendido(){
		List<Dispositivo> encendidos = dispositivos.stream().filter(disp -> disp.estaEncendido()).collect(Collectors.toList());
		return encendidos.size() > 0;
	}
	
	public int cantidadDispositivosEncendidos() {
		return dispositivos.stream().filter(disp -> disp.estaEncendido()).collect(Collectors.toList()).size();
	}
	
	public int cantidadDispositivosApagados() {
		return dispositivos.stream().filter(disp -> !disp.estaEncendido()).collect(Collectors.toList()).size(); //Tambien se podria tomar el anterior y restarselo a la lista
	}
	
	public int getCantidadDeDispositivos() {
		return dispositivos.size();
	}
	
	int consumoTotal() {
		return dispositivos.stream().mapToInt(disp -> disp.getConsumo()).sum();
	}
	
	public double calcularFactura() {
		return categoria.getFacturaMensual(this.consumoTotal());
	}
	
	
}


