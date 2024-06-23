
package com.nivi.seguridadmuseoservice;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReconocimientoService", targetNamespace = "http://seguridadmuseoservice.nivi.com/", wsdlLocation = "http://localhost:8080/seguridadWS?WSDL")
public class ReconocimientoService
    extends Service
{

    private final static URL RECONOCIMIENTOSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECONOCIMIENTOSERVICE_EXCEPTION;
    private final static QName RECONOCIMIENTOSERVICE_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "ReconocimientoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/seguridadWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECONOCIMIENTOSERVICE_WSDL_LOCATION = url;
        RECONOCIMIENTOSERVICE_EXCEPTION = e;
    }

    public ReconocimientoService() {
        super(__getWsdlLocation(), RECONOCIMIENTOSERVICE_QNAME);
    }

    public ReconocimientoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECONOCIMIENTOSERVICE_QNAME, features);
    }

    public ReconocimientoService(URL wsdlLocation) {
        super(wsdlLocation, RECONOCIMIENTOSERVICE_QNAME);
    }

    public ReconocimientoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECONOCIMIENTOSERVICE_QNAME, features);
    }

    public ReconocimientoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReconocimientoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Reconocimiento
     */
    @WebEndpoint(name = "ReconocimientoPort")
    public Reconocimiento getReconocimientoPort() {
        return super.getPort(new QName("http://seguridadmuseoservice.nivi.com/", "ReconocimientoPort"), Reconocimiento.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Reconocimiento
     */
    @WebEndpoint(name = "ReconocimientoPort")
    public Reconocimiento getReconocimientoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://seguridadmuseoservice.nivi.com/", "ReconocimientoPort"), Reconocimiento.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECONOCIMIENTOSERVICE_EXCEPTION!= null) {
            throw RECONOCIMIENTOSERVICE_EXCEPTION;
        }
        return RECONOCIMIENTOSERVICE_WSDL_LOCATION;
    }

}
