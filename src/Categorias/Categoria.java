package Categorias;

public abstract class Categoria {
	double cargoFijo;
	double cargoVariable ;
	
	public double getFacturaMensual(int consumo) {
		return cargoFijo + consumo * cargoVariable;
	}

}
