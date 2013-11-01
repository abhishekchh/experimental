package test.xml.create;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.jamesmurty.utils.XMLBuilder;

public class CreateXML {
	static Properties outputProperties = new Properties();
	
	public CreateXML(){	

		// Explicitly identify the output as an XML document
		outputProperties.put(javax.xml.transform.OutputKeys.METHOD, "xml");

		// Pretty-print the XML output (doesn't work in all cases)
		outputProperties.put(javax.xml.transform.OutputKeys.INDENT, "yes");

		// Get 2-space indenting when using the Apache transformer
		outputProperties.put("{http://xml.apache.org/xslt}indent-amount", "2");

		// Omit the XML declaration header
		outputProperties.put(javax.xml.transform.OutputKeys.OMIT_XML_DECLARATION, "yes");

		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			XMLBuilder builder = XMLBuilder.create("Projects");
			
			XMLBuilder builder = XMLBuilder.create("dsfs");
			XMLBuilder e1 = builder.element("java-xmlbuilder");
			XMLBuilder e2 = builder.element("JetS3t");
			XMLBuilder e3=builder.element("pmlcore:Sensor");
//			XMLBuilder e4=builder.element("pmlcore:Sensor");
			e3.attribute("xmlns:pmlcore", "urn:autoid:specification:interchange:PMLCore:xml:schema:1");
			e3.attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			e3.text("VALUE");
			e1.attribute("language", "Java");
			e1.attribute("scm", "SVN");
			
			
			PrintWriter writer;
			try {
				writer = new PrintWriter(new FileOutputStream("projects.xml"));
				builder.toWriter(writer, outputProperties);
			} catch (FileNotFoundException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				System.out.println(builder.asString(outputProperties));
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
