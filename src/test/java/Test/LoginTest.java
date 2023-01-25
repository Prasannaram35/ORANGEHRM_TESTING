package Test;import org.testng.annotations.Test;import GenericUtils.DriverUtils;
import Pages.LoginPage;public class LoginTest {
	@Test
	public void Login()
	{
		DriverUtils.getDriver().get("http://opensource-demo.orangehrmllive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
	}
}




















