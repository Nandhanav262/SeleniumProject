package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowhandling extends Base{
	
	public void multipleWindow() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String var=driver.getWindowHandle();
		System.out.println(var);
		String parent=driver.getWindowHandle();
		System.out.println("parentwindow"+parent);
		
		
		Set<String> all_window=driver.getWindowHandles();
		for(String temp:all_window) {
			System.out.println("windows handle"+temp);
			driver.switchTo().window(temp);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("*******************");
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowhandling multiplewindowhandling=new MultipleWindowhandling();
		multiplewindowhandling.initialize_Browse();
		multiplewindowhandling.multipleWindow();
		//multiplewindowhandling.driver_QuitandClose();
		
	}

}
