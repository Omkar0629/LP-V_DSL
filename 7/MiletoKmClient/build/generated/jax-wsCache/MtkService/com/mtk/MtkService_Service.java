
package com.mtk;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MtkService", targetNamespace = "http://mtk.com/", wsdlLocation = "http://localhost:8080/MiletoKm/MtkService?wsdl")
public class MtkService_Service
    extends Service
{

    private final static URL MTKSERVICE_WSDL_LOCATION;
    private final static WebServiceException MTKSERVICE_EXCEPTION;
    private final static QName MTKSERVICE_QNAME = new QName("http://mtk.com/", "MtkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MiletoKm/MtkService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MTKSERVICE_WSDL_LOCATION = url;
        MTKSERVICE_EXCEPTION = e;
    }

    public MtkService_Service() {
        super(__getWsdlLocation(), MTKSERVICE_QNAME);
    }

    public MtkService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MTKSERVICE_QNAME, features);
    }

    public MtkService_Service(URL wsdlLocation) {
        super(wsdlLocation, MTKSERVICE_QNAME);
    }

    public MtkService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MTKSERVICE_QNAME, features);
    }

    public MtkService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MtkService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MtkService
     */
    @WebEndpoint(name = "MtkServicePort")
    public MtkService getMtkServicePort() {
        return super.getPort(new QName("http://mtk.com/", "MtkServicePort"), MtkService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MtkService
     */
    @WebEndpoint(name = "MtkServicePort")
    public MtkService getMtkServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mtk.com/", "MtkServicePort"), MtkService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MTKSERVICE_EXCEPTION!= null) {
            throw MTKSERVICE_EXCEPTION;
        }
        return MTKSERVICE_WSDL_LOCATION;
    }

}
