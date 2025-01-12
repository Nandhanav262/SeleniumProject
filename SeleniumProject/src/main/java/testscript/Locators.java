package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	//WebElement elementname=driver.findElement(By.Locator("locator value"));

	public void id()
	{
		WebElement id1=driver.findElement(By.id("single-input-field"));
		WebElement id2=driver.findElement(By.id("value-a"));
		WebElement id3=driver.findElement(By.id("message-two"));
		WebElement id4=driver.findElement(By.id("button-one"));
		WebElement id5=driver.findElement(By.id("value-b"));
	}
	
	public void name()
	{
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("keywords"));
		WebElement name4=driver.findElement(By.name("author"));
	}
	
	public void className()
	{
		WebElement class1=driver.findElement(By.className("header-top"));
		WebElement class2=driver.findElement(By.className("container page"));
		WebElement class3=driver.findElement(By.className("clearfix"));
		WebElement class4=driver.findElement(By.className("navbar-toggler"));
		WebElement class5=driver.findElement(By.className("header-top"));
	}
	
	
	
	public void linkText()
	{
		WebElement link1=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement link2=driver.findElement(By.linkText("Select Input"));
		WebElement link3=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement link4=driver.findElement(By.linkText("Jquery Select2"));
		WebElement link5=driver.findElement(By.linkText("Radio Buttons Demo"));
		
	}
	public void partialLinktext()
	{
		WebElement partial1=driver.findElement(By.partialLinkText("Simple Form D"));
		WebElement partial2=driver.findElement(By.partialLinkText("Select In"));
		WebElement partial3=driver.findElement(By.partialLinkText("Checkbox D"));
		WebElement partial4=driver.findElement(By.partialLinkText("Jquery Sel"));
		WebElement partial5=driver.findElement(By.partialLinkText("Radio Buttons D"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}