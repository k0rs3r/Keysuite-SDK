
/**
 * WSPECPECExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package it.kdm.doctoolkit.clients;

public class WSPECPECExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1421165312585L;
    
    private it.kdm.doctoolkit.clients.WSPECStub.WSPECPECException faultMessage;

    
        public WSPECPECExceptionException() {
            super("WSPECPECExceptionException");
        }

        public WSPECPECExceptionException(java.lang.String s) {
           super(s);
        }

        public WSPECPECExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public WSPECPECExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(it.kdm.doctoolkit.clients.WSPECStub.WSPECPECException msg){
       faultMessage = msg;
    }
    
    public it.kdm.doctoolkit.clients.WSPECStub.WSPECPECException getFaultMessage(){
       return faultMessage;
    }
}
    