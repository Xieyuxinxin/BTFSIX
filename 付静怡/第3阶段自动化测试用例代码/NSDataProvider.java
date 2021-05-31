package utils;

import java.io.IOException;
import org.testng.annotations.DataProvider;

import utils.ExcelDataProvider;

public class NSDataProvider {
	@DataProvider(name="excel1")
	public Object[][] getExcelData1() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel1.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel2")
	public Object[][] getExcelData2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel2.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel3")
	public Object[][] getExcelData3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel4")
	public Object[][] getExcelData4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel5")
	public Object[][] getExcelData5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel5.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel6")
	public Object[][] getExcelData6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel6.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel7")
	public Object[][] getExcelData7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel7.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel8")
	public Object[][] getExcelData8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel8.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel9")
	public Object[][] getExcelData9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel9.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel10")
	public Object[][] getExcelData10() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel10.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel11")
	public Object[][] getExcelData11() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel11.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel12")
	public Object[][] getExcelData12() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel12.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel13")
	public Object[][] getExcelData13() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel13.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel14")
	public Object[][] getExcelData14() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel14.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel15")
	public Object[][] getExcelData15() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel15.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel16")
	public Object[][] getExcelData16() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel16.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel17")
	public Object[][] getExcelData17() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel17.xlsx","Sheet1");
	}
}
