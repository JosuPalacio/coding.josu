package inmobiliaria;

public class Plaza_Garaje extends Superficies implements Alquilable, Vendible{
	protected Privacidad privacidad;
	protected String estadoAlquiler = "disponible para alquilar";
	protected String estadoVenta = "disponible para vender";
	protected String cartel = estadoAlquiler + " o " + estadoVenta;
	
	//constructor
	public Plaza_Garaje(String ubicacion, double mCuadrado, double precioMCuadrado, String identificador, Privacidad privacidad) {
		super(ubicacion, mCuadrado, precioMCuadrado, identificador);
		this.privacidad = privacidad;
	}

	//setters y getters
	public Privacidad getPrivacidad() {
		return privacidad;
	}

	public void setPrivacidad(Privacidad privacidad) {
		this.privacidad = privacidad;
	}

	public String getEstadoAlquiler() {
		return estadoAlquiler;
	}

	public void setEstadoAlquiler(String estadoAlquiler) {
		this.estadoAlquiler = estadoAlquiler;
	}

	//método para calcular el precio si se vende
	public String estadoGaraje() {
		if (this.privacidad==Privacidad.PUBLICO) {
			this.cartel=estadoAlquiler;
		} else if (this.privacidad==Privacidad.PRIVADO) {
			this.cartel=this.estadoVenta;
		}
		return this.cartel;
	}
	
	@Override
	public String alquilado() {
		this.estadoAlquiler= "Este Garaje ha sido alquilado";
		return this.estadoAlquiler;
	}
	
	@Override
	public String vendido() {
		this.estadoVenta = "este inmuble ha sido vendido";
		return estadoVenta;
	}
	
	//metodo que calcula el precio segun los metros 2
	public double precio() {
		this.precio *= this.m2;
		return this.precio; 
	}
	
	//metodo que sirve para la clase de conjuntos
	@Override
	public String info() {
		return "Plaza de garaje: " + "\n •Ubicación: " +  this.ubicacion + "\n •Precio: " + this.precio + " €" + "\n •Privacidad: " + this.privacidad + "\n •Disponibilidad: " + this.cartel + "\n";
	}
	
	//to string
	@Override
	public String toString() {
		return "Plaza de Garaje"+"\n •Privacidad: " + this.privacidad + "\n •Estado: " + estadoGaraje() 
		+"\n •Ubicación: " + ubicacion + "\n •Metros Cuadrados: " + m2 + " m2" + "\n •Precio: "
	    + precio+" €"+ "\n •identificador: " + identificador +"\nPrecio Final: " + precio() + " €\n";
	}

}
