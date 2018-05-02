package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import Usuarios.Cliente;

public class jsonReader {
	
	public Cliente getCliente(String filepath) {
		try {
			
			Gson gson = new Gson();
			Cliente cliente = gson.fromJson(new FileReader(filepath), Cliente.class);
			return cliente
					;
		}catch (FileNotFoundException ex) {
			
			ex.printStackTrace();
			return null;
			
		}
	}
}
