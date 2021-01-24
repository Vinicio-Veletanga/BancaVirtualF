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

import ec.edu.ups.BancaVirtualF.modelo.CuentaDeAhorro;
/**
 * @author ADMINX
 *
 */
@Entity
public class Cliente implements Serializable { 
	//Atributos de la entidad
	@Id 
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "idcl")
	//private int idcl;
	@Column(name="cedula_cliente")
	private String cedula; 
	private String nombre; 
	private String apellido; 
	private String direccion; 
	private String telefono1; 
	private String telefono2; 
	private String correo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimiento;
	//@Column(name="usuario")
	private String usuario; 
	private String clave;  
	private String estado;
	
//	@OneToMany(mappedBy = "cliente")
//	private Set<CuentaDeAhorro> cuentaDeAhorro;
//
//	public Set<CuentaDeAhorro> getCuentaDeAhorro() {
//		return cuentaDeAhorro;
//	}
//
//	public void setCuentaDeAhorro(Set<CuentaDeAhorro> cuentaDeAhorro) {
//		this.cuentaDeAhorro = cuentaDeAhorro;
//	}
	
	public Cliente() {

	} 
	
	
	




	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCedula() {
		return cedula;
	}  
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	} 
	
	public String getNombre() {
		return nombre;
	} 
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	public String getApellido() {
		return apellido;
	} 
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	} 
	
	public String getDireccion() {
		return direccion;
	} 
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	} 
	
	
	public String getTelefono1() {
		return telefono1;
	} 
	
	
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	} 
	
	public String getTelefono2() {
		return telefono2;
	} 
	
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	} 
	
	public String getCorreo() {
		return correo;
	} 
	
	public void setCorreo(String correo) {
		this.correo = correo;
	} 
	
	public String getUsuario() {
		return usuario;
	} 
	

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	} 
	
	
	public String getClave() {
		return clave;
	} 
	

	public void setClave(String clave) {
		this.clave = clave;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", telefono1=" + telefono1 + ", telefono2=" + telefono2 + ", correo=" + correo
				+ ", fechaNacimiento=" + fechaNacimiento + ", usuario=" + usuario + ", clave=" + clave + ", estado="
				+ estado + "]";
	} 
	
	
	
	
}
