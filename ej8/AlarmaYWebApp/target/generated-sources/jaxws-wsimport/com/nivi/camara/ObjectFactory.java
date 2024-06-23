
package com.nivi.camara;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nivi.camara package. 
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

    private final static QName _StreamResponse_QNAME = new QName("http://camara.nivi.com/", "streamResponse");
    private final static QName _Stream_QNAME = new QName("http://camara.nivi.com/", "stream");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nivi.camara
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Stream }
     * 
     */
    public Stream createStream() {
        return new Stream();
    }

    /**
     * Create an instance of {@link StreamResponse }
     * 
     */
    public StreamResponse createStreamResponse() {
        return new StreamResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://camara.nivi.com/", name = "streamResponse")
    public JAXBElement<StreamResponse> createStreamResponse(StreamResponse value) {
        return new JAXBElement<StreamResponse>(_StreamResponse_QNAME, StreamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stream }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://camara.nivi.com/", name = "stream")
    public JAXBElement<Stream> createStream(Stream value) {
        return new JAXBElement<Stream>(_Stream_QNAME, Stream.class, null, value);
    }

}
