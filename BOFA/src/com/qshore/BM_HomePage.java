// Class Name : BM_HomePage
// Author    : Kishore Kumar
// Page Name : Home Page
// Date Created : 03/21/2019
//********************************************************
package com.qshore;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class BM_HomePage {	
	public @FindBy(xpath="//*[@id='REGISTERED_BY']") WebElement BM_Home_ProfileFor;
	public @FindBy(xpath="//*[@id='NAME']") WebElement BM_Home_Name;
	public @FindBy(xpath="//*[@id='gendermale']") WebElement BM_Home_MaleRadio;
	public @FindBy(xpath="//*[@id='close']/center/div[2]/div[3]/div/div/ul/li[11]/a") WebElement BM_Home_TeluguLink;

}
