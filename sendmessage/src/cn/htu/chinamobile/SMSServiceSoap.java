/**
 * SMSServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package cn.htu.chinamobile;

public interface SMSServiceSoap extends java.rmi.Remote {
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public java.lang.String smsSend(java.lang.String JSHM, java.lang.String DXNR, int _return, java.lang.String loginName, java.lang.String loginPwd) throws java.rmi.RemoteException;
    public void smsReceive(java.lang.String loginName, java.lang.String loginPwd, cn.htu.chinamobile._SmsReceiveResponse_SmsReceiveResultHolder smsReceiveResult, javax.xml.rpc.holders.StringHolder results) throws java.rmi.RemoteException;
}
