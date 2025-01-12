package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	
	
	public void xpath()
	{
		//1.xPath  //tag[@attribute='value']
		WebElement xpath1=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement xpath2=driver.findElement(By.xpath("//div[@class='header-top']"));
		WebElement xpath3=driver.findElement(By.xpath("//div[@class='top-logo']"));
		WebElement xpath4=driver.findElement(By.xpath("//div[@class='container page']"));
		WebElement xpath5=driver.findElement(By.xpath("//button[@id='button-two']"));
	}
	
	public void contains()
	{
		//2.contains   //tag[contains(@attribute,'value')]
		WebElement xpath1=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement xpath2=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		WebElement xpath3=driver.findElement(By.xpath("//button[contains(@id,'button-two')]"));
		WebElement xpath4=driver.findElement(By.xpath("//button[contains(@class,'navbar-toggler')]"));
		WebElement xpath5=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
	}
	public void startsWith()
	{
		//3.startsWith()  //tag[starts-with(@attribute,'value')]
		WebElement xpath1=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		WebElement xpath2=driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
		WebElement xpath3=driver.findElement(By.xpath("//div[starts-with(@id,'message-two')]"));
		WebElement xpath4=driver.findElement(By.xpath("//button[starts-with(@class,'navbar-toggler')]"));
		WebElement xpath5=driver.findElement(By.xpath("//div[starts-with(@id,'message-one')]"));
	}
	public void text() {
	
	//text()     //tag[text()='text']
		WebElement xpath1=driver.findElement(By.xpath("//title[text()='Obsqura Testing']"));
		WebElement xpath2=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement xpath3=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement xpath4=driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement xpath5=driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
