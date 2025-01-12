package testscript;

public class Browser_commands extends Base {
	public void browser_Commands()
	{
	//String title=driver.getTitle();	
	//System.out.println(title);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser_commands browsercommands=new Browser_commands();
		browsercommands.initialize_Browse();
		browsercommands.browser_Commands();
		browsercommands.driver_QuitandClose();
	
	}

}
