
package com.w3schools.webservices;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2014-05-18T11:57:16.262+05:30
 * Generated source version: 2.7.11
 * 
 */
public final class TempConvertHttpPost_TempConvertHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://www.w3schools.com/webservices/", "TempConvert");

    private TempConvertHttpPost_TempConvertHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TempConvert.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TempConvert ss = new TempConvert(wsdlURL, SERVICE_NAME);
        TempConvertHttpPost port = ss.getTempConvertHttpPost();  
        
        {
        System.out.println("Invoking fahrenheitToCelsius...");
        java.lang.String _fahrenheitToCelsius_fahrenheit = "_fahrenheitToCelsius_fahrenheit1460734666";
        java.lang.String _fahrenheitToCelsius__return = port.fahrenheitToCelsius(_fahrenheitToCelsius_fahrenheit);
        System.out.println("fahrenheitToCelsius.result=" + _fahrenheitToCelsius__return);


        }
        {
        System.out.println("Invoking celsiusToFahrenheit...");
        java.lang.String _celsiusToFahrenheit_celsius = "_celsiusToFahrenheit_celsius787880314";
        java.lang.String _celsiusToFahrenheit__return = port.celsiusToFahrenheit(_celsiusToFahrenheit_celsius);
        System.out.println("celsiusToFahrenheit.result=" + _celsiusToFahrenheit__return);


        }

        System.exit(0);
    }

}
