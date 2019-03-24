package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.BM_HomePage;
import com.qshore.Methods;

public class BM_Module1 {
	//*******************************************************
	// Test Case Name : BM_Mod1_TC01
	// Test Name : AT_BM_Mod1_TC01
	// Module Name : Module1
	// Project Name : BOFA
	// Release Name : March2019
	// Author       : Kishore Kumar
	//*******************************************************
	public void BM_Mod1_TC01() throws Exception {
		
		// Creating Object for Methods Class
		Methods m=new Methods();
		// Importing ExcelCon Method
		m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Data\\Kishore\\Mod1_TC01.xls", "Sheet1");
		// Launch Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\launchApp.png");
        
		// Verifying Title Length is 30 or not
		m.titleLength(30, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\titlelength.png");
		// Verifying Title contains India or not
		m.titleContains("India", true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\titlecontainsIndia.png");
		
		// Importing Page Object class by using Pagefactory method
		BM_HomePage BM_Home_Page=PageFactory.initElements(m.driver, BM_HomePage.class);
		
		// Verifying Profilefor element available or not
		m.elementAvailable(BM_Home_Page.BM_Home_ProfileFor, true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\ProfileForAvailable.png");
		// Verifying Name is enabled or not
		m.elementEnabled(BM_Home_Page.BM_Home_Name, true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\NameEnabled.png");
		// Importing Select Class
		Select profilefor=new Select(BM_Home_Page.BM_Home_ProfileFor);
		// Select Value in Profile For based on Index
		profilefor.selectByIndex(4);
		// Number of values in profilefor dropdown
		m.valuesInDropdown(BM_Home_Page.BM_Home_ProfileFor, "option", 10);
		// Verifying second value in dropdown
		if(m.values.get(1).equals("Son")==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		//Enter Name in TextBox
		BM_Home_Page.BM_Home_Name.sendKeys(m.s.getCell("A2").getContents());
		// Verifying Number Of Links are 30 or not
		m.elementsCount("a", 30, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\linksCount.png");
		
		// Clicking On Telugu link
		BM_Home_Page.BM_Home_TeluguLink.click();
		
		// Importing WebdriverWait
		WebDriverWait ww=new WebDriverWait(m.driver, 60);
		
		// Waiting until urlcontains telugu
		//ww.until(ExpectedConditions.urlToBe("https://www.telugumatrimony.com/"));
		
		// Verifying Title Contains Telugu
		m.titleContains("Telugu", true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\TitleContainsTelugu.png");
		m.closeApp();
	}
	//**********************************************************************************
	//*******************************************************
		// Test Case Name : BM_Mod1_TC02
		// Test Name : AT_BM_Mod1_TC02
		// Module Name : Module1
		// Project Name : BOFA
		// Release Name : March2019
		// Author       : Kishore Kumar
		//*******************************************************
		public void BM_Mod1_TC02() throws Exception {
			
			// Creating Object for Methods Class
			Methods m=new Methods();
			// Importing ExcelCon Method
			m.excelCon("C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Data\\Kishore\\Mod1_TC01.xls", "Sheet1");
			// Launch Application
			m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\launchApp.png");
	        
			// Verifying Title Length is 30 or not
			m.titleLength(30, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\titlelength.png");
			// Verifying Title contains India or not
			m.titleContains("India", true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\titlecontainsIndia.png");
			
			// Importing Page Object class by using Pagefactory method
			BM_HomePage BM_Home_Page=PageFactory.initElements(m.driver, BM_HomePage.class);
			
			// Verifying Profilefor element available or not
			m.elementAvailable(BM_Home_Page.BM_Home_ProfileFor, true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\ProfileForAvailable.png");
			// Verifying Name is enabled or not
			m.elementEnabled(BM_Home_Page.BM_Home_Name, true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\NameEnabled.png");
			// Importing Select Class
			Select profilefor=new Select(BM_Home_Page.BM_Home_ProfileFor);
			// Select Value in Profile For based on Index
			profilefor.selectByIndex(4);
			// Number of values in profilefor dropdown
			m.valuesInDropdown(BM_Home_Page.BM_Home_ProfileFor, "option", 10);
			// Verifying second value in dropdown
			if(m.values.get(1).equals("Son")==true)
				System.out.println("Pass");
			else
				System.out.println("Fail");
			//Enter Name in TextBox
			BM_Home_Page.BM_Home_Name.sendKeys(m.s.getCell("A2").getContents());
			// Verifying Number Of Links are 30 or not
			m.elementsCount("a", 30, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\linksCount.png");
			
			// Clicking On Telugu link
			BM_Home_Page.BM_Home_TeluguLink.click();
			
			// Importing WebdriverWait
			WebDriverWait ww=new WebDriverWait(m.driver, 60);
			
			// Waiting until urlcontains telugu
			//ww.until(ExpectedConditions.urlToBe("https://www.telugumatrimony.com/"));
			
			// Verifying Title Contains Telugu
			m.titleContains("Telugu", true, "C:\\Users\\Kishore Kumar\\Desktop\\FW9\\Test Results\\Kishore\\Mod1\\TC01\\TitleContainsTelugu.png");
			m.closeApp();
		}
		//**********************************************************************************
	
}
