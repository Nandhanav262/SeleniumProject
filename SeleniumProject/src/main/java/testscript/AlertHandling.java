package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	

	public void simple()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement green=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		green.click();
		String val=driver.switchTo().alert().getText();
		System.out.println(val);
		driver.switchTo().alert().accept();
	}

	public void confirmation() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement yellow=driver.findElement(By.className("btn btn-warning"));
		yellow.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	
	public void prompt() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement red=driver.findElement(By.className("btn btn-danger"));
		red.click();
		driver.switchTo().alert().sendKeys("appu");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
AlertHandling alerthandling=new AlertHandling();
alerthandling.initialize_Browse();
alerthandling.simple();
//alerthandling.confirmation();
//alerthandling.prompt();
//alerthandling.driver_QuitandClose();

	}

}
