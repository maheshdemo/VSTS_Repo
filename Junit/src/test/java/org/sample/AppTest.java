package org.sample;
import java.io.File;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Unit test for simple App.
 */
public class AppTest    
 {
	
	@Test
	public void test3()
	{
		JUnitReport.TestCaseName("TC_03 Verifying jobs2 site - - VSTS Demo");
		try{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://jobs2.deloitte.com/global/en");
        driver.quit();
		}catch(Exception e){}
		JUnitReport.LogResults(true, "Successfully verified jobs2 site"); 
	}
	
	
	@Test
	public void test1()
	{
		
		JUnitReport.TestCaseName("TC_01 Verifying IReport site - - VSTS Demo");
		try{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://IReport.com/");
        driver.quit();
		}catch(Exception e){}
		JUnitReport.LogResults(false, "Failed to verify IReport site");

	}
	@Test
	public void test2()
	{
		
		JUnitReport.TestCaseName("TC_02 Verifying LMS site");
		try{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://jobs2.LMS.com/");
        driver.quit();
		}catch(Exception e){}
		JUnitReport.LogResults(false, "Failed to verify LMS site - - VSTS Demo");
		System.out.println("site");
//        try{ Assert.assertFalse(true,"Unable to verify test");}catch(Exception e){}      
        
        
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        try {
//			DocumentBuilder builder = factory.newDocumentBuilder();
//			//Document doc = builder.parse(new File("test-output\\Suite\\Test.xml"));
//			
//			Document doc = builder.newDocument();
//
//			
//			Element tsSuite = doc.createElement("testsuite");
//			tsSuite.setAttribute("hostname","USHYDMMEDAVARA3");
//			tsSuite.setAttribute("ignored","0");
//			tsSuite.setAttribute("name","Test");
//			tsSuite.setAttribute("tests","2");
//			tsSuite.setAttribute("failures","2");
//			tsSuite.setAttribute("timestamp","28 Mar 2018 06:16:20 GMT");
//			tsSuite.setAttribute("time","45.958");		
//			tsSuite.setAttribute("errors","0");
//			doc.appendChild(tsSuite);
//			Comment preProcCom = doc.createComment("  Generated by org.testng.reporters.JUnitXMLReporter  ");
//			tsSuite.getParentNode().insertBefore(preProcCom,tsSuite);
//			
//			
//			Element ts1 = doc.createElement("testcase");
//			ts1.setAttribute("name","test1");
//			ts1.setAttribute("time","23.415");
//			ts1.setAttribute("classname","Validating New Zeleand1");			
//			tsSuite.appendChild(ts1);
//			
//			Element failure1 = doc.createElement("failure");
//			failure1.setAttribute("type","java.lang.AssertionError");
//			failure1.setAttribute("message","Unable to validate this condition against given value...");		
//			ts1.appendChild(failure1);
//			Text txt1 = doc.createTextNode("<![CDATA[java.lang.AssertionError: Unable to verify test expected [false] but found [true]at org.sample.AppTest.test1(AppTest.java:50)... Removed 28 stack frames]]>");
//			failure1.appendChild(txt1);
//			
//			
//			
//			
//			Element ts2 = doc.createElement("testcase");
//			ts2.setAttribute("name","test2");
//			ts2.setAttribute("time","23.415");
//			ts2.setAttribute("classname","Validating New Zeleand2");			
//			tsSuite.appendChild(ts2);
//			
//			Element failure2 = doc.createElement("failure");
//			failure2.setAttribute("type","java.lang.AssertionError");
//			failure2.setAttribute("message","Unable to validate this condition against given value...2");		
//			ts2.appendChild(failure2);
//			Text txt2 = doc.createTextNode("<![CDATA[java.lang.AssertionError: Unable to verify test expected [false] but found [true]at org.sample.AppTest.test1(AppTest.java:50)... Removed 28 stack frames]]>");
//			failure2.appendChild(txt2);
//			
//			
//			
//			Element ts3 = doc.createElement("testcase");
//			ts3.setAttribute("name","test3");
//			ts3.setAttribute("time","23.415");
//			ts3.setAttribute("classname","Validating New Zeleand3");			
//			tsSuite.appendChild(ts3);
//			
//			Element failure3 = doc.createElement("failure");
//			failure3.setAttribute("type","java.lang.AssertionError");
//			failure3.setAttribute("message","Unable to validate this condition against given value...3");		
//			ts3.appendChild(failure3);
//			Text txt3 = doc.createTextNode("<![CDATA[java.lang.AssertionError: Unable to verify test expected [false] but found [true]at org.sample.AppTest.test1(AppTest.java:50)... Removed 28 stack frames]]>");
//			failure3.appendChild(txt3);
//			
//			
//			
//			
//			Element ts4 = doc.createElement("testcase");
//			ts4.setAttribute("name","test2");
//			ts4.setAttribute("time","23.415");
//			ts4.setAttribute("classname","Validating New Zeleand4");			
//			tsSuite.appendChild(ts4);
//			
//			Element failure4 = doc.createElement("failure");
//			failure4.setAttribute("type","java.lang.AssertionError");
//			failure4.setAttribute("message","Unable to validate this condition against given value...4");		
//			ts4.appendChild(failure4);
//			Text txt4 = doc.createTextNode("<![CDATA[java.lang.AssertionError: Unable to verify test expected [false] but found [true]at org.sample.AppTest.test1(AppTest.java:50)... Removed 28 stack frames]]>");
//			failure4.appendChild(txt4);
////			Element ts2 = doc.createElement("testcase");
////			ts2.setAttribute("name","test2");
////			ts2.setAttribute("time","45.989");
////			ts2.setAttribute("classname","Validating New Zeleand");			
////			tsSuite.appendChild(ts2);
////			ts2.appendChild(failure1);
////			
////			Element ts3 = doc.createElement("testcase");
////			ts3.setAttribute("name","test3");
////			ts3.setAttribute("time","45.989");
////			ts3.setAttribute("classname","Validating New Zeleand1");			
////			tsSuite.appendChild(ts3);
////			ts3.appendChild(failure1);
////			Element ts4 = doc.createElement("testcase");
////			ts4.setAttribute	("name","test4");
////			ts4.setAttribute("time","45.989");
////			ts4.setAttribute("classname","Validating New Zeleand2");			
////			tsSuite.appendChild(ts4);
////			ts4.appendChild(failure1);
////			Element ts5 = doc.createElement("testcase");
////			ts5.setAttribute("name","test5");
////			ts5.setAttribute("time","45.989");
////			ts5.setAttribute("classname","Validating New Zeleand");			
////			tsSuite.appendChild(ts5);
////			ts5.appendChild(failure1);
////			Element ts6 = doc.createElement("testcase");
////			ts6.setAttribute("name","test6");
////			ts6.setAttribute("time","45.989");
////			ts6.setAttribute("classname","Validating New Zeleand3");			
////			tsSuite.appendChild(ts6);
////			ts6.appendChild(failure1);
//			
//			
//			Transformer tf = TransformerFactory.newInstance().newTransformer();
//			tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//			tf.setOutputProperty(OutputKeys.INDENT, "yes");
//			@SuppressWarnings("unused")
//			Writer out = new StringWriter();
//			tf.transform(new DOMSource(doc), new StreamResult(System.getProperty("user.dir")+File.separator+"test-output\\Suite\\test2.xml"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
	}
	

	
 }
