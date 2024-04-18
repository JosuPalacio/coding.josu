package inmobiliaria;

public class Superficies extends Inmueble {
	Tipo tipo;
	
	//constructor
	public Superficies(String ubicacion, double mCuadrado, double precioMCuadrado, String identificador, Tipo tipo) {
		super(ubicacion, mCuadrado, precioMCuadrado, identificador);
		this.tipo = tipo;
	}

	public Superficies(String ubicacion, double mCuadrado, double precioMCuadrado, String identificador) {
		super(ubicacion, mCuadrado, precioMCuadrado, identificador);
	}

	//setters y getters
	public void setTipo (Tipo tipo) {
		this.tipo=tipo;
	}
	
	public Tipo getTipo () {
		return tipo;
	}
	
	//calcular por metro2
	public double precio() {
		this.precio *= this.m2;
		return this.precio;
	}
	public String toSting() {
		return "Superficie\n •Tipo de superficie: " + tipo + "\n •Ubicación" + ubicacion 
				+ "\n •Metros cuadrados: " + m2 + " m2\n •Precio por m2: " 
				+ precio + "\nPrecio final: " + precio() + "\n"; 
	}
}
