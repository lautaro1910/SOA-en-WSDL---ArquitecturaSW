
package com.nivi.camara;

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
@WebServiceClient(name = "CamaraDataService", targetNamespace = "http://camara.nivi.com/", wsdlLocation = "http://localhost:3000/stream?WSDL")
public class CamaraDataService
    extends Service
{

    private final static URL CAMARADATASERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMARADATASERVICE_EXCEPTION;
    private final static QName CAMARADATASERVICE_QNAME = new QName("http://camara.nivi.com/", "CamaraDataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:3000/stream?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMARADATASERVICE_WSDL_LOCATION = url;
        CAMARADATASERVICE_EXCEPTION = e;
    }

    public CamaraDataService() {
        super(__getWsdlLocation(), CAMARADATASERVICE_QNAME);
    }

    public CamaraDataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAMARADATASERVICE_QNAME, features);
    }

    public CamaraDataService(URL wsdlLocation) {
        super(wsdlLocation, CAMARADATASERVICE_QNAME);
    }

    public CamaraDataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAMARADATASERVICE_QNAME, features);
    }

    public CamaraDataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CamaraDataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CamaraData
     */
    @WebEndpoint(name = "CamaraDataPort")
    public CamaraData getCamaraDataPort() {
        return super.getPort(new QName("http://camara.nivi.com/", "CamaraDataPort"), CamaraData.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CamaraData
     */
    @WebEndpoint(name = "CamaraDataPort")
    public CamaraData getCamaraDataPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://camara.nivi.com/", "CamaraDataPort"), CamaraData.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMARADATASERVICE_EXCEPTION!= null) {
            throw CAMARADATASERVICE_EXCEPTION;
        }
        return CAMARADATASERVICE_WSDL_LOCATION;
    }

}
