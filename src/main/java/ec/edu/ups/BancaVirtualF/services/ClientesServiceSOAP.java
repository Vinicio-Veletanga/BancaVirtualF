package ec.edu.ups.BancaVirtualF.services;

import ec.edu.ups.BancaVirtualF.modelo.Cliente;
import ec.edu.ups.BancaVirtualF.modelo.CuentaDeAhorro;
import ec.edu.ups.BancaVirtualF.modelo.Transaccion;
import ec.edu.ups.BancaVirtualF.on.GestionUsuarioLocal;
import ec.edu.ups.BancaVirtualF.on.Respuesta;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ClientesServiceSOAP {

	@Inject
	private GestionUsuarioLocal on;

	@WebMethod
	public String saludar(String nombre) {
		return nombre;
	}

	@WebMethod
	public String transaccionservicio(String cuenta, double monto, String tipoTransaccion) {
		try {
			on.realizarTransaccion(cuenta, monto, tipoTransaccion);
			return "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}

	}
	
	@WebMethod
	public List<Transaccion> Tra(String cedula) {
		return on.listadeTransacciones(cedula);
	}
}
