package com.w3schools.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-18T11:57:16.359+05:30
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "TempConvert", 
                  wsdlLocation = "http://www.w3schools.com/webservices/tempconvert.asmx?wsdl",
                  targetNamespace = "http://www.w3schools.com/webservices/") 
public class TempConvert extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.w3schools.com/webservices/", "TempConvert");
    public final static QName TempConvertSoap12 = new QName("http://www.w3schools.com/webservices/", "TempConvertSoap12");
    public final static QName TempConvertSoap = new QName("http://www.w3schools.com/webservices/", "TempConvertSoap");
    public final static QName TempConvertHttpPost = new QName("http://www.w3schools.com/webservices/", "TempConvertHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://www.w3schools.com/webservices/tempconvert.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TempConvert.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.w3schools.com/webservices/tempconvert.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TempConvert(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TempConvert(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConvert() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TempConvert(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TempConvert(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TempConvert(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap12")
    public TempConvertSoap getTempConvertSoap12() {
        return super.getPort(TempConvertSoap12, TempConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap12")
    public TempConvertSoap getTempConvertSoap12(WebServiceFeature... features) {
        return super.getPort(TempConvertSoap12, TempConvertSoap.class, features);
    }
    /**
     *
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap() {
        return super.getPort(TempConvertSoap, TempConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap(WebServiceFeature... features) {
        return super.getPort(TempConvertSoap, TempConvertSoap.class, features);
    }
    /**
     *
     * @return
     *     returns TempConvertHttpPost
     */
    @WebEndpoint(name = "TempConvertHttpPost")
    public TempConvertHttpPost getTempConvertHttpPost() {
        return super.getPort(TempConvertHttpPost, TempConvertHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertHttpPost
     */
    @WebEndpoint(name = "TempConvertHttpPost")
    public TempConvertHttpPost getTempConvertHttpPost(WebServiceFeature... features) {
        return super.getPort(TempConvertHttpPost, TempConvertHttpPost.class, features);
    }

}
