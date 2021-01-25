package ec.edu.ups.BancaVirtualF.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import ec.edu.ups.BancaVirtualF.modelo.Cliente;

/**
 * @author ADMINX
 *
 */
@Entity(name="cuentadeahorro")
public class CuentaDeAhorro implements Serializable {
	// Atributos de la clase
	//private static  final long serialVersionUID = 1L;

	@Id
	@Column(name = "numero_cuenta")
	private String numeroCuentaDeAhorro;
	private Date fechaDeRegistro;
	private String estadoCuenta;
	private Double saldoCuentaDeAhorro;
	// RELACION DE UNO CLIENTE A MUCHAS CUENTAS
	@ManyToOne
    @JoinColumn(name = "cedula_cliente")
	private Cliente cliente;
	@OneToMany(mappedBy="cuentadeahorro")
	List<Transaccion> Transaccion ;
	private String tipoCuenta;

	public String getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(String estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public CuentaDeAhorro() {

	}

	public String getNumeroCuentaDeAhorro() {
		return numeroCuentaDeAhorro;
	}

	public void setNumeroCuentaDeAhorro(String numeroCuentaDeAhorro) {
		this.numeroCuentaDeAhorro = numeroCuentaDeAhorro;
	}

	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public Double getSaldoCuentaDeAhorro() {
		return saldoCuentaDeAhorro;
	}

	public void setSaldoCuentaDeAhorro(Double saldoCuentaDeAhorro) {
		this.saldoCuentaDeAhorro = saldoCuentaDeAhorro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

	public List<Transaccion> getTransaccion() {
		return Transaccion;
	}

	public void setTransaccion(List<Transaccion> transaccion) {
		Transaccion = transaccion;
	}

	@Override
	public String toString() {
		return "CuentaDeAhorro [numeroCuentaDeAhorro=" + numeroCuentaDeAhorro + ", fechaDeRegistro=" + fechaDeRegistro
				+ ", estadoCuenta=" + estadoCuenta + ", saldoCuentaDeAhorro=" + saldoCuentaDeAhorro + ", cliente="
				+ cliente + ", Transaccion=" + Transaccion + ", tipoCuenta=" + tipoCuenta + "]";
	}



	
	


	
	
}
