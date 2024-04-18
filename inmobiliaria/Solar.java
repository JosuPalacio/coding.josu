package inmobiliaria;

/**
 * 
 * @author Josué Palacio
 */

public class Solar extends Superficies implements Vendible{
	
	protected Zona zona;
	protected String cartel = "Disponible para vender";

	//constructor
	public Solar(String ubicacion, double mCuadrado, double precioMCuadrado, String identificador, Zona zona) {
		super(ubicacion, mCuadrado, precioMCuadrado, identificador);
		this.zona = zona;
	}

	//setters y getters
	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	@Override
	//metodo que va a agarrar la agencia
	public double precio() {
		this.precio *= this.m2;
		return this.precio;
	}
	
	@Override
	public String vendido() {
		this.cartel = "este inmuble ha sido vendido";
		return this.cartel;
	}

	//método de para la clase de conjuntos
	@Override
	public String info() {
		return "Solar: " + "\n •Ubicación: " +  this.ubicacion + "\n •Precio: " + this.precio + " €" + "\n •Zona: " + this.zona + "\n •Disponiblilidad: " + this.cartel + "\n";
	}

	@Override
	public String toString() {
		return "Solar: "+"\n •Zona: " + zona + "\n •Estado de venta: " + this.cartel + "\n •Ubicación: " + ubicacion + "\n •Metros Cuadrados: " + m2 + " m2" + "\n •Precio: " + precio
				+" €"+ "\n •identificador: " + identificador +"\nPrecio Final: " +precio()+" €\n";
	}
	
}
