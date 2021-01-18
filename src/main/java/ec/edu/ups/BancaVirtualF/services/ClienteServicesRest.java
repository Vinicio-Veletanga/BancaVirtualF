package ec.edu.ups.BancaVirtualF.services;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import ec.edu.ups.BancaVirtualF.modelo.Cliente;
import ec.edu.ups.BancaVirtualF.on.GestionUsuarioLocal;

@Path("clientes")
public class ClienteServicesRest {
	
	@Inject
	private GestionUsuarioLocal on;
	
	public String saludar(String nombre) {
		return nombre ;
	}
	
	@GET
	public String transaccionservicio(String cuenta, double monto, String tipoTransaccion) {
		try {
			on.realizarTransaccion(cuenta, monto, tipoTransaccion);
			return "Ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}

	}
	
	
	@GET 
	@Produces("application/json")
	@Path("listarclientes")
	@Consumes("application/json")
	public List<Cliente> listarC(){
		return on.listaClientes();
	}
	
	
	@POST
	@Path("crearcliente")
	@Produces("application/json")
	@Consumes("application/json")
	public String Guardar(Cliente cliente) {
		 Cliente c = cliente;
		
		
		try {
			on.guardarCliente(c);
			return "OK";
			
		} catch (Exception e) {
			e.printStackTrace();
			return c.toString();
			
			// TODO: handle exception
		}
		
	}
	@POST
	@Path("validCedula")
	
	public String vCedula(String ced) throws Exception {
		try {
			on.validadorDeCedula(ced);
			return "OK";
		}catch(Exception e) {
			e.printStackTrace();
			return "error";
		}	
		
	}


}
