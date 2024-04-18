package inmobiliaria;

/**
 * @author Josué Palacio
 * @version 1.0
 */

public class Main_Agencia {
	public static void main(String[] args) {		
		
		//Prueba de inmuebles, muestra los inmuebles con un precio inferior o igual al metido por parametro
		System.out.println("--------------Método Inmuebles que se pueden vender--------------");
		Solar solar = new Solar("C. Gran Via", 100, 80, "00", Zona.URBANA);
		Plaza_Garaje garaje = new Plaza_Garaje("Plaza españa", 100, 20, "01", Privacidad.PRIVADO);
		Vivienda vivienda = new Vivienda("Callao", 50, Estado.NUEVA, "02", 800, 10, 10, 10);
		Agencia_Inmobiliaria agencia = new Agencia_Inmobiliaria();
		agencia.addInmueble(solar);
		agencia.addInmueble(garaje);
		agencia.addInmueble(vivienda);
		System.out.println(agencia.inmueblesVenta(1000));
		
		//Prueba de inmuebles de 2da mano con m2 superiores metidos al por parametro
		 /* Creamos 3 locales comerciales
		 * 1. 1000 m2 
		 * 2. 10 m2 
		 * 3. 80 m2
		 * Agregamos a una agencia y ponemos como m2 minimos 80, a ver cuales se agregan
		 **/
		System.out.println("--------------Método locales segunda mano--------------");
		Local_comercial local_comercial = new Local_comercial("C. fernando", 800, 1000, Estado.SEGUNDA_MANO, "JAJAJJA", 10);
		Local_comercial local_comercial1 = new Local_comercial("Oporto", 10, 10, Estado.SEGUNDA_MANO, "JAJAJJA", 10);
		Local_comercial local_comercial2 = new Local_comercial("Urgel", 80, 80, Estado.SEGUNDA_MANO, "JAJAJJA", 10);
		Agencia_Inmobiliaria agencia1 = new Agencia_Inmobiliaria();
		//agregamos los  inmuebles a la agencia
		agencia1.addInmueble(local_comercial);
		agencia1.addInmueble(local_comercial1);
		agencia1.addInmueble(local_comercial2);
		System.out.println(agencia1.localesSegundaMano(80)); //le ponemos como minimo 80 m2
		//Se agrego solo el 1ro y el 3ro 
		//el 2do al tener 10 m2 no cumple con la condicion para estar dentro
		
		//este método averigua cuántos solares no urbanos están en venta
		System.out.println("--------------Método para ver solares no urbanos--------------");
		Solar solar1 = new Solar("Marques de Vadillo", 1000, 180, "1", Zona.URBANA);
		solar1.vendido();
		Solar solar2 = new Solar("Opera", 1020, 1230, "2", Zona.RUSTICA);
		solar2.vendido();
		Solar solar3 = new Solar("Canal", 1000, 350, "3", Zona.RUSTICA);
		Agencia_Inmobiliaria agencia2 = new Agencia_Inmobiliaria();
		//agregamos los  inmuebles a la agencia
		agencia2.addInmueble(solar1);
		agencia2.addInmueble(solar2);
		agencia2.addInmueble(solar3);
		System.out.println(agencia2.solaresRusticos());
		
		//este método ve todas las viviendas a alquilar de más de dos dormitorios
		System.out.println("--------------Método viviendas con más de 2 dormitorios--------------");
		Vivienda vivienda1 = new Vivienda("Republica Argentina", 50, Estado.NUEVA, "AA3", 80000, 10, 10, 10);
		Vivienda vivienda2 = new Vivienda("Islas Filipinas", 50, Estado.SEGUNDA_MANO, "BA1", 100000, 10, 10, 10);
		Vivienda vivienda3 = new Vivienda("Arganda del rey", 50, Estado.NUEVA, "CC3", 125500, 20, 3, 50);
		Agencia_Inmobiliaria agencia3 = new Agencia_Inmobiliaria();
		//agregamos los  inmuebles a la agencia
		agencia3.addInmueble(vivienda1);
		agencia3.addInmueble(vivienda2);
		agencia3.addInmueble(vivienda3);
		System.out.println(agencia3.mas2Dormitorios());
		System.out.println(agencia3.mas1Dormitorio());
		
		Plaza_Garaje plazaGaraje1 = new Plaza_Garaje("Plaza España", 100, 10, "01", Privacidad.PRIVADO);
		Plaza_Garaje plazaGaraje2 = new Plaza_Garaje("Plaza del Sol", 120, 12, "02", Privacidad.PUBLICO);
		Plaza_Garaje plazaGaraje3 = new Plaza_Garaje("Plaza Mayor", 80, 8, "03", Privacidad.PUBLICO);
		Agencia_Inmobiliaria agencia4 = new Agencia_Inmobiliaria();
		agencia4.addInmueble(plazaGaraje1);
		agencia4.addInmueble(plazaGaraje2);
		agencia4.addInmueble(plazaGaraje3);
		System.out.println(agencia4.verGrajesPublicos());
		
		//------------------metodos que agregue yo------------------
		Agencia_Inmobiliaria agencia5 = new Agencia_Inmobiliaria();
		agencia5.addInmueble(solar1);
		agencia5.addInmueble(local_comercial);
		agencia5.addInmueble(vivienda3);
		agencia5.addInmueble(vivienda1);
		agencia5.addInmueble(local_comercial2);
		System.out.println(agencia5.verVendidos());
		System.out.println(agencia5.verDisponibles());
		
		System.out.println("--------------Método que une dos agencias--------------");
		System.out.println(agencia4.fusionAgencias(agencia3));
	}
}
