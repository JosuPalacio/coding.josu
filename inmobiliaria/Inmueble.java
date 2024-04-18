package inmobiliaria;

/**
 * 
 * @author Josué Palacio 
 */

public class Inmueble {
	
	protected String ubicacion;
	protected double m2;
	protected double precio;
	protected String identificador;
	
	//constructor
	public Inmueble(String ubicacion, double mCuadrado, double precio, String identificador) {
		super();
		this.ubicacion = ubicacion;
		this.m2 = mCuadrado;
		this.precio = precio;
		this.identificador = identificador;
	}
	
	//setters & getters
	public double precio() {
		return this.precio;
	}
	
	public void setM2 (double m2) {
		this.m2=m2;
	}
	
	public double getM2 () {
		return this.m2;
	}
	
	public String vendido() {
		return null;
	}
	
	//metodo que va a ser utilizado para los metodos de agencia inmobiliaria
	public String info() {
		return null;
	}
	
	@Override
	public String toString() {
		return "\n •Ubicación: " + ubicacion + "\n •Metros Cuadrados: " + m2 + " m2" + "\n •Precio: " + precio
				+" €"+ "\n •identificador: " + identificador +"\nPrecio Final: " +precio+" €\n";
	}
	
	
	
}
