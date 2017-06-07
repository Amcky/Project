/**
 * SMSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package cn.htu.chinamobile;

public interface SMSService extends javax.xml.rpc.Service {
    public java.lang.String getSMSServiceSoap12Address();

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap12() throws javax.xml.rpc.ServiceException;

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getSMSServiceSoapAddress();

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap() throws javax.xml.rpc.ServiceException;

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
