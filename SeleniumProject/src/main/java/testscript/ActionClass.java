package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base {
	public void actionClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions =new Actions(driver);
		actions.dragAndDrop(drag, drop).build().perform();

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionClass actionclass=new ActionClass();
		actionclass.initialize_Browse();
		actionclass.actionClass();
		//actionclass.driver_QuitandClose();

	}

}
