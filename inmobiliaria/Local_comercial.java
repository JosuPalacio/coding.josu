package inmobiliaria;

/**
 * 
 * @author Josué Palacio
 */

public class Local_comercial extends Construccion implements Alquilable{
	
	protected double precio;
	protected String cartel="disponible para alquilar";
	protected Estado estado;
	
	public Local_comercial(String ubicacion, double mCuadrado, double precio, Estado estado, String identificador, int precioMCuadrado) {
		super(ubicacion, mCuadrado, precio, estado, identificador);
		this.precio = precio;
		this.estado=estado;
	}

	//setters & getters
	public void setCartel (String cartel) {
		this.cartel=cartel;
	}
	
	public String getCartel () {
		return this.cartel;
	}
	
	public void setEstado(Estado estado) {
		this.estado=estado;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setM2 (double m2) {
		this.m2=m2;
	}
	
	public double getM2 () {
		return this.m2;
	}

	@Override
	public String alquilado() {
		String cartelNuevo="este inmueble ha sido alquilado";
		this.cartel = cartelNuevo;
		return this.cartel;
	}
	
	//método del precio 
	public double precio() {
		return this.precio;
	}

	@Override
	public String info() {
		return "Local comercial: " + "\n •Ubicación: " +  this.ubicacion + "\n •Precio: " + this.precio + " €" + "\n •Superficie: " + this.m2 + " m2" + "\n •Disponibilidad: " + getCartel() + "\n";
	}

	@Override
	public String toString() {
		return "Local comercial: \n •Precio: " + getPrecio() + " €" + "\n •Metros Cuadrados: " + this.m2 + " m2\n •Estado: " + this.estado + "\n";
	}	

}
