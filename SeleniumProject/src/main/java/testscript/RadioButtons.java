package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends Base {
	
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement choose=driver.findElement(By.cssSelector("input#inlineRadio2"));
		choose.click();
		WebElement button=driver.findElement(By.cssSelector("button#button-one"));
		button.click();
		
	}
	
	public void select()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement choose=driver.findElement(By.cssSelector("input#inlineRadio2"));
		choose.click();
		if(choose.isSelected()) {
			System.out.println("Already selected");
		}
		else {
			choose.click();
			System.out.println("selected");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButtons radiobuttons=new RadioButtons();
		radiobuttons.initialize_Browse();
		//radiobuttons.radioButton();
		radiobuttons.select();
		//radiobuttons.driver_QuitandClose();
	}

}