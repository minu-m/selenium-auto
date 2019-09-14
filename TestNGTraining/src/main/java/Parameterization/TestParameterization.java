package Parameterization;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelWizard.ExcelReader;

public class TestParameterization {

	@Test
	public void doLogin(String user, String pwd){
		
		System.out.println(user + "----" + pwd);
	}
	
	@DataProvider
	public static Object[][] getData() throws IOException{
		
		ExcelReader excel = new ExcelReader();
		excel.readExcel("C:\\Minu\\Selenium", "Logindetails.xls", "x seg");
		Object[][] data = new Object[5][2];
		return data;
		
		
	}
	
	
}
