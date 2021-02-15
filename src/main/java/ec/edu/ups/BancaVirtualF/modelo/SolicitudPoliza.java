package ec.edu.ups.BancaVirtualF.modelo;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.*;

import ec.edu.ups.BancaVirtualF.dao.CuentaDeAhorroDAO;
import ec.edu.ups.BancaVirtualF.modelo.CuentaDeAhorro;
/**
 * @author ADMINX
 *
 */
@Entity
public class SolicitudPoliza implements Serializable { 
	//Atributos de la entidad
	private static  final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idsp")
	private int idsp; 
	private CuentaDeAhorro cuenta;
	private Poliza poliza;
	private String estado;
	public int getIdsp() {
		return idsp;
	}
	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}
	public CuentaDeAhorro getCuenta() {
		return cuenta;
	}
	public void setCuenta(CuentaDeAhorro cuenta) {
		this.cuenta = cuenta;
	}
	public Poliza getPoliza() {
		return poliza;
	}
	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
 
	
	 
	
	
	
}
