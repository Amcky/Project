/**
 * SMSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package cn.htu.chinamobile;

public class SMSServiceLocator extends org.apache.axis.client.Service implements cn.htu.chinamobile.SMSService {

    // Use to get a proxy class for SMSServiceSoap12
    private final java.lang.String SMSServiceSoap12_address = "http://221.176.146.206:88/SMS_Service/SMSService.asmx";

    public java.lang.String getSMSServiceSoap12Address() {
        return SMSServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMSServiceSoap12WSDDServiceName = "SMSServiceSoap12";

    public java.lang.String getSMSServiceSoap12WSDDServiceName() {
        return SMSServiceSoap12WSDDServiceName;
    }

    public void setSMSServiceSoap12WSDDServiceName(java.lang.String name) {
        SMSServiceSoap12WSDDServiceName = name;
    }

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SMSServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMSServiceSoap12(endpoint);
    }

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.htu.chinamobile.SMSServiceSoap12Stub _stub = new cn.htu.chinamobile.SMSServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getSMSServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }


    // Use to get a proxy class for SMSServiceSoap
    private final java.lang.String SMSServiceSoap_address = "http://221.176.146.206:88/SMS_Service/SMSService.asmx";

    public java.lang.String getSMSServiceSoapAddress() {
        return SMSServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMSServiceSoapWSDDServiceName = "SMSServiceSoap";

    public java.lang.String getSMSServiceSoapWSDDServiceName() {
        return SMSServiceSoapWSDDServiceName;
    }

    public void setSMSServiceSoapWSDDServiceName(java.lang.String name) {
        SMSServiceSoapWSDDServiceName = name;
    }

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SMSServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMSServiceSoap(endpoint);
    }

    public cn.htu.chinamobile.SMSServiceSoap getSMSServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.htu.chinamobile.SMSServiceSoapStub _stub = new cn.htu.chinamobile.SMSServiceSoapStub(portAddress, this);
            _stub.setPortName(getSMSServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.htu.chinamobile.SMSServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.htu.chinamobile.SMSServiceSoap12Stub _stub = new cn.htu.chinamobile.SMSServiceSoap12Stub(new java.net.URL(SMSServiceSoap12_address), this);
                _stub.setPortName(getSMSServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (cn.htu.chinamobile.SMSServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.htu.chinamobile.SMSServiceSoapStub _stub = new cn.htu.chinamobile.SMSServiceSoapStub(new java.net.URL(SMSServiceSoap_address), this);
                _stub.setPortName(getSMSServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("SMSServiceSoap12".equals(inputPortName)) {
            return getSMSServiceSoap12();
        }
        else if ("SMSServiceSoap".equals(inputPortName)) {
            return getSMSServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SMSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("SMSServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("SMSServiceSoap"));
        }
        return ports.iterator();
    }

}
