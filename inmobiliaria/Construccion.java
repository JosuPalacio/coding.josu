package inmobiliaria;

/**
 * 
 * @author Josué Palacio
 */

public class Construccion extends Inmueble{

	protected Estado estado;
	protected int numHabitaciones;
	
	//constructor
	public Construccion(String ubicacion, double mCuadrado, double precio, Estado estado, String identificador) {
		super(ubicacion, mCuadrado, precio, identificador);
		this.estado=estado;

	}
	
	//getters y setters
	public void setHabitaciones (int numHabitaciones) {
		this.numHabitaciones=numHabitaciones;
	}
	
	public int getHabitaciones () {
		return this.numHabitaciones;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public double precio() {
		return this.precio;
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}
}
