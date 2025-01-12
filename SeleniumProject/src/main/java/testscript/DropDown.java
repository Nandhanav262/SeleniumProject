package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement find=driver.findElement(By.cssSelector("select#single-input-field"));
		Select select=new Select(find);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Yellow");
		select.selectByIndex(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDown dropdown=new DropDown();
dropdown.initialize_Browse();
dropdown.dropDown();
//dropdown.driver_QuitandClose();
		
	}

}
