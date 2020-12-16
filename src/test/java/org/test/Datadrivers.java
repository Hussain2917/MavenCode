package org.test;

import org.testng.annotations.DataProvider;

public class Datadrivers {
	
	@DataProvider(name="datas")
	public static Object[][]  getValue() {
		return new Object[][] { {"purushothaman", "vaishu@12345"} };

	}

}
