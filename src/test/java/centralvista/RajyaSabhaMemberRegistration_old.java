package centralvista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;




public class RajyaSabhaMemberRegistration_old {
	
	@Test(priority=33)
	@Description("Test for verify Title of Rajya Sabha Dashboard  Page")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.NORMAL)
	public void verifytitleRajyaSabhadashboard() throws InterruptedException {
		String exp = "Rajya Sabha Dashboard";		
		WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/div/app-ls-header/nav/span"));
		String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	    
	}
	
	@Test(priority=34)
	@Description("Test for verify label of Side menu option(First)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption1() throws InterruptedException {
		String exp = "Rajya Sabha Members";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority=35)
	@Description("Test for verify label of Side menu option(Second)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption2() throws InterruptedException {
		Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]")).click();
		String exp = "Add Member";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[1]/div/span[2]"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority=36)
	@Description("Test for verify label of Side menu option(Third)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption3() throws InterruptedException {
		String exp = "Rajya Sabha Members List";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[2]/div/span[2]"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority=37)
	@Description("Test for verify label of Side menu option(Forth)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption4() throws InterruptedException {
		String exp = "View Details";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[3]/div/span[2]"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	@Test(priority=38)
	@Description("Test for verify Header of Rajya Sabha Member list page")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyHeader() throws InterruptedException {
		String exp = "Rajya Sabha Members List";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/div/main/app-Rajyasabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/h3"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act, exp);
	     
	}
	
	@Test(priority=39)
	@Description("Test for Viewing Registerd Rajya Sabha Members List")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void viewRajyaSabhaMPlist() throws InterruptedException {
		Init.getDriver()
				.findElement(By.xpath(
						"/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[2]/div/span[2]"))
				.click();
		String exp = "http://localhost:8090/#/Rajyasabha/MP-list";
		String act = Init.getDriver().getCurrentUrl();
		Assert.assertEquals(act, exp);
		Thread.sleep(5000);

	}
	//TO be  Uncomment Later
//	@Test(priority=39)
//	@Description("Test for displaying 25 Rajya Sabha members List")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Dashboard")
//	@Severity(SeverityLevel.CRITICAL)
//	public void viewRajyaSabhaMP25() throws InterruptedException {
//		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/div/main/app-Rajyasabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/div/div/div[1]/label/select"));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-Rajyasabha/div/div/main/app-Rajyasabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/div/div/div[1]/label/select")));
//		se.selectByVisibleText("25"); 
//		String exp = "25";
//		String act = "25";
//		Assert.assertEquals(act, exp);
//		Thread.sleep(5000);
//
//	}
	
	
	@Test(priority=40)
	@Description("Test to check how many Rajya Sabha Members is Registered")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void viewNoofRegisteredMP() throws InterruptedException {
		List<WebElement> rowsNumber = Init.getDriver().findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]"));
				int rowCount = rowsNumber.size();
				System.out.println("No of rows in this table : " + rowCount);

	}
	@Test(priority=41)
	@Description("Test to check Rajya Sabha Member List is sort acc to Name(Ascending order)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	
	public void sortbyusername_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname= Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];
		
		for(int i=0;i<colname.size();i++)
		{
			beforesort[i]= colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");
		
		for(int i=0;i<colname.size();i++)
		{
			Arrays.sort(beforesort);
			String sort=beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname= Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for(int i=0;i<colname.size();i++)
		{
			aftersort[i]= colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}
	@Test(priority=41)
	@Description("Test to check Rajya Sabha Member List is sort acc to Name(Descending order)")
	@Epic("TG002")
	@Feature("Rajya Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	
	public void sortbyusername_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname= Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];
		
		for(int i=0;i<colname.size();i++)
		{
			beforesort[i]= colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");
		
		for(int i=0;i<colname.size();i++)
		{
			
			Arrays.sort(beforesort);
			String sort=beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		//Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname= Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for(int i=0;i<colname.size();i++)
		{
			aftersort[i]= colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}
	
	//test Case for Sorting shouldd written here.
	
	
	
	
	
//	@Test()
//	@Description("Test for verify label of Id card no. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_icardno() throws InterruptedException {
//		String exp = "ID Card No.";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Id card no. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_issuedate() throws InterruptedException {
//		String exp = "Issued Date";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_name() throws InterruptedException {
//		String exp = "Name";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Gender Dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_gender() throws InterruptedException {
//		String exp = "Gender";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of Date of birth")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_dob() throws InterruptedException {
//		String exp = "Date of Birth";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Blood Group Dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_bloodgroup() throws InterruptedException {
//		String exp = "Blood Group";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of Designation Dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_designation() throws InterruptedException {
//		String exp = "Designation";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of branch Dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_branch() throws InterruptedException {
//		String exp = "Branch";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Employee ID field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_empid() throws InterruptedException {
//		String exp = "Employee Id";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_identificationmark() throws InterruptedException {
//		String exp = "Identification Mark";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Residential Address field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_resAddress() throws InterruptedException {
//		String exp = "Residential Address";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of pincode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_pincode() throws InterruptedException {
//		String exp = "Pin Code";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of special Print Character field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_splprintcharacter() throws InterruptedException {
//		String exp = "Special Print Character";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Residential Contact Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_rescontact() throws InterruptedException {
//		String exp = "Residential Contact(Landline)";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of Official Contact Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_offcontact() throws InterruptedException {
//		String exp = "Official Contact(Landline)";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//
//	@Test()
//	@Description("Test for verify label of  Mobile Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_mobilenumber() throws InterruptedException {
//		String exp = "Mobile Number";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  Email Id field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_emailid() throws InterruptedException {
//		String exp = "Email";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  Fax field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_fax() throws InterruptedException {
//		String exp = "Fax";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  RFID field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_rfid() throws InterruptedException {
//		String exp = "RFID";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  Valid From date field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_validfrom() throws InterruptedException {
//		String exp = "Valid From";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of  Valid Till date field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_validtill() throws InterruptedException {
//		String exp = "Valid Till";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of  Signing Authority Code field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_signingauthority() throws InterruptedException {
//		String exp = "Signing Authority Code";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Upload Photo button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_uploadphoto() throws InterruptedException {
//		String exp = "Upload Photo";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of Capture Biometric button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_biometric() throws InterruptedException {
//		String exp = "Capture Biometric";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(exp, act);
//	     
//	}
//	
//	// Scripts for Checking presence of fields in Employee Registration Forms
//	
//	@Test()
//	@Description("Verify Id Card No. field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_idcardno() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Issued Date field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_issuedate() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Name field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_name() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	
//	@Test()
//	@Description("Verify Gender dropdown presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_gender() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Date of birth field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_dob() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Blood Group dropdown presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_bloodgroup() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Designation dropdown presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_designation() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//
//	@Test()
//	@Description("Verify Branch dropdown presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_branch() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Verify Employee Id Field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_empid() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	
//	@Test()
//	@Description("Verify Identification Mark Field presence in Employee Registration Page")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_idenmark() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Residential Address field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_resAddress() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of pincode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_pincode() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of special Print Character field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_splprintcharacter() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of Residential Contact Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_rescontact() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Official Contact Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_offcontact() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//
//	@Test()
//	@Description("Test for verify presence of  Mobile Number field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_mobilenumber() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Test for verify presence of  Email Id field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_emailid() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of  Fax field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_fax() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of  RFID field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_rfid() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}
//	@Test()
//	@Description("Test for verify presence of  Valid From date field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_validfrom() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of  Valid Till date field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_validtill() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of  Signing Authority Code field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_signingauthority() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of Upload Photo button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_uploadphoto() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Capture Biometric button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_biometric() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Validate button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_validateb() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of Cancel button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_Cancelb() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Save button field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_Saveb() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	// Functional Scripts for Employee name field
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_minname() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //name
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Name too short! Minimum length required is 3!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_maxname() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Name too long! Maximum length 100!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlynumber() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyspecialcharacters() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyaplusn() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyapluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlynpluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_spaceatstarts() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid name";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_spaceatend() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Sanjana    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid name";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlyspace() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid name";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_novlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Name is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid name in name field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validname() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Parul Pal");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether all values are added in Gender dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_gender() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualdropdownvalues= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualdropdownvalues.add(element.getText());
//	      }
//	      List<String> expdropdownvalues= new ArrayList<String>();
//	      expdropdownvalues.add("Male");
//	      expdropdownvalues.add("Female");
//	      expdropdownvalues.add("Transgender");	      
//	      for (int i = 0; i< actualdropdownvalues.size(); i++) {
//			Assert.assertTrue(actualdropdownvalues.get(i).equals(expdropdownvalues.get(i)));
//	}
//	      
//	}
//	@Test()
//	@Description("To check Gender dropdown without choosing the Gender")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptygender() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! Gender is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check Gender dropdown by choosing the Gender")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validgender() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "Male";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "Male";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	  
//	
//	@Test()
//	@Description("To check whether dob field is taken valid date or not")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_dob() throws InterruptedException {
//		//Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
//		// Dob Test Script here
//	}
//	
//	@Test()
//	@Description("To check whether all values are added in Blood Group dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_bloodgroup() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualbloodgroups= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualbloodgroups.add(element.getText());
//	      }
//	      List<String> expbloodgroups= new ArrayList<String>();
//	      expbloodgroups.add("A+");
//	      expbloodgroups.add("A-");
//	      expbloodgroups.add("B+");	
//	      expbloodgroups.add("B-");
//	      expbloodgroups.add("O+");
//	      expbloodgroups.add("O-");
//	      expbloodgroups.add("AB+");	
//	      expbloodgroups.add("AB-");
//	      for (int i = 0; i< actualbloodgroups.size(); i++) {
//			Assert.assertTrue(actualbloodgroups.get(i).equals(expbloodgroups.get(i)));
//	}
//	      
//	}
//	
//	@Test()
//	@Description("To check Blood Group dropdown without choosing the Blood Group")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptybg() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! Blood Group is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check Blood Group dropdown by choosing the Blood Group")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validbg() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText("A+"); 
//		String exp = "A+";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "A+";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether all values are added in Designation dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_designation() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualdesignations= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualdesignations.add(element.getText());
//	      }
//	      List<String> expdesignations= new ArrayList<String>();
//	      expdesignations.add("Joint Director");
//	      expdesignations.add("Joint Director");
//	      expdesignations.add("Joint Director");	
//	      expdesignations.add("Joint Director");
//	      expdesignations.add("Joint Director");
//	      expdesignations.add("Joint Director");
//	      expdesignations.add("Joint Director");	
//	      expdesignations.add("Joint Director");
//	      for (int i = 0; i< actualdesignations.size(); i++) {
//			Assert.assertTrue(actualdesignations.get(i).equals(expdesignations.get(i)));
//	}
//	      
//	}
//	
//	@Test()
//	@Description("To check Designation dropdown without choosing the Designation")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptydesg() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! Designation is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check Designation dropdown by choosing the Designation")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validdesg() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText("Joint Director"); 
//		String exp = "Joint Director";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "A+";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether all values are added in Branch dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_branch() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualbranch= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualbranch.add(element.getText());
//	      }
//	      List<String> expbranch= new ArrayList<String>();
//	      expbranch.add("Securities");
//	      expbranch.add("Securities");
//	      expbranch.add("Securities");	
//	      expbranch.add("Securities");
//	      expbranch.add("Securities");
//	      expbranch.add("Securities");
//	      expbranch.add("Securities");	
//	      expbranch.add("Securities");
//	      for (int i = 0; i< actualbranch.size(); i++) {
//			Assert.assertTrue(actualbranch.get(i).equals(expbranch.get(i)));
//	}
//	      
//	}
//	
//	@Test()
//	@Description("To check Designation dropdown without choosing the Designation")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptybranch() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! Branch is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check Securities dropdown by choosing the Security")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validbranch() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText("Securities"); 
//		String exp = "Securities";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "Securities";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_minIdentificationMark() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Identification Mark
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Identification Mark too short! Minimum length required is 10!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_maxIdentificationMark() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Identification Mark too long! Maximum length 100!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlynumbers() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyspecialcharacter() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyaplusnu() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_onlyaplusspecial() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlynplusspecial() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_spaceatstart() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Identification Mark";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_spaceatlast() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Sanjana    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Identification Mark";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlyspaces() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Identification Mark";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptyvlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Identification Mark is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid Identification Mark in Identification Mark field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validIdentificationMark() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Mole on right hand");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Residential Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_Raddrflatnomin() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrflatnomax() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Flat No. too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrflatnoonlynumbers() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrflatnoonlyspclchar() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrflatnoonlyaplusnu() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrflatnoonlyaplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnoonlynplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnospaceatstart() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnospaceatlast() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnoonlyspaces() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnoemptyvlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Flat No. is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid Flat No. in Flat No. field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrflatnovalid() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	
//	// Test Scripts for locality 
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Residential Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_Raddrlocalitymin() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Locality too short! Minimum length required is 4!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrlocalitymax() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Locality too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrlocalityonlynumbers() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrlocalityonlyspclchar() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrlocalityonlyaplusnu() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Raddrlocalityonlyaplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityonlynplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityspaceatstart() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityspaceatlast() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityonlyspaces() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityemptyvlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Locality is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid Locality in Locality field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Raddrlocalityvalid() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	// Scripts for State dropdown
//	
//	@Test()
//	@Description("To check whether all values are added in State dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_state() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualstates= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualstates.add(element.getText());
//	      }
//	      List<String> expstates= new ArrayList<String>();
//	      expstates.add("Andhra Pradesh");
//	      expstates.add("Arunachal Pradesh");
//	      expstates.add("Assam");
//	      expstates.add("Bihar");
//	      expstates.add("Chhattisgarh");
//	      expstates.add("Goa");
//	      expstates.add("Gujarat");
//	      expstates.add("Haryana");
//	      expstates.add("Jharkhand");
//	      expstates.add("Karnataka");
//	      expstates.add("Kerala");
//	      expstates.add("Madhya Pradesh");
//	      expstates.add("Maharashtra");
//	      expstates.add("Manipur");
//	      expstates.add("Meghalaya");
//	      expstates.add("Mizoram");
//	      expstates.add("Nagaland");
//	      expstates.add("Odisha");
//	      expstates.add("Punjab");
//	      expstates.add("Rajasthan");
//	      expstates.add("Sikkim");
//	      expstates.add("Tamil Nadu");
//	      expstates.add("Telangana");
//	      expstates.add("Tripura");
//	      expstates.add("Uttar Pradesh");
//	      expstates.add("Uttarakhand");
//	      expstates.add("West Bengal");
//	      expstates.add("Andaman and Nicobar Islands");
//	      expstates.add("Chandigarh");
//	      expstates.add("Dadra & Nagar Haveli and Daman & Diu");
//	      expstates.add("Delhi");
//	      expstates.add("Jammu and Kashmir");
//	      expstates.add("Lakshadweep");
//	      expstates.add("Puducherry");
//	      expstates.add("Ladakh");
//	      for (int i = 0; i< actualstates.size(); i++) {
//			Assert.assertTrue(actualstates.get(i).equals(expstates.get(i)));
//	}
//	      
//	}
//	@Test()
//	@Description("To check State dropdown without choosing the State")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_emptystate() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! State is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check State dropdown by choosing the State")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validstate() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "Uttar Pradesh";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "Uttar Pradesh";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	 
//	
//	// Script for City Field
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_minCity() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  City too short! Minimum length required is 3!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_maxCity() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  City too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_cityonlynumber() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_cityonlyspclchars() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_cityonlyaplusn() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_cityonlyapluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_cityonlynpluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_cityspaceatstarts() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_cityspaceatend() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_cityonlyspace() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_citynovlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  City is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid City in City field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validCity() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	
//	// Scripts for pincode
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_minPinCode() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_maxPinCode() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("2013079");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  PinCode too long! Maximum length 6!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pincodeonlynumber() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pincodeonlyspclchars() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pincodeonlyaplusn() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pincodeonlyapluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pincodeonlynpluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pincodespaceatstarts() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pincodespaceatend() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pincodeonlyspace() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pincodenovlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  PinCode is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid PinCode in PinCode field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_validPinCode() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	 
//	// Scripts for Permanent Address
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_Paddrflatnomin() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrflatnomax() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Flat No. too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrflatnoonlynumbers() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on   Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrflatnoonlyspclchar() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrflatnoonlyaplusnu() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrflatnoonlyaplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnoonlynplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnospaceatstart() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnospaceatlast() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnoonlyspaces() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Flat No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnoemptyvlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Flat No. is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid Flat No. in Permanent Address(Flat No.) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrflatnovalid() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	
//	// Test Scripts for locality 
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_Paddrlocalitymin() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  Locality too short! Minimum length required is 4!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrlocalitymax() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Locality too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrlocalityonlynumbers() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrlocalityonlyspclchar() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrlocalityonlyaplusnu() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_Paddrlocalityonlyaplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityonlynplusspcl() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityspaceatstart() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityspaceatlast() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityonlyspaces() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Locality";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityemptyvlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  Locality is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid Locality in Permanent Address(Locality) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_Paddrlocalityvalid() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	// Scripts for State dropdown
//	
//	@Test()
//	@Description("To check whether all values are added in Permanent Address(State) dropdown")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pstate() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//	     List<String> actualstates= new ArrayList<String>();
//	      for(WebElement element: s.getOptions())
//	      {
//	    	  actualstates.add(element.getText());
//	      }
//	      List<String> expstates= new ArrayList<String>();
//	      expstates.add("Andhra Pradesh");
//	      expstates.add("Arunachal Pradesh");
//	      expstates.add("Assam");
//	      expstates.add("Bihar");
//	      expstates.add("Chhattisgarh");
//	      expstates.add("Goa");
//	      expstates.add("Gujarat");
//	      expstates.add("Haryana");
//	      expstates.add("Jharkhand");
//	      expstates.add("Karnataka");
//	      expstates.add("Kerala");
//	      expstates.add("Madhya Pradesh");
//	      expstates.add("Maharashtra");
//	      expstates.add("Manipur");
//	      expstates.add("Meghalaya");
//	      expstates.add("Mizoram");
//	      expstates.add("Nagaland");
//	      expstates.add("Odisha");
//	      expstates.add("Punjab");
//	      expstates.add("Rajasthan");
//	      expstates.add("Sikkim");
//	      expstates.add("Tamil Nadu");
//	      expstates.add("Telangana");
//	      expstates.add("Tripura");
//	      expstates.add("Uttar Pradesh");
//	      expstates.add("Uttarakhand");
//	      expstates.add("West Bengal");
//	      expstates.add("Andaman and Nicobar Islands");
//	      expstates.add("Chandigarh");
//	      expstates.add("Dadra & Nagar Haveli and Daman & Diu");
//	      expstates.add("Delhi");
//	      expstates.add("Jammu and Kashmir");
//	      expstates.add("Lakshadweep");
//	      expstates.add("Puducherry");
//	      expstates.add("Ladakh");
//	      for (int i = 0; i< actualstates.size(); i++) {
//			Assert.assertTrue(actualstates.get(i).equals(expstates.get(i)));
//	}
//	      
//	}
//	@Test()
//	@Description("To check Permanent Address(State) dropdown without choosing the State")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pemptystate() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "ERROR! State is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check Permanent Address(State) dropdown by choosing the State")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pvalidstate() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		WebElement t=Init.getDriver().findElement(By.xpath(""));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//		se.selectByVisibleText(""); 
//		String exp = "Uttar Pradesh";
////		WebElement m = Init.getDriver().findElement(
////				By.xpath(""));
//		String act = "Uttar Pradesh";
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	 
//	
//	// Script for City Field
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_pminCity() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  City too short! Minimum length required is 3!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pmaxCity() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  City too long! Maximum length 50!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pcityonlynumber() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pcityonlyspclchars() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pcityonlyaplusn() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pcityonlyapluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pcityonlynpluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only alphabets are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pcityspaceatstarts() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pcityspaceatend() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pcityonlyspace() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid City";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pcitynovlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  City is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid City in Permanent Address(City) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pvalidCity() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	
//	// Scripts for pincode
//	
//	@Test()
//	@Description("Test for verify min Length Validation is applied properly on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//	public void addlsrsemp_pminPinCode() throws InterruptedException {
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
//		Thread.sleep(1000);			
//		Init.getDriver().findElement(ByAngular.buttonText("")).click();
//		String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify max Length Validation is applied properly on  Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_pmaxPinCode() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("2013079");
//		Thread.sleep(1000);
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  PinCode too long! Maximum length 6!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify number Validation is applied properly on  Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_ppincodeonlynumber() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify special Characters Validation is applied properly on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_ppincodeonlyspclchars() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//		
//	@Test()
//	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_ppincodeonlyaplusn() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_ppincodeonlyapluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_ppincodeonlynpluss() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Only Numbers are allowed!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing spaces in staring on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_ppincodespaceatstarts() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("Test for verify space validation by passing spaces at end on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_ppincodespaceatend() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("Test for verify space validation by passing only spaces on Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_ppincodeonlyspace() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid PinCode";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by without passing value in the  Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_ppincodenovlaue() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR!  PinCode is required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether by passing valid PinCode in Permanent Address(PinCode) field")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_pvalidPinCode() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	// Scripts for Residential landline number
//	@Test()
//	@Description("To check whether the  min length validation on Residential Contact(Landline) field is applied or not")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void addlsrsemp_minreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Landline No. is too Short";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check whether the max length validation on Residential Contact(Landline) field is applied properly or not")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void addlsrsemp_maxreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check whether the Residential Contact(Landline)  validation is applied properly on field or not by passing blank space between the no.")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_spacebwreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Landline No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether the Residential Contact(Landline)  validation is applied properly on field or not by passing 10 zeros")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//	public void addlsrsemp_tenzeroreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Landline No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether the Residential Contact(Landline)  validation is applied properly on field or not by passing 10 spaces")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_tenspacereslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Landline No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether the Residential Contact(Landline) validation is applied properly on Residential Contact(Landline) field or not without passingany value.")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_novaluereslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Landline No. is Required!";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	@Test()
//	@Description("To check whether the Residential Contact(Landline) validation is applied properly on Residential Contact(Landline) field or not by passing alphabets")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlyalphabetsreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Landline No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether the Residential Contact(Landline) validation is applied properly on Residential Contact(Landline) field or not by passing special characters")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlyspclcharreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "ERROR! Invalid Landline No.";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	@Test()
//	@Description("To check whether the Residential Contact(Landline) validation is applied properly on Residential Contact(Landline) field or not by passing numbers")
//	@Epic("TG002")
//	@Feature("Rajya Sabha Member Registration")
//	@Severity(SeverityLevel.NORMAL)
//
//	public void addlsrsemp_onlynoreslandline() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(1000);
//		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//		String exp = "";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
//		String act = m.getText();
//		System.out.println("Error message is: " + act);
//		Assert.assertEquals(exp, act);
//	}
//	
//	// Scripts for Permanent landline number
//		@Test()
//		@Description("To check whether the  min length validation on Permanent Contact(Landline) field is applied or not")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.CRITICAL)
//
//		public void addlsrsemp_minperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Landline No. is too Short";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the max length validation on Permanent Contact(Landline) field is applied properly or not")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.CRITICAL)
//
//		public void addlsrsemp_maxperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline)  validation is applied properly on field or not by passing blank space between the no.")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_spacebwperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Landline No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline)  validation is applied properly on field or not by passing 10 zeros")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_tenzeroperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Landline No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline)  validation is applied properly on field or not by passing 10 spaces")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_tenspaceperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Landline No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline) validation is applied properly on Permanent Contact(Landline) field or not without passingany value.")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_novalueperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Landline No. is Required!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline) validation is applied properly on Permanent Contact(Landline) field or not by passing alphabets")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlyalphabetsperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Landline No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline) validation is applied properly on Permanent Contact(Landline) field or not by passing special characters")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlyspclcharperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Landline No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Permanent Contact(Landline) validation is applied properly on Permanent Contact(Landline) field or not by passing numbers")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlynoperlandline() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//	// Scripts for Mobile Number
//		
//		@Test()
//		@Description("To check whether the  min length validation on Mobile Number field is applied or not")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.CRITICAL)
//
//		public void addlsrsemp_minmob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Mobile No. is too Short";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the max length validation on Mobile Number field is applied properly or not")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.CRITICAL)
//
//		public void addlsrsemp_maxmob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing blank space between the no.")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_spacebwmob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Mobile No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 zeros")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_tenzeromob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Mobile No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 spaces")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_tenspacemob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Mobile No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not without passingany value.")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_novaluemob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Mobile No. is Required!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing alphabets")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlyalphabetsmob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Mobile No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing special characters")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlyspclcharmob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR! Invalid Mobile No.";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing numbers")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_onlynomob() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		// Scripts for Fax Number will write later
//		
//		// Scripts for email address
//		@Test()
//		@Description("Test for verify min Length Validation is applied properly on email  field")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.CRITICAL)
//		public void addlsrsemp_prefixmin() throws InterruptedException {
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("")).sendKeys(""); //Locality
//			Thread.sleep(1000);			
//			Init.getDriver().findElement(ByAngular.buttonText("")).click();
//			String exp = "ERROR!  Email too short! Minimum length required is 10!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("Test for verify max Length Validation is applied properly on email field")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_prefixmax() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaasaaaaaaaaaaaaaaaaaaa@gmail.com");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Email too long! Maximum length 50!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("Test for verify email Address without @ symbol")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_withoutattherate() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("testgmail.com");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("Test for verify email Address by passing @ symbol at end")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_attherateatend() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com@");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("Test for verify email Address by passing @ symbol at start")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_attherateatstart() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("@test@gmail.com");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		@Test()
//		@Description("Test for verify email Address by passing . symbol at end")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_dotatend() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com.");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("Test for verify email Address by passing . symbol at start")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_dotatstart() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("@test@gmail.com");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//
//		@Test()
//		@Description("Test for verify email Address without . symbol")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_withoutdot() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmailcom");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "ERROR!  Invalid email!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("Test for verify email Address by passing valid email address")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_validemail() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com");
//			Thread.sleep(1000);
//			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
//			String exp = "";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		
//		
//		@Test()
//		@Description("To check whether valid from date field is taken valid date or not by passing valid date")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_validfrom() throws InterruptedException {
//			//Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.xpath("")).sendKeys("05/01/2023");
//			// Dob Test Script here
//		}
//		
//		@Test()
//		@Description("To check whether valid to date field is taken valid date or not by passing valid date")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_validto() throws InterruptedException {
//			//Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Init.getDriver().findElement(By.xpath("")).sendKeys("05/01/2027");
//			// Dob Test Script here
//		}
//		
//		@Test()
//		@Description("To check whether all values are added in Signing Authority code dropdown")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//		public void addlsrsemp_signauthcode() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			Select s = new Select(Init.getDriver().findElement(By.xpath("")));
//		     List<String> actualsignauthcode= new ArrayList<String>();
//		      for(WebElement element: s.getOptions())
//		      {
//		    	  actualsignauthcode.add(element.getText());
//		      }
//		      List<String> expsignauthcode= new ArrayList<String>();
//		      expsignauthcode.add("Joint Director");
//		      expsignauthcode.add("Director");
//		      expsignauthcode.add("CEOSE");	
//		      expsignauthcode.add("Dummy");
//		      expsignauthcode.add("Dummy");
//		      expsignauthcode.add("Dummy");
//		      expsignauthcode.add("Dummy");	
//		      expsignauthcode.add("Dummy");
//		      for (int i = 0; i< actualsignauthcode.size(); i++) {
//				Assert.assertTrue(actualsignauthcode.get(i).equals(expsignauthcode.get(i)));
//		}
//		      
//		}
//		
//		@Test()
//		@Description("To check Signing Authority code dropdown without choosing the Signing Authority code")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_emptysignauthcode() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			WebElement t=Init.getDriver().findElement(By.xpath(""));
//			t.click();
//			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//			se.selectByVisibleText(""); 
//			String exp = "ERROR! Designation is required!";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
//			String act = m.getText();
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
//		@Test()
//		@Description("To check Signing Authority code dropdown by choosing the Signing Authority code")
//		@Epic("TG002")
//		@Feature("Rajya Sabha Member Registration")
//		@Severity(SeverityLevel.NORMAL)
//
//		public void addlsrsemp_validsignauthcode() throws InterruptedException {
//			Init.getDriver().navigate().refresh();
//			Thread.sleep(1000);
//			WebElement t=Init.getDriver().findElement(By.xpath(""));
//			t.click();
//			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
//			se.selectByVisibleText("Joint Director"); 
//			String exp = "Joint Director";
////			WebElement m = Init.getDriver().findElement(
////					By.xpath(""));
//			String act = "A+";
//			System.out.println("Error message is: " + act);
//			Assert.assertEquals(exp, act);
//		}
		
		// Scripts for Submit button
		
}


