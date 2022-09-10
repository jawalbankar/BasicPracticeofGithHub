
public class LogInPage {
	private WebElement logIn;//declaration
	private WebElement userName;
	private WebElement passWord;
	private WebElement logInButton;
	//Initilization this private data members through constructor
	public LogInPage(WebDriver driver)
	{
		logIn=driver.findElement(By.id("login2"));
		userName=driver.findElement(By.id("loginusername"));
		passWord=driver.findElement(By.id("loginpassword"));
		logInButton=driver.findElement(By.xpath("//button[text()='Log in']"));
	}
	
	
	//Utilization
	public WebElement logIn()
	{
		logIn.click();
		return logIn;
	}
	public void userName()
	{
		userName.sendKeys("group4");
	}
	public void passWord()
	{
		passWord.sendKeys("123456789");
	}
	public void logInButton()
	{
		logInButton.click();
	}


}
