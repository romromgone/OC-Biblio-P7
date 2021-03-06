
package generated.clientserviceOuvrage;

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
@WebServiceClient(name = "OuvrageService", targetNamespace = "http://services.webservice.ocp4.com/", wsdlLocation = "http://localhost:8085/bibliotheque-webservice/OuvrageService?wsdl")
public class OuvrageService_Service
    extends Service
{

    private final static URL OUVRAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException OUVRAGESERVICE_EXCEPTION;
    private final static QName OUVRAGESERVICE_QNAME = new QName("http://services.webservice.ocp4.com/", "OuvrageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/bibliotheque-webservice/OuvrageService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OUVRAGESERVICE_WSDL_LOCATION = url;
        OUVRAGESERVICE_EXCEPTION = e;
    }

    public OuvrageService_Service() {
        super(__getWsdlLocation(), OUVRAGESERVICE_QNAME);
    }

    public OuvrageService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OUVRAGESERVICE_QNAME, features);
    }

    public OuvrageService_Service(URL wsdlLocation) {
        super(wsdlLocation, OUVRAGESERVICE_QNAME);
    }

    public OuvrageService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OUVRAGESERVICE_QNAME, features);
    }

    public OuvrageService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OuvrageService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OuvrageService
     */
    @WebEndpoint(name = "OuvrageServicePort")
    public OuvrageService getOuvrageServicePort() {
        return super.getPort(new QName("http://services.webservice.ocp4.com/", "OuvrageServicePort"), OuvrageService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OuvrageService
     */
    @WebEndpoint(name = "OuvrageServicePort")
    public OuvrageService getOuvrageServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.webservice.ocp4.com/", "OuvrageServicePort"), OuvrageService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OUVRAGESERVICE_EXCEPTION!= null) {
            throw OUVRAGESERVICE_EXCEPTION;
        }
        return OUVRAGESERVICE_WSDL_LOCATION;
    }

}
