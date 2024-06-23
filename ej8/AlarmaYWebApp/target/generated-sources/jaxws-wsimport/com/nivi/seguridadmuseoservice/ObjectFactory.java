
package com.nivi.seguridadmuseoservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nivi.seguridadmuseoservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaceIDResponse_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "faceIDResponse");
    private final static QName _FaceID_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "faceID");
    private final static QName _SetAlertaResponse_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "setAlertaResponse");
    private final static QName _GetAlerta_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "getAlerta");
    private final static QName _SetAlerta_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "setAlerta");
    private final static QName _GetAlertaResponse_QNAME = new QName("http://seguridadmuseoservice.nivi.com/", "getAlertaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nivi.seguridadmuseoservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlertaResponse }
     * 
     */
    public GetAlertaResponse createGetAlertaResponse() {
        return new GetAlertaResponse();
    }

    /**
     * Create an instance of {@link SetAlerta }
     * 
     */
    public SetAlerta createSetAlerta() {
        return new SetAlerta();
    }

    /**
     * Create an instance of {@link GetAlerta }
     * 
     */
    public GetAlerta createGetAlerta() {
        return new GetAlerta();
    }

    /**
     * Create an instance of {@link FaceIDResponse }
     * 
     */
    public FaceIDResponse createFaceIDResponse() {
        return new FaceIDResponse();
    }

    /**
     * Create an instance of {@link SetAlertaResponse }
     * 
     */
    public SetAlertaResponse createSetAlertaResponse() {
        return new SetAlertaResponse();
    }

    /**
     * Create an instance of {@link FaceID }
     * 
     */
    public FaceID createFaceID() {
        return new FaceID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaceIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "faceIDResponse")
    public JAXBElement<FaceIDResponse> createFaceIDResponse(FaceIDResponse value) {
        return new JAXBElement<FaceIDResponse>(_FaceIDResponse_QNAME, FaceIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaceID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "faceID")
    public JAXBElement<FaceID> createFaceID(FaceID value) {
        return new JAXBElement<FaceID>(_FaceID_QNAME, FaceID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAlertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "setAlertaResponse")
    public JAXBElement<SetAlertaResponse> createSetAlertaResponse(SetAlertaResponse value) {
        return new JAXBElement<SetAlertaResponse>(_SetAlertaResponse_QNAME, SetAlertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "getAlerta")
    public JAXBElement<GetAlerta> createGetAlerta(GetAlerta value) {
        return new JAXBElement<GetAlerta>(_GetAlerta_QNAME, GetAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAlerta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "setAlerta")
    public JAXBElement<SetAlerta> createSetAlerta(SetAlerta value) {
        return new JAXBElement<SetAlerta>(_SetAlerta_QNAME, SetAlerta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://seguridadmuseoservice.nivi.com/", name = "getAlertaResponse")
    public JAXBElement<GetAlertaResponse> createGetAlertaResponse(GetAlertaResponse value) {
        return new JAXBElement<GetAlertaResponse>(_GetAlertaResponse_QNAME, GetAlertaResponse.class, null, value);
    }

}
