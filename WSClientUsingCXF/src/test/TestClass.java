package test;

import com.w3schools.webservices.TempConvert;
import com.w3schools.webservices.TempConvertHttpPost;
import com.w3schools.webservices.TempConvertSoap;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConvert service = new TempConvert();
		TempConvertSoap stub=service.getTempConvertSoap12();
		String far=stub.celsiusToFahrenheit("36");
		System.out.println("*************************");
		System.out.println(far);
		
		TempConvertSoap stub1 =service.getTempConvertSoap();
		System.out.println(stub1.celsiusToFahrenheit("36"));
	
		

	}

}
