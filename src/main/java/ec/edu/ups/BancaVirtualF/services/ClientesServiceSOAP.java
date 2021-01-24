/**
 * ClientesServiceSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ec.edu.ups.BancaVirtualF.services;

public interface ClientesServiceSOAP extends java.rmi.Remote {
   /* public ec.edu.ups.BancaVirtualF tra(java.lang.String arg0) throws java.rmi.RemoteException;*/
    public java.lang.String saludar() throws java.rmi.RemoteException;
    public java.lang.String transaccionservicio(java.lang.String arg0, double arg1, java.lang.String arg2) throws java.rmi.RemoteException;
}
