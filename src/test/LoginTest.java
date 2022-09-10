package MavenProject.Demoblaze2;

public class LoginTest extends BaseClass{
	@Test
	public void verifyLogInTab()
	{
		lp.logIn();
		lp.userName();
		lp.passWord();
		lp.logInButton();
		
	}
	

}
