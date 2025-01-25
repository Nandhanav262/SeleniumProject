package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		//WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		//System.out.println(table.getText());
		WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]"));
		System.out.println(row.getText());
	}
	public void cellPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement one=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td[2]"));
		System.out.println(one.getText());

	}
	public void coloumnPrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement list:col) {
			System.out.println(list.getText());
		}
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.initialize_Browse();
		//tablehandling.tablePrinting();
		//tablehandling.cellPrinting();
		tablehandling.coloumnPrinting();
		
		
	}

}
