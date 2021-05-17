package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	@Test(dataProvider = "txt")
	public void getData(String a, String b) {
		System.out.println(a + " " + b);

	}

	@DataProvider(name = "excel")
	public Object[][] getExcelDada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/user.xlsx", "Sheet1");
	}

	@Test(dataProvider = "mysql")
	public void testDB(String a, String b) {
		System.out.println(a + " " + b);
	}


	@DataProvider(name = "excel_info_1")
	public Object[][] getExcel_info_1_Dada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel_info_1.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel_info_2")
	public Object[][] getExcel_info_2_Dada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel_info_2.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel_info_3")
	public Object[][] getExcel_info_3_Dada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel_info_3.xlsx", "Sheet1");
	}

}
