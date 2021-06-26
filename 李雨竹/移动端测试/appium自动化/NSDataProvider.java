package dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	//2、创建多人群组会话
	@DataProvider(name = "excel1")
	public Object[][] getExcelDada1() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel1.xlsx", "Sheet1");
	}

	//3、讨论组创建成功是否有广播消息向群成员提示群组会话由谁创建
	@DataProvider(name = "excel2")
	public Object[][] getExcelDada2() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel2.xlsx", "Sheet1");
	}

	//4、任意登录一用户帐号，测试聊天列表默认显示“小喧喧”通知中心
	@DataProvider(name = "excel3")
	public Object[][] getExcelDada3() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx", "Sheet1");
	}

	//20、测试被@后是否可以收到提示信息
	@DataProvider(name = "excel4")
	public Object[][] getExcelDada4() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx", "Sheet1");
	}

}
