package org.sample;



public class TestMain {

	public static void main(String[] args) throws InterruptedException {

//        long start = System.currentTimeMillis();
//		Thread.sleep(20005);
//		 long end = System.currentTimeMillis();
//		 System.out.println((end-start)/1000);
//		 System.out.println(end-start);
		JUnitReport.TestCaseName("TC_01 validating url redirects");
		Thread.sleep(1000);
		JUnitReport.LogResults(true, "Executed Sucessfully");

		
		JUnitReport.TestCaseName("TC_02validating url redirects");
		Thread.sleep(20000);
		JUnitReport.LogResults(false, "Failed to execute2");

		JUnitReport.TestCaseName("TC_03 validating url redirects");
		Thread.sleep(30000);
		JUnitReport.LogResults(false, "Failed to execute 3");


	}
}

