package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Csselector extends Base {
			
	
public void tagAndid()
{
	//1.Tag and ID(tag#id)
WebElement tag1=driver.findElement(By.cssSelector("button#button-one"));	
WebElement tag2=driver.findElement(By.cssSelector("div#message-two"));
WebElement tag3=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
WebElement tag4=driver.findElement(By.cssSelector("input#value-b"));
WebElement tab5=driver.findElement(By.cssSelector("input#single-input-field"));
}
	
public void tagAndclass()
{
	//2.Tag and class(tag.class)
	WebElement class1=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement class2=driver.findElement(By.cssSelector("div.header-top"));
	WebElement class3=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement class4=driver.findElement(By.cssSelector("div.header-top"));
	WebElement class5=driver.findElement(By.cssSelector("section.clearfix"));
}
	
	public void tagAndattribute()
	{
		//3.Tag and Attribute(tag[attribute=value]
		WebElement attri1=driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement attri2=driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement attri3=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement attri4=driver.findElement(By.cssSelector("button[id=button-two]"));
		WebElement attri5=driver.findElement(By.cssSelector("input[id=value-a]"));
		
	}
	
	public void tagClassattribute()
	{
		//4.Tag,class,and Attribute(tag.classname[attribute=value]
		WebElement css1=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		WebElement css2=driver.findElement(By.cssSelector("div.my-2[id=message-two]"));
		WebElement css3=driver.findElement(By.cssSelector("div.top-logo[class=top-logo]"));
		WebElement css4=driver.findElement(By.cssSelector("div.mb-sec[class=mb-sec]"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}