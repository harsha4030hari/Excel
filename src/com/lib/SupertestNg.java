package com.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SupertestNg 
{
public WebDriver driver;
@BeforeMethod
public void precondition()
{
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://demo.actitime.com");

}
@AfterMethod
public void postcondition()
{
	driver.quit();
}
}
