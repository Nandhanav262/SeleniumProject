package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextField extends Base {

	
	public void textField()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement text=driver.findElement(By.id("single-input-field"));
		text.sendKeys("haii");
		WebElement button=driver.findElement(By.id("button-one"));
		button.click();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TextField textfield=new TextField();
textfield.initialize_Browse();
textfield.textField();
//textfield.driver_QuitandClose();

	}

}
