package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxdemo extends Base {
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box=driver.findElement(By.cssSelector("input#gridCheck"));
		box.click();
		WebElement button=driver.findElement(By.id("button-two"));
		button.click();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxdemo checkboxdemo=new CheckBoxdemo();
		checkboxdemo.initialize_Browse();
		checkboxdemo.checkBox();
		//checkboxdemo.driver_QuitandClose();
	}

}