
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.w3schools.webservices;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-18T11:57:16.329+05:30
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "TempConvert",
                      portName = "TempConvertHttpPost",
                      targetNamespace = "http://www.w3schools.com/webservices/",
                      wsdlLocation = "http://www.w3schools.com/webservices/tempconvert.asmx?wsdl",
                      endpointInterface = "com.w3schools.webservices.TempConvertHttpPost")
                      
public class TempConvertHttpPostImpl implements TempConvertHttpPost {

    private static final Logger LOG = Logger.getLogger(TempConvertHttpPostImpl.class.getName());

    /* (non-Javadoc)
     * @see com.w3schools.webservices.TempConvertHttpPost#fahrenheitToCelsius(java.lang.String  fahrenheit )*
     */
    public java.lang.String fahrenheitToCelsius(java.lang.String fahrenheit) { 
        LOG.info("Executing operation fahrenheitToCelsius");
        System.out.println(fahrenheit);
        try {
            java.lang.String _return = "_return870885808";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.w3schools.webservices.TempConvertHttpPost#celsiusToFahrenheit(java.lang.String  celsius )*
     */
    public java.lang.String celsiusToFahrenheit(java.lang.String celsius) { 
        LOG.info("Executing operation celsiusToFahrenheit");
        System.out.println(celsius);
        try {
            java.lang.String _return = "_return-591620607";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
