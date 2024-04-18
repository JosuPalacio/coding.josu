package inmobiliaria;

/**
 * 
 * @author Josué Palacio
 */

public class Vivienda extends Construccion implements Vendible, Alquilable{

	protected double precioVenta, precioAlquiler;
	protected int numHabitaciones, numPiso;
	protected String cartel="Disponible para vender o alquilar";
	protected Estado estado;
	
	//constructor 
	public Vivienda(String ubicacion, double mCuadrado, Estado estado, String identificador, double precioVenta, double precioAlquiler, int numHabitaciones, int numPiso) {
		super(ubicacion, mCuadrado, precioVenta, estado, identificador);
		this.precioVenta = precioVenta;
		this.precioAlquiler = precioAlquiler;
		this.numHabitaciones = numHabitaciones;
		this.numPiso = numPiso;
	}

	//gettters y setters
	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioCompra() {
		return precioAlquiler;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioAlquiler = precioCompra;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}
	
	public void setEstado(Estado estado) {
		this.estado=estado;
	}
	
	public Estado getEstado() {
		return estado;
	}
	//--------------------
	public double precio() {
		return this.precioVenta;
	}

	public double precioAlquiler() {
		return precioAlquiler;
	}
	@Override
	public String vendido() {
		this.cartel = "este inmuble ha sido vendido";
		return this.cartel;
	}

	@Override
	public String alquilado() {
		this.cartel= "este inmuble ha sido vendido" ;
		return null;
	}

	//método para la clase de conjuntos 
	@Override
	public String info() {
		return "Vivienda: " + "\n •Ubicación: " +  this.ubicacion + "\n •Precio: " + this.precio + " €" 
	    + "\n •Numero de habitaciones: " + this.numHabitaciones + "\n •Disponibilidad: " + this.cartel + "\n";
	}
	
	@Override
	public String toString() {
		return "Vivienda\n •Estado: " + this.estado + "\n •Disponibilidad: " + this.cartel 
		+ "\n •Número de habitaciones: " + getHabitaciones() + "\n •Piso: nº" + getNumPiso() 
		+ "\n •Identificador: " + this.identificador + "\nPrecio de venta: " + precio() 
		+ " €\nPrecio de alquiler: " + precioAlquiler() + " €\n";
	}
}
