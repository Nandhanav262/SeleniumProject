package testscript;

public class Navigation extends Base{
	public void navigations_Command()
	
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navigation navigation=new Navigation();
		navigation.initialize_Browse();
		navigation.navigations_Command();
		navigation.driver_QuitandClose();

	}

}