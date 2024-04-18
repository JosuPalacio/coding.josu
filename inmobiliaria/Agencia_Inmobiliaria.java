package inmobiliaria;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author Josué Palacio
 */

public class Agencia_Inmobiliaria {

	private ArrayList <Inmueble> agencia;
	
	public Agencia_Inmobiliaria () {
		agencia = new ArrayList<>();
	}
	
	public void addInmueble (Inmueble inmueble) {
		agencia.add(inmueble);
	}
	
	//metodo para obtener el largo
	public int getLargo () {
		return agencia.size();
	}
	
	
	private Collection<? extends Inmueble> getAgencia() {
		// TODO Auto-generated method stub
		return this.agencia;
	}
	/**
	 * @param precioLimit. muestra los inmuebles con un precio de venta inferior al parámetro 
	 * @return devuelve un arraylist bien impreso con los inmuebles
	 */
	public String inmueblesVenta(double precioLimit) {	
        ArrayList<Inmueble> iVendibles = new ArrayList<>();
        StringBuilder cartel = new StringBuilder();
        
        // Recorre la agencia viendo los precios y que imprima los de menor precio
        for (Inmueble inmueble : this.agencia) {
            if (inmueble.precio() <= precioLimit && inmueble instanceof Vendible) {
                iVendibles.add(inmueble);
            }
        }
        
        //Construye una cadena con la información de los inmuebles vendibles
        cartel.append("\n----------Inmuebles en venta----------");
        if (iVendibles.isEmpty()) {
        	cartel.append("\nNo hay ningún inmueble con un precio de " + precioLimit + " € o inferior \n");
        } else {
	        cartel.append("\nInmuebles de " + precioLimit + " € o menos\n");
	        cartel.append("Inmuebles vendibles:\n");
	        for (Inmueble i : iVendibles) {
	            cartel.append(i.info() + "\n");
	        }
        }
        return cartel.toString();
	}

	/**
	 * 
	 * @param metrosMinimos. muestra los locales comerciales de segunda mano con una superficie superior al parámetro
	 * @return devuelve cartel es un String con la info
	 */	
	public String localesSegundaMano(double metrosMinimos) {
		ArrayList<Inmueble> iSegunda = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		
		//recorremos el array
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Local_comercial && ((Local_comercial) inmueble).getEstado() == Estado.SEGUNDA_MANO && inmueble.getM2() >= metrosMinimos) {
				iSegunda.add(inmueble);
			}
		}

		//para imprimir los datos
		cartel.append("\n----------Locales de segunda mano----------");
		if (iSegunda.isEmpty()) {
			cartel.append("\nNo hay local comercial con una superficie superior o igual a " + metrosMinimos + " m2");
		} else {
			cartel.append("\nLocales comerciales con una superficie superior a " + metrosMinimos + " m2 \n");
			for (Inmueble i : iSegunda) {
				cartel.append(i.info() +"\n");
			}
		}
		return cartel.toString();
	}
	
	/**
	 * @param averigua cuántos solares no urbanos están en venta
	 */
	public String solaresRusticos() {
		ArrayList <Inmueble> iSolares = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		
		//recorremos el array
		for (Inmueble inmueble: this.agencia) {
			if (inmueble instanceof Solar && ((Solar)inmueble).getZona() != Zona.URBANA && ((Solar)inmueble).cartel != ((Solar)inmueble).vendido()) {
				iSolares.add(inmueble);
			}
		}
		
		//para imprimir los datos
		cartel.append("\n----------Solares no urbanos----------");
		if (iSolares.isEmpty()) {
			cartel.append("\nNo hay solares rusticos \n");
		} else {
			cartel.append("\nSolares Rusticos: \n");
			for (Inmueble inmueble : iSolares) {
				cartel.append(inmueble.info() +"\n");
			}
		}
		
		return cartel.toString();
	}
	
	/**
	 * 
	 * @return cartel: Ver todas las viviendas a alquilar de más de dos dormitorios.
	 */
	public String mas2Dormitorios () {
		ArrayList <Inmueble> iViviendas = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		int minNumHab=2;
		
		//recorremos el array
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Vivienda  && ((Vivienda) inmueble).getNumHabitaciones() >= minNumHab 
				&& ((Vivienda)inmueble).cartel != ((Vivienda) inmueble).vendido() 
				&& ((Vivienda)inmueble).cartel != ((Vivienda)inmueble).alquilado()) {
				iViviendas.add(inmueble);
			}
		}
		
		//para imprimir los datos
		cartel.append("\n----------Viviendas de mas de 2 dormitorios ----------");
		if (iViviendas.isEmpty()) {
			cartel.append("\nNo hay viviendas con " + minNumHab + " o más dormitorios. \n");
		} else {
			cartel.append("\nViviendas pra comprar con " + minNumHab + " o más dormitorios: \n");
			for (Inmueble inmueble : iViviendas) {
				cartel.append(inmueble.info() +"\n");
			}
		}		
		return cartel.toString();
	}
	
	/**
	 * 
	 * @return devuelve un cartel que muestra las viviendas con más de 1 habitación
	 */
	public String mas1Dormitorio() {
		ArrayList <Inmueble> iViviendas = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		int minNumHab=1;
		
		//recorremos el array
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Vivienda && ((Vivienda) inmueble).getNumHabitaciones() >= minNumHab) {
				iViviendas.add(inmueble);
			}
		}
		
		//para imprimir los datos
		cartel.append("\n----------Vivienda con 1 o más habitaciones ----------");
		if (iViviendas.isEmpty()) {
			cartel.append("\nNo hay viviendas con " + minNumHab + " o más dormitorios. \n");
		} else {
			cartel.append("\nViviendas con " + minNumHab + " o más dormitorios: \n");
			for (Inmueble inmueble : iViviendas) {
				cartel.append(inmueble.info() +"\n");
			}
		}		
		return cartel.toString();
	}
	
	/**
	 * 
	 * @return devuelve la informacion de aquellos garajes que estan publicos
	 */
	public String verGrajesPublicos () {
		ArrayList <Inmueble> iGarajes = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		
		//recorremos el array
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Plaza_Garaje && ((Plaza_Garaje) inmueble).privacidad == Privacidad.PUBLICO) {
				iGarajes.add(inmueble);
			}
		}
		
		//para imprimir los datos
		cartel.append("\n----------Garajes Publicos----------");
		if (iGarajes.isEmpty()) {
			cartel.append("\nNo hay garajes publicos disponibles. \n");
		} else {
			cartel.append("\nGarajes publicos: \n");
			for (Inmueble inmueble : iGarajes) {
				cartel.append(inmueble.info() +"\n");
			}
		}		
		return cartel.toString();
	}
	
	/**
	 * @param agencia2
	 * @return devuelve la fusion de dos agencias
	 */
	public String fusionAgencias(Agencia_Inmobiliaria agencia2) {
	    StringBuilder fusionA = new StringBuilder();
	    ArrayList<Inmueble> fusion = new ArrayList<>();

	    // Copiar los inmuebles de la primera agencia a la lista fusion
	    fusion.addAll(this.agencia);

	    // Copiar los inmuebles de la segunda agencia a la lista fusion
	    fusion.addAll(agencia2.getAgencia());

	    fusionA.append("\nFusion de agencias: \n");
	    for (Inmueble inmueble : fusion) {
	        fusionA.append(inmueble.info()).append("\n");
	    }

	    return fusionA.toString();
	}

	//------------------------------------------------------------------------------------------------------------
	//metodos que agregue 
	/**
	 * 
	 * @return cartel.toString()  devuelve los inmuebles vendidos dentro de la lista y los ingresos brutos
	 */
	public String verVendidos() {
		StringBuilder cartel = new StringBuilder();
		ArrayList <Inmueble> iVendidos = new ArrayList<>();
		double sumaTotal=0;
		
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Vivienda && ((Vivienda)inmueble).cartel == ((Vivienda)inmueble).vendido()) {
				iVendidos.add(inmueble);
			} else if (inmueble instanceof Plaza_Garaje && ((Plaza_Garaje)inmueble).cartel == ((Plaza_Garaje)inmueble).vendido()) {
				iVendidos.add(inmueble);
			} else if (inmueble instanceof Solar && ((Solar)inmueble).cartel == ((Solar)inmueble).vendido()) {
				iVendidos.add(inmueble);
			}
		}

		//para imprimir los datos
		cartel.append("\n----------AGENCIA INMOBILIARIA----------");
		if (iVendidos.isEmpty()) {
			cartel.append("\nNo hay inmuebles vendidos. \n");
		} else {
			cartel.append("\nInmuebles Vendidos: \n");
			for (Inmueble inmueble : iVendidos) {
				sumaTotal += inmueble.precio();
				cartel.append(inmueble.info() +"\n");
			}
			cartel.append("Los ingresos brutos de la venta de inmuebles es: " + sumaTotal + " € \n");
		}		
		return cartel.toString();
	}
	
	/**
	 * 
	 * @returndevuelve la informacion de los inmuebles que no fueron ni vendidos ni alquilados
	 */
	public String verDisponibles() {
		ArrayList <Inmueble> iDisponibles = new ArrayList<>();
		StringBuilder cartel = new StringBuilder();
		
		for (Inmueble inmueble : this.agencia) {
			if (inmueble instanceof Vivienda && ((Vivienda)inmueble).cartel != ((Vivienda)inmueble).vendido() && ((Vivienda)inmueble).cartel != ((Vivienda)inmueble).alquilado()) {
				iDisponibles.add(inmueble);
			} else if (inmueble instanceof Plaza_Garaje && ((Plaza_Garaje)inmueble).cartel != ((Plaza_Garaje)inmueble).vendido() && ((Plaza_Garaje)inmueble).cartel != ((Plaza_Garaje)inmueble).alquilado()) {
				iDisponibles.add(inmueble);
			} else if (inmueble instanceof Solar && ((Solar)inmueble).cartel != ((Solar)inmueble).vendido()) {
				iDisponibles.add(inmueble);
			} else if (inmueble instanceof Local_comercial && ((Local_comercial)inmueble).cartel != "este inmueble ha sido alquilado" ) {
				iDisponibles.add(inmueble);
			}			
		}
		//para imprimir los datos
		cartel.append("\n----------AGENCIA INMOBILIARIA----------");
		if (iDisponibles.isEmpty()) {
			cartel.append("\nNo hay inmuebles disponibles. \n");
		} else {
			cartel.append("\nInmuebles Disponibles: \n");
			for (Inmueble inmueble : iDisponibles) {
				cartel.append(inmueble.info() +"\n");
			}		
		}		
		return cartel.toString();
	}

	//método que imprimen la lista
	public String toString() {
		String s = "";
		s+="\n";
		for (Inmueble i: agencia) {
			System.out.println("Inmueble: " + i.info());
		}
		return s;
	}
}
