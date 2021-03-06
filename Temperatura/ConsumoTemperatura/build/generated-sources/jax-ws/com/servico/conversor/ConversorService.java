
package com.servico.conversor;

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
@WebServiceClient(name = "ConversorService", targetNamespace = "http://conversor.servico.com/", wsdlLocation = "http://localhost:8080/ConverteTemperatura/ConversorService?wsdl")
public class ConversorService
    extends Service
{

    private final static URL CONVERSORSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERSORSERVICE_EXCEPTION;
    private final static QName CONVERSORSERVICE_QNAME = new QName("http://conversor.servico.com/", "ConversorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ConverteTemperatura/ConversorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERSORSERVICE_WSDL_LOCATION = url;
        CONVERSORSERVICE_EXCEPTION = e;
    }

    public ConversorService() {
        super(__getWsdlLocation(), CONVERSORSERVICE_QNAME);
    }

    public ConversorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERSORSERVICE_QNAME, features);
    }

    public ConversorService(URL wsdlLocation) {
        super(wsdlLocation, CONVERSORSERVICE_QNAME);
    }

    public ConversorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERSORSERVICE_QNAME, features);
    }

    public ConversorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConversorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Conversor
     */
    @WebEndpoint(name = "ConversorPort")
    public Conversor getConversorPort() {
        return super.getPort(new QName("http://conversor.servico.com/", "ConversorPort"), Conversor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Conversor
     */
    @WebEndpoint(name = "ConversorPort")
    public Conversor getConversorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://conversor.servico.com/", "ConversorPort"), Conversor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERSORSERVICE_EXCEPTION!= null) {
            throw CONVERSORSERVICE_EXCEPTION;
        }
        return CONVERSORSERVICE_WSDL_LOCATION;
    }

}
