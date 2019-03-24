// launchApp  : To Launch Application
// closeApp   : To close Application
// excelCon   : To connect to excel
// elementsCount : To count number of elements

package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	public List<WebElement> values;
	
	// Method Name : launchApp
	// Description : To Launch App
	// Author      : Kishore Kumar
	// Date Created: 03/21/2019
	//****************************************************
	public void launchApp(String url, String sspath) throws Exception {
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//*************************************************************
	// Method Name : closeApp
	// Description : To Close App
	// Author      : Kishore Kumar
	// Date Created: 03/21/2019
	//****************************************************
     public void closeApp(){
    	 driver.close(); }
//*******************************************************
     public void elementAvailable(WebElement element, boolean exp, String sspath) throws Exception {
    	 boolean a=element.isDisplayed();
    	 if(a==exp)
    	 {
    		 System.out.println("Pass");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));
    	 }
    	 else
    	 {
    		 System.out.println("Fail");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));
    	 }
     }
     //*****************************************************
     public void excelCon(String path, String Sname) throws Exception {
    	 f=new FileInputStream(path);
    	 wb=Workbook.getWorkbook(f);
    	 s=wb.getSheet(Sname);
     }
     //*****************************************************************
     public void elementsCount(String loc, int exp, String sspath) throws Exception {
    	 List<WebElement> elements=driver.findElements(By.tagName(loc));
    	 if(elements.size()==exp)
    	 {
    		 System.out.println("Pass");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath)); 
    	 }
    	 else
    	 {
    		 System.out.println("Fail");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));
    	 }
     }
     //***************************************************************
     public void titleLength(int exp, String sspath) throws Exception {
    	 String a=driver.getTitle();
    	 if(a.length()==exp)
    	 {
    		 System.out.println("Pass");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));  
    	 }
    	 else
    	 {
    		 System.out.println("Fail");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));  
    	 }
     }
     //****************************************************************
     public void titleContains(String sexp, boolean bexp, String sspath) throws Exception {
    	 String a=driver.getTitle();
    	 if(a.contains(sexp)==bexp)
    	 {
    		 System.out.println("Pass");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));  
    	 }
    	 else
    	 {
    		 System.out.println("Fail");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));  
    	 }
     }
     //****************************************************************
     public void elementEnabled(WebElement element, boolean exp, String sspath) throws Exception {
    	 boolean a=element.isEnabled();
    	 if(a==exp)
    	 {
    		 System.out.println("Pass");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));
    	 }
    	 else
    	 {
    		 System.out.println("Fail");
    		 File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		 FileUtils.copyFile(f, new File(sspath));
    	 }
     }
     //*********************************************************************
     public void valuesInDropdown(WebElement element, String loc, int exp){
    	 values=element.findElements(By.tagName(loc));
    	 if(values.size()==exp)
    	      System.out.println("Pass");
    	 else
    		 System.out.println("Fail");
     }
     //*****************************************************************
}