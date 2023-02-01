package centralvista;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.paulhammant.ngwebdriver.ByAngular;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class Login {
	
	
	
	@Test(priority = 1)
	@Description("Test for verify Title of Login page")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void CheckTitle()
	{ 		
		String exp = "LOGIN";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/h2"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	      //Thread.sleep(5000);

	}
	
	
	@Test(priority = 2)
	@Description("Test for verify label of Role Dropdown")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelRole() throws InterruptedException {
		String exp = "Role";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/label"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	
	@Test(priority = 3)
	@Description("Test for verify label of Username field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelUsername() throws InterruptedException {
		String exp = "Username";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/label"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority = 4)
	@Description("Test for verify label of Password field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPassword() throws InterruptedException {
		String exp = "Password";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/label"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority = 5)
	@Description("Test for verify label of Login Button field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSubmit() throws InterruptedException {
		String exp = "Login";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/button"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	
	@Test(priority = 6)
	@Description("Test to verify presence of Role dropdown in Login Page")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void verifypresenceRole() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test(priority = 7)
	@Description("Test to verify presence of Username field in Login Page")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void verifypresenceUsername() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/input")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test(priority = 8)
	@Description("Test to verify presence of Password field in Login Page")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void verifypresencePassword() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/input")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test(priority = 9)
	@Description("To check whether all values are added in Role dropdown")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)

	public void verifyRolevalue() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Select s = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
	     List<String> actualrolevalues= new ArrayList<String>();
	      for(WebElement element: s.getOptions())
	      {
	    	  actualrolevalues.add(element.getText());
	      }
	      List<String> exprolevalues= new ArrayList<String>();
	      exprolevalues.add("Select Role");
	      exprolevalues.add("LS Operator");
	      exprolevalues.add("RS Operator");
	      //expdropdownvalues.add("Employee");	      
	      for (int i = 0; i< actualrolevalues.size(); i++) {
			Assert.assertTrue(actualrolevalues.get(i).equals(exprolevalues.get(i)));
	}
	      
	}
	@Test(priority = 10)
	@Description("Test for verify min Length Validation is applied properly on username field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void login_minname() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=username]")).sendKeys("as"); //name
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		String exp = "ERROR!  Username too short! Minimum length required is 4!";
		String act = "";
		//To be Uncomment when implemented
//		WebElement m = Init.getDriver().findElement(
//				By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
//		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 11)
	@Description("Test for verify max Length Validation is applied properly on  Username field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void login_maxname() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=username]")).sendKeys("aaaaaaaaaaaaaaaaaaaaa");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		String exp = "ERROR!  Username too long! Maximum length 20!";
		String act = "";
		//To be Uncomment when implemented
//		WebElement m = Init.getDriver().findElement(
//				By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
//		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test(priority = 12)
	@Description("Test for verify min Length Validation is applied properly on Password field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.CRITICAL)
	public void loginMinpass() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=password]")).sendKeys("as"); //name
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		String exp = "ERROR!  Password too short! Minimum length required is 8!";
		String act = "";
		//To be Uncomment when implemented
//		WebElement m = Init.getDriver().findElement(
//				By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
//		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test(priority = 13)
	@Description("Test for verify max Length Validation is applied properly on  Password field")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void loginMaxpass() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=username]")).sendKeys("Test@111111111111");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		String exp = "ERROR!  Password too long! Maximum length Allowed is 16!";
		String act = "";
		//To be Uncomment when implemented
//		WebElement m = Init.getDriver().findElement(
//				By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
//		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test(priority = 14)
	@Description("Verify Login by without passing Role, Username and Passsword")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		WebElement Password = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		softAssert.assertEquals(Username.getText(), "Username is required !");
		softAssert.assertEquals(Password.getText(), "Password is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 15)
	@Description("Verify Login (Empty Role, Correct Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin1() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);	
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=username]")).sendKeys("LsOperator");
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formControlName=password]")).sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 16)
	@Description("Verify Login (Empty Role, Empty Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin2() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		
		WebElement Password=Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));		
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));	
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Username is required !");
		softAssert.assertEquals(Role.getText(), "Role is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 17)
	@Description("Verify Login (Empty Role, incorrect Username and incorrect Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin3() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
				
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("sdjfsdkjhfgk");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Thread.sleep(1000);
		Password.sendKeys("Test@123");
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		//softAssert.assertEquals(Username.getText(), "Invalid Username !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 18)
	@Description("Verify Login (Empty Role, incorrect Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin4() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("sdjfsdkjhfgk");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		//softAssert.assertEquals(Username.getText(), "Invalid Username !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
//	
	@Test(priority = 19)
	@Description("Verify Login (Empty Role, incorrect Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin5() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
				
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("Ls Operator");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@1234");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		//softAssert.assertEquals(Password.getText(), "Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 20)
	@Description("Verify Login (Empty Role, correct Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin6() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
			
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("Ls Operator");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));	
		WebElement Password =Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div/div"));
		//Password.sendKeys("");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		softAssert.assertEquals(Password.getText(), "Password is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 21)
	@Description("Verify Login (Empty Role, empty Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin7() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));		
		WebElement Username= Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		//Username.sendKeys("");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		softAssert.assertEquals(Username.getText(), "Username is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 22)
	@Description("Verify Login (Empty Role, incorrect Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin8() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);	
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperatr");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/div/div"));
		WebElement Password =Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div/div"));
		//Password.sendKeys("");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Role.getText(), "Role is required !");
		//softAssert.assertEquals(Username.getText(), "Invalid Username !");
		softAssert.assertEquals(Password.getText(), "Password is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 23)
	@Description("Verify Login (Valid Role, incorrect Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin9() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement Role = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		Role.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperatr");
		Thread.sleep(1000);
		WebElement Password1 =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password1.sendKeys("");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		WebElement Password =Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(Role.getText(), "Role is required !");
		//softAssert.assertEquals(Username.getText(), "Invalid Username !");
		softAssert.assertEquals(Password.getText(), "Password is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 24)
	@Description("Verify Login (Valid Role, Empty Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin10() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username1= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username1.sendKeys("");
		Thread.sleep(1000);
		WebElement Password1 =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password1.sendKeys("");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		WebElement Password = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Username is required !");
		softAssert.assertEquals(Password.getText(), "Password is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 25)
	@Description("Verify Login (Valid Role, Empty Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin11() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username1= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username1.sendKeys("");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Username is required !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	@Test(priority = 26)
	@Description("Verify Login (Valid Role, incorrect Username and inCorrect Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin12() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username1= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username1.sendKeys("fgeger");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123re");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Invalid Username !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 27)
	@Description("Verify Login (Valid Role, incorrect Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin13() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username1= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username1.sendKeys("fgeger");
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Invalid Username !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 28)
	@Description("Verify Login (Valid Role, correct Username and inCorrect Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin14() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperator");
		Thread.sleep(1000);
		WebElement Password1 =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password1.sendKeys("ls@1234");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Password = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Password.getText(), "Invalid Password !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 29)
	@Description("Verify Login (Valid Role, correct Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin15() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator");
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperator");
		Thread.sleep(1000);
		WebElement Password1 =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password1.sendKeys("");
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Password = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Password.getText(), "Password is Required !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	@Test(priority = 30)
	@Description("Verify Login (Valid Role, Empty Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin16() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username1= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username1.sendKeys("");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Username = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[2]/div/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Username is Required !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
	}
	@Test(priority = 31)
	@Description("Verify Login (Valid Role, incorrect Username and Empty Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void invalidlogin17() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperator1");
		Thread.sleep(1000);
		WebElement Password1 =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password1.sendKeys("");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		WebElement Password = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[3]/div[1]/div"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(Username.getText(), "Password is Required !");
		//softAssert.assertEquals(Password.getText(), " Invalid Password !");
		softAssert.assertAll();
		Thread.sleep(1000);
	}
	
	// Login for Lok Sabha Operator
		@Test(priority = 32)
		@Description("Verify Login (Diffrent Role, correct Username and Correct Password")
		@Epic("TG001")
		@Feature("Login")
		@Severity(SeverityLevel.NORMAL)
		public void invalidlogin19() throws IOException, InterruptedException {
			Init.getDriver().navigate().refresh();
			WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
			se.selectByVisibleText("RS Operator"); 
			Thread.sleep(1000);
			WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
			Username.sendKeys("LsOperator");
			Thread.sleep(1000);
			WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
			Password.sendKeys("ls@123");
			Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
			Thread.sleep(1000);		
			Assert.assertEquals(Username.getText(), "Username not Registered with Selected Role");
			Thread.sleep(1000);
		}
	
	// Login for Lok Sabha Member Operator
	@Test(priority = 33)
	@Description("Verify Login (Valid Role, correct Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void validloginlsmemop() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Member Operator"); 
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("LsOperator");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("ls@123");
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		String curr = Init.getDriver().getCurrentUrl();
		System.out.println("message is: " + curr);	
		String exp = "http://localhost:8090/#/loksabha/home";
		Assert.assertEquals(curr, exp);
		Thread.sleep(1000);
	}
	
	/*
	//Valid Login Rajya Sabha Member Operator
	@Test(priority = 34)
	@Description("Verify Login (Valid Role, correct Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void validloginRsmemop() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("RS Member Operator"); 
		Thread.sleep(1000);
		WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
		Username.sendKeys("RsOperator");
		Thread.sleep(1000);
		WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
		Password.sendKeys("rs@123");
		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
		Thread.sleep(1000);
		String curr = Init.getDriver().getCurrentUrl();
		System.out.println("message is: " + curr);	
		String exp = "http://localhost:8090/#/rajyasabha/home";
		Assert.assertEquals(curr, exp);
		Thread.sleep(1000);
	}
	
	// Login for Lok Sabha Employee Operator
		@Test(priority = 35)
		@Description("Verify Login (Valid Role, correct Username and Correct Password")
		@Epic("TG001")
		@Feature("Login")
		@Severity(SeverityLevel.NORMAL)
		public void validloginlsempop() throws IOException, InterruptedException {
			Init.getDriver().navigate().refresh();
			WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
			se.selectByVisibleText("LS Employee Operator"); 
			Thread.sleep(1000);
			WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
			Username.sendKeys("LsOperator");
			Thread.sleep(1000);
			WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
			Password.sendKeys("ls@123");
			Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
			Thread.sleep(1000);
			String curr = Init.getDriver().getCurrentUrl();
			System.out.println("message is: " + curr);	
			String exp = "http://localhost:8090/#/loksabha/home";
			Assert.assertEquals(curr, exp);
			Thread.sleep(1000);
		}
		
		// Login for Rajya Sabha Employee Operator
				@Test(priority = 35)
				@Description("Verify Login (Valid Role, correct Username and Correct Password")
				@Epic("TG001")
				@Feature("Login")
				@Severity(SeverityLevel.NORMAL)
				public void validloginRsempop() throws IOException, InterruptedException {
					Init.getDriver().navigate().refresh();
					WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
					se.selectByVisibleText("RS Employee Operator"); 
					Thread.sleep(1000);
					WebElement Username= Init.getDriver().findElement(By.cssSelector("input[formControlName=username]"));
					Username.sendKeys("RsOperator");
					Thread.sleep(1000);
					WebElement Password =Init.getDriver().findElement(By.cssSelector("input[formControlName=password]"));
					Password.sendKeys("Rs@123");
					Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
					Thread.sleep(1000);
					String curr = Init.getDriver().getCurrentUrl();
					System.out.println("message is: " + curr);	
					String exp = "http://localhost:8090/#/loksabha/home";
					Assert.assertEquals(curr, exp);
					Thread.sleep(1000);
				}
				*/
	

   
//	@DataProvider(name = "test-data")
//	public Object[][] dataProvFunc(){
//    	return new Object[][]{
//    		{"rohil1","Rohil@123"},
//    		{"",""},
//    		{"rohil1","Rohil@1234"},
//    		{"@#!#@","Rohil@123"},
//    		{"1111111","Rohil@1234"},
//    		{"1asderf","Rohil@1234"},
//    		{"     f     ","Rohil@123"},
//    		{"2345@#!$","Rohil@1234"},
//    		{"rohil","Rohil@1234"}
//    	};
//	}
//
//	@Test(description="This method validates the login functionality", priority=1,dataProvider ="test-data")
//	public void Login1( String keyword1, String Keyword2) throws InterruptedException
//	{ 
//		Init.getDriver().findElement(By.cssSelector("input[formControlName=username]")).sendKeys(keyword1);
//		Thread.sleep(2000);
//		Init.getDriver().findElement(By.cssSelector("input[formControlName=password]")).sendKeys(Keyword2);
//		Init.getDriver().findElement(ByAngular.buttonText("Login")).click();
//		Thread.sleep(5000);
//		Init.getDriver().navigate().refresh();
//		String exp = "http://10.10.10.154:8085/#/admin/dashboard";
//		String act = "http://10.10.10.154:8085/#/admin/dashboar";
//	      Assert.assertEquals(act, exp);
//	      
//	
//	}
//	
	
}
