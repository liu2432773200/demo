
package com.webservice.provider;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserAPIImplService", targetNamespace = "http://provider.webservice.com/", wsdlLocation = "http://localhost:8080/user/login?wsdl")
public class UserAPIImplService
    extends Service
{

    private final static URL USERAPIIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERAPIIMPLSERVICE_EXCEPTION;
    private final static QName USERAPIIMPLSERVICE_QNAME = new QName("http://provider.webservice.com/", "UserAPIImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/user/login?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERAPIIMPLSERVICE_WSDL_LOCATION = url;
        USERAPIIMPLSERVICE_EXCEPTION = e;
    }

    public UserAPIImplService() {
        super(__getWsdlLocation(), USERAPIIMPLSERVICE_QNAME);
    }

    public UserAPIImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERAPIIMPLSERVICE_QNAME, features);
    }

    public UserAPIImplService(URL wsdlLocation) {
        super(wsdlLocation, USERAPIIMPLSERVICE_QNAME);
    }

    public UserAPIImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERAPIIMPLSERVICE_QNAME, features);
    }

    public UserAPIImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserAPIImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserAPIImpl
     */
    @WebEndpoint(name = "UserAPIImplPort")
    public UserAPIImpl getUserAPIImplPort() {
        return super.getPort(new QName("http://provider.webservice.com/", "UserAPIImplPort"), UserAPIImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserAPIImpl
     */
    @WebEndpoint(name = "UserAPIImplPort")
    public UserAPIImpl getUserAPIImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://provider.webservice.com/", "UserAPIImplPort"), UserAPIImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERAPIIMPLSERVICE_EXCEPTION!= null) {
            throw USERAPIIMPLSERVICE_EXCEPTION;
        }
        return USERAPIIMPLSERVICE_WSDL_LOCATION;
    }

}
