package com.Test;

public class TestExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String data1=Library.getExcelTestDataString("Sheet1", 0, 0);
		String data2=Library.getExcelTestDataString("Sheet1", 0, 1);
		//String data3=Library.getExcelTestDataString("Sheet2", 1, 1);
		System.out.println(data1);
		System.out.println(data2);
		
		String data4=String.valueOf(Library.getExcelTestDataNumeric("Sheet1", 0, 3));
		data4.replace(".0", "");
		
		
		
	}

}
