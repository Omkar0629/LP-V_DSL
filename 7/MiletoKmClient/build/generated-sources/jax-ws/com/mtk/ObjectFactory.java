
package com.mtk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mtk package. 
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

    private final static QName _Miletokm_QNAME = new QName("http://mtk.com/", "miletokm");
    private final static QName _MiletokmResponse_QNAME = new QName("http://mtk.com/", "miletokmResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mtk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Miletokm }
     * 
     */
    public Miletokm createMiletokm() {
        return new Miletokm();
    }

    /**
     * Create an instance of {@link MiletokmResponse }
     * 
     */
    public MiletokmResponse createMiletokmResponse() {
        return new MiletokmResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Miletokm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtk.com/", name = "miletokm")
    public JAXBElement<Miletokm> createMiletokm(Miletokm value) {
        return new JAXBElement<Miletokm>(_Miletokm_QNAME, Miletokm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiletokmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mtk.com/", name = "miletokmResponse")
    public JAXBElement<MiletokmResponse> createMiletokmResponse(MiletokmResponse value) {
        return new JAXBElement<MiletokmResponse>(_MiletokmResponse_QNAME, MiletokmResponse.class, null, value);
    }

}
