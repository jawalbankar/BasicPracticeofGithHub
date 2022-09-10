
public class BaseClass {
	static WebDriver driver;
	public LogInPage lp;
	
	@BeforeSuite
	public void launchURL()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("---start-maximized");
		options.addArguments("--disable-notifications");		
		driver=new ChromeDriver(options);
		driver.get("https://www.demoblaze.com/");

	}
	@BeforeClass
	public void objectCreations()
	{
		lp=new LogInPage(driver);
	}

}
