package net.lshimokawa.ejemplos.apachecxf.jaxws;

import javax.jws.WebService;

/**
 * Implementación del Web Service, el endpointInterface es el fully qualified
 * name de la interface que implementa.
 * 
 * @author lshimokawa
 */
@WebService(endpointInterface = "net.lshimokawa.ejemplos.apachecxf.jaxws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	/**
	 * Implementación de la operación
	 */
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
