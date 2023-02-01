package centralvista;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Forself {
	
	
	@Test(priority = 1)
	@Description("Verify Login (Valid Role, correct Username and Correct Password")
	@Epic("TG001")
	@Feature("Login")
	@Severity(SeverityLevel.NORMAL)
	public void validlogin() throws IOException, InterruptedException {
		Init.getDriver().navigate().refresh();
		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select"));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-login/section/div/div/div/div/div/form/div/div[1]/select")));
		se.selectByVisibleText("LS Operator"); 
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
	
	@Test(priority = 1)
	@Description("Test for verify min Length Validation is applied properly on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void addlsmemMinname() throws InterruptedException {
		Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]")).click();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //name
		Thread.sleep(1000);	
		JavascriptExecutor js = (JavascriptExecutor) Init.getDriver();
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Init.getDriver().findElement(ByAngular.buttonText("")).click();
		String exp = "ERROR!  Name too short! Minimum length required is 3!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To Verify the aadhar number field by entering the less than 12-digit aadhar number.")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addRsMemadharmin() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Aadhaar No. is too Short";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To Verify the aadhar number field by entering the greater than 12-digit aadhar number.")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addRsMemMaxAadhaar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("2431271111177");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Aadhaar No. is too Long Max digits 12 is Required";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To Verify aadhar number that when the user enters the aadher number which starts with o and 1")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addRsMemStartzeroAadhaar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("012078955700");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Aadhaar No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To Verify the aadhar number field by entering the alphabet")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addRsMemOnlyAlphaAadhar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("asasasasaszx");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Aadhaar No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To Verify the aadhar number field By entering the special char")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addRsMemSpclcharAadhar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&*()&*");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Aadhaar No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To Verify the aadhar number field by entering the space only.")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addRsMemOnlyspaceAadhar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("            ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Aadhaar No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To Verify the aadhar number field by entering all 12 numbers as zero.")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addRsMemAllZeroAadhar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("000000000000");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Aadhar No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To Verify the aadhar number field by entering the valid 12-digit number.")
	@Epic("TG003")
	@Feature("Rajya Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addRsMemValidAadhar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("816189759796");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	
	
	
	
	
}

