package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base{

	public void frames() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement advertisement=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		advertisement.click();
		
		
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frames frames=new Frames();
frames.initialize_Browse();
frames.frames();

//frames.driver_QuitandClose();
	}

}
