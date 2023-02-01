package centralvista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


public class LokSabhalEmployeeRegistration {
	
	@Test()
	@Description("Test for verify Title of Lok Sabha Employee Dashboard  Page")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard")
	@Severity(SeverityLevel.NORMAL)
	public void verifytitleLokSabhEmployeDashboard() throws InterruptedException {
		String exp = "Lok Sabha Employee Dashboard";
		WebElement m = Init.getDriver()
				.findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test( )
	@Description("Test for verify label of Side menu option(First)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabeLSempidemenuoption1() throws InterruptedException {
		String exp = "Lok Sabha Employees";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Side menu option(Second)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabeLSempidemenuoption2() throws InterruptedException {
		Init.getDriver().findElement(By.xpath("")).click();
		String exp = "Add Employee";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Side menu option(Third)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabeLSempidemenuoption3() throws InterruptedException {
		String exp = "Lok Sabha Employees List";
		WebElement m = Init.getDriver().findElement(By.xpath(
				""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}
	
	// Scripts for Loksabha Employees List
	
	@Test()
	@Description("Test for verify Header of Lok Sabha Employee list page")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyHeader() throws InterruptedException {
		String exp = "Lok Sabha Employees List";
		WebElement m = Init.getDriver().findElement(By.xpath(
				"/html/body/app-root/app-loksabha/div/div/main/app-loksabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/h3"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for Viewing Registerd Lok Sabha Employees List")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)
	public void viewLokSabhaemplist() throws InterruptedException {
		Init.getDriver().findElement(By
				.xpath("/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[2]/div/span[2]"))
				.click();
		String exp = "http://localhost:8090/#/loksabha/MP-list";
		String act = Init.getDriver().getCurrentUrl();
		Assert.assertEquals(act, exp);
		Thread.sleep(5000);

	}
	// TO be Uncomment Later
//	@Test(=39)
//	@Description("Test for displaying 25 Lok Sabha Employees List")
//	@Epic("TG002")
//	@Feature("Lok Sabha Employee Dashboard")
//	@Severity(SeverityLevel.CRITICAL)
//	public void viewLokSabhaemp25() throws InterruptedException {
//		WebElement t=Init.getDriver().findElement(By.xpath("/html/body/app-root/app-loksabha/div/div/main/app-loksabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/div/div/div[1]/label/select"));
//		t.click();
//		Select se = new Select(Init.getDriver().findElement(By.xpath("/html/body/app-root/app-loksabha/div/div/main/app-loksabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/div/div/div[1]/label/select")));
//		se.selectByVisibleText("25"); 
//		String exp = "25";
//		String act = "25";
//		Assert.assertEquals(act, exp);
//		Thread.sleep(5000);
//
//	}

	@Test()
	@Description("Test to check how many Lok Sabha Employees is Registered")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)
	public void viewNoofRegisteredemp() throws InterruptedException {
		List<WebElement> rowsNumber = Init.getDriver()
				.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Name(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyname_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Name(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyname_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	// test Case for Sorting shouldd written here.
	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Emp id(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyempid_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Emp Id(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbbempid_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Email(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyemail_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Email(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyemail_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Gender(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbygender_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Gender(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbygender_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Contact No.(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbycontact_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Contact No.(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbycontact_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

//	@Test( = 50)
//	@Description("Test to check Lok Sabha Employee List is sort acc to Constituency(Ascending order)")
//	@Epic("TG002")
//	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void sortbyconst_asc() throws InterruptedException {
////		Init.getDriver().navigate().refresh();
//		Thread.sleep(5000);
//		List<WebElement> colname = Init.getDriver()
//				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] beforesort = new String[colname.size()];
//
//		for (int i = 0; i < colname.size(); i++) {
//			beforesort[i] = colname.get(i).getText().trim();
//			System.out.println(beforesort[i]);
//		}
//		System.out.println("sorting value after sort method");
//
//		for (int i = 0; i < colname.size(); i++) {
//			Arrays.sort(beforesort);
//			String sort = beforesort[i];
//			System.out.println(sort);
//		}
//		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] aftersort = new String[colname.size()];
//		System.out.println("sorting in application");
//		System.out.println("-------------------");
//		for (int i = 0; i < colname.size(); i++) {
//			aftersort[i] = colname.get(i).getText().trim();
//			System.out.println(aftersort[i]);
//		}
//		Assert.assertEquals(beforesort, aftersort);
//	}
//
//	@Test( = 51)
//	@Description("Test to check Lok Sabha Employee List is sort acc to Constituency(Descending order)")
//	@Epic("TG002")
//	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void sortbyconst_dsc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(5000);
////		 List<Integer> celltext_list = Arrays.asList(celltext);
////		    Collections.sort(celltext_list, Collections.reverseOrder());
////		    int[] celltext_new = celltext_list.toArray();
////
////		    if(Arrays.equals(celltext_new, celltext)){
////		        System.out.println("Celltext is in descending order")
////		    }
////		    else{
////		        System.out.println("Celltext is in ascending order")
////		    }
//		List<WebElement> colname = Init.getDriver()
//				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] beforesort = new String[colname.size()];
//
//		for (int i = 0; i < colname.size(); i++) {
//			beforesort[i] = colname.get(i).getText().trim();
//			System.out.println(beforesort[i]);
//		}
//		System.out.println("sorting value after sort method");
//
//		for (int i = 0; i < colname.size(); i++) {
//			colname.sort(Collections.reverseOrder());
//			String sort = beforesort[i];
//			System.out.println(sort);
//		}
//		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] aftersort = new String[colname.size()];
//		System.out.println("sorting in application");
//		System.out.println("-------------------");
//		for (int i = 0; i < colname.size(); i++) {
//			aftersort[i] = colname.get(i).getText().trim();
//			System.out.println(aftersort[i]);
//		}
//		Assert.assertEquals(beforesort, aftersort);
//	}
//
//	@Test( = 52)
//	@Description("Test to check Lok Sabha Employee List is sort acc to Party(Ascending order)")
//	@Epic("TG002")
//	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void sortbyparty_asc() throws InterruptedException {
////		Init.getDriver().navigate().refresh();
//		Thread.sleep(5000);
//		List<WebElement> colname = Init.getDriver()
//				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] beforesort = new String[colname.size()];
//
//		for (int i = 0; i < colname.size(); i++) {
//			beforesort[i] = colname.get(i).getText().trim();
//			System.out.println(beforesort[i]);
//		}
//		System.out.println("sorting value after sort method");
//
//		for (int i = 0; i < colname.size(); i++) {
//			Arrays.sort(beforesort);
//			String sort = beforesort[i];
//			System.out.println(sort);
//		}
//		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] aftersort = new String[colname.size()];
//		System.out.println("sorting in application");
//		System.out.println("-------------------");
//		for (int i = 0; i < colname.size(); i++) {
//			aftersort[i] = colname.get(i).getText().trim();
//			System.out.println(aftersort[i]);
//		}
//		Assert.assertEquals(beforesort, aftersort);
//	}
//
//	@Test( = 53)
//	@Description("Test to check Lok Sabha Employee List is sort acc to Party(Descending order)")
//	@Epic("TG002")
//	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
//	@Severity(SeverityLevel.CRITICAL)
//
//	public void sortbyparty_dsc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
//		Thread.sleep(5000);
////		 List<Integer> celltext_list = Arrays.asList(celltext);
////		    Collections.sort(celltext_list, Collections.reverseOrder());
////		    int[] celltext_new = celltext_list.toArray();
////
////		    if(Arrays.equals(celltext_new, celltext)){
////		        System.out.println("Celltext is in descending order")
////		    }
////		    else{
////		        System.out.println("Celltext is in ascending order")
////		    }
//		List<WebElement> colname = Init.getDriver()
//				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] beforesort = new String[colname.size()];
//
//		for (int i = 0; i < colname.size(); i++) {
//			beforesort[i] = colname.get(i).getText().trim();
//			System.out.println(beforesort[i]);
//		}
//		System.out.println("sorting value after sort method");
//
//		for (int i = 0; i < colname.size(); i++) {
//			colname.sort(Collections.reverseOrder());
//			String sort = beforesort[i];
//			System.out.println(sort);
//		}
//		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
//		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
//		String[] aftersort = new String[colname.size()];
//		System.out.println("sorting in application");
//		System.out.println("-------------------");
//		for (int i = 0; i < colname.size(); i++) {
//			aftersort[i] = colname.get(i).getText().trim();
//			System.out.println(aftersort[i]);
//		}
//		Assert.assertEquals(beforesort, aftersort);
//	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to PId(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbypid_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to PId(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbypid_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Biometric Captured(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbybiometric_asc() throws InterruptedException {
//		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			Arrays.sort(beforesort);
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}

	@Test()
	@Description("Test to check Lok Sabha Employee List is sort acc to Biometric Captured(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Employee Dashboard - Registered Employees List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbybiometric_dsc() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(5000);
//		 List<Integer> celltext_list = Arrays.asList(celltext);
//		    Collections.sort(celltext_list, Collections.reverseOrder());
//		    int[] celltext_new = celltext_list.toArray();
//
//		    if(Arrays.equals(celltext_new, celltext)){
//		        System.out.println("Celltext is in descending order")
//		    }
//		    else{
//		        System.out.println("Celltext is in ascending order")
//		    }
		List<WebElement> colname = Init.getDriver()
				.findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] beforesort = new String[colname.size()];

		for (int i = 0; i < colname.size(); i++) {
			beforesort[i] = colname.get(i).getText().trim();
			System.out.println(beforesort[i]);
		}
		System.out.println("sorting value after sort method");

		for (int i = 0; i < colname.size(); i++) {
			colname.sort(Collections.reverseOrder());
			String sort = beforesort[i];
			System.out.println(sort);
		}
		Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		// Init.getDriver().findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")).click();
		colname = Init.getDriver().findElements(By.xpath("//table[@id=\"DataTables_Table_0\"]/tbody/tr/td[2]"));
		String[] aftersort = new String[colname.size()];
		System.out.println("sorting in application");
		System.out.println("-------------------");
		for (int i = 0; i < colname.size(); i++) {
			aftersort[i] = colname.get(i).getText().trim();
			System.out.println(aftersort[i]);
		}
		Assert.assertEquals(beforesort, aftersort);
	}
    
	
	// Scripts for verify labels of Add Lok Sabha Employee 
	
	//Fully Completed
	@Test()
	@Description("Test for verify Title of Lok Sabha Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void verifytitleLSempregisform() throws InterruptedException {
		String exp = "Lok Sabha Employee Registarion Form";		
		WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[1]/div/div/div[1]/h3/text()"));
		String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	      
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of Category Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempcategory() throws InterruptedException {
		String exp = "Category";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[1]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
    
	//Fully Completed
	@Test()
	@Description("Test for verify label of Employee Id field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempempidno() throws InterruptedException {
		String exp = "Employee Id";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[2]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of Full name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempname() throws InterruptedException {
		String exp = "Full Name";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[3]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of Gender Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempgender() throws InterruptedException {
		String exp = "Gender";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[4]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of  Service Start Date field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempserstart() throws InterruptedException {
		String exp = "Service Start Date";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[5]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of  Service End date field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempserend() throws InterruptedException {
		String exp = "Service End Date";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[6]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of Date of birth")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempdob() throws InterruptedException {
		String exp = "Date of Birth";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[7]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of  Email Id field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempemailid() throws InterruptedException {
		String exp = "Email";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[8]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	//Fully Completed
	@Test()
	@Description("Test for verify label of Aadhaar Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempadhar() throws InterruptedException {
		String exp = "Aadhaar Card Number";
		 WebElement m = Init.getDriver().findElement(By.xpath("/html/body/app-root/app-ls-employee-dashboard/div/div/main/app-add-ls-emp/div/div/main/div/div/div/div/div[2]/div/form/div/div[9]/div/div[1]/label/text()"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	}
	zxzxzxxzzxcnbmhjl
	@Test()
	@Description("Test for verify label of  Mobile Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempmobilenumber() throws InterruptedException {
		String exp = "Mobile Number";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of  Emergency Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempemernumber() throws InterruptedException {
		String exp = "Emergency Contact Number";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	@Test()
	@Description("Test for verify label of  Alternate Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempaltrnumber() throws InterruptedException {
		String exp = "Alternate Contact Number";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of  Office Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempoffcenumber() throws InterruptedException {
		String exp = "Alternate Contact Number";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of Departmnent dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempdepartment() throws InterruptedException {
		String exp = "Designation";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	@Test()
	@Description("Test for verify label of branch Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempbranch() throws InterruptedException {
		String exp = "Branch";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	@Test()
	@Description("Test for verify label of Unit dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempunit() throws InterruptedException {
		String exp = "Employee Id";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	@Test()
	@Description("Test for verify label of Designation dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempdesignation() throws InterruptedException {
		String exp = "Identification Mark";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);	     
	}
	
	
	
	@Test()
	@Description("Test for verify label of Identification Mark")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempidenmark() throws InterruptedException {
		String exp = "Identification Mark";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of Blood Group Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempbloodgroup() throws InterruptedException {
		String exp = "Blood Group";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
		
	@Test()
	@Description("Test for verify label of Fax Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempfax() throws InterruptedException {
		String exp = "Fax";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of Present Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelLSempresAddress() throws InterruptedException {
		String exp = "Present Address";
		 WebElement m = Init.getDriver().findElement(By.xpath(""));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      Assert.assertEquals(act , exp);
	     
	}
	
	@Test()
	@Description("Test for verify label of Present Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAflatNo() throws InterruptedException {
		String exp = "Flat No./House No.";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Present Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPALocality() throws InterruptedException {
		String exp = "Locality";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Present Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAstate() throws InterruptedException {
		String exp = "State";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Present Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAcity() throws InterruptedException {
		String exp = "City";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Present Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPApincode() throws InterruptedException {
		String exp = "Pin Code";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}
	@Test()
	@Description("Test for verify label of Present Address - Country")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAcountry() throws InterruptedException {
		String exp = "Country";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPermanentAddress() throws InterruptedException {
		String exp = "Permanent Address";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAflatNo() throws InterruptedException {
		String exp = "Flat No./House No.";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeALocality() throws InterruptedException {
		String exp = "Locality";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAstate() throws InterruptedException {
		String exp = "State";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAcity() throws InterruptedException {
		String exp = "City";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test()
	@Description("Test for verify label of Permanent Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeApincode() throws InterruptedException {
		String exp = "Pin Code";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}
	
	@Test()
	@Description("Test for verify label of Permanent Address - Country")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Dashboard - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPecountry() throws InterruptedException {
		String exp = "Country";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}
	

	
	   
	
//	@Test()
//	@Description("Test for verify label of special Print Character field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Employee Registration - Add Employee")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabelLSempsplprintcharacter() throws InterruptedException {
//		String exp = "Special Print Character";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act , exp);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  RFID field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Employee Registration - Add Employee")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabelLSemprfid() throws InterruptedException {
//		String exp = "RFID Number";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act , exp);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of  Signing Authority Code field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Employee Registration - Add Employee")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabelLSempsigningauthority() throws InterruptedException {
//		String exp = "Signing Authority Code";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act , exp);
//	     
//	}
	
	
		
	
	
	// Scripts for Checking presence of fields in Employee Registration Forms
	
	@Test()
	@Description("Verify Category field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_category() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Verify Employee Id field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_empid() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Name field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_name() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Gender dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_gender() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Verify Sevice Start From Date field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_validfrom() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Service End To Date field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_validtill() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Date of birth field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_dob() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Test for verify presence of  Email Id field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_emailid() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}

	@Test()
	@Description("Verify Aadhaar Number field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_aadhar() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Test for verify presence of  Mobile Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresence_mobilenumber() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Test for verify presence of  Emergency Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_emernumber() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Test for verify presence of  Alternate Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_altrnumber() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Test for verify presence of  Office Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_offcnumber() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Department dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_department() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Verify Branch dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_branch() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Verify Unit dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_unit() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Verify Designation dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_designation() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	@Test()
	@Description("Verify Identification Mark Field presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_idenmark() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Verify Blood Group dropdown presence in Employee Registration Page")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void presence_bloodgroup() throws IOException, InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	

	@Test()
	@Description("Test for verify presence of  Fax Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_fax() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	
	
	@Test()
	@Description("Test for verify presence of Present Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePAflatNo() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Present Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePALocality() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Present Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePAstate() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Present Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePAcity() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Present Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePApincode() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}
	@Test()
	@Description("Test for verify presence of Present Address - Country")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePAcountry() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Permanent Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAflatNo() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Permanent Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeALocality() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Permanent Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAstate() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Permanent Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAcity() throws InterruptedException {
		String exp = "City";
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test()
	@Description("Test for verify presence of Permanent Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeApincode() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}
	
	@Test()
	@Description("Test for verify presence of Permanent Address - Country")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presencePecountry() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}
	

	@Test()
	@Description("Test for verify presence of Validate button field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresence_validateb() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	@Test()
	@Description("Test for verify presence of Cancel button field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresence_Cancelb() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	
	@Test()
	@Description("Test for verify presence of Save button field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresence_Saveb() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	@Test()
	@Description("Test for verify presence of special Print Character field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_splprintcharacter() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	
	@Test()
	@Description("Test for verify presence of  RFID field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_rfid() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	}
	
	
	@Test()
	@Description("Test for verify presence of  Signing Authority Code field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void presence_signingauthority() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	
//	@Test()
//	@Description("Test for verify presence of Upload Photo button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Employee Registration - Add Employee")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_uploadphoto() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of Capture Biometric button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Employee Registration - Add Employee")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_biometric() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
	//////////////////////////////////////////////////////////////////////////////////
	
	
	// Functional Scripts for Employee name field
	
	@Test()
	@Description("To check whether all values are added in Category dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_category() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
	     List<String> actualdropdownvalues= new ArrayList<String>();
	      for(WebElement element: s.getOptions())
	      {
	    	  actualdropdownvalues.add(element.getText());
	      }
	      List<String> expdropdownvalues= new ArrayList<String>();
	      expdropdownvalues.add("");
	      expdropdownvalues.add("");
	      expdropdownvalues.add("");	      
	      for (int i = 0; i< actualdropdownvalues.size(); i++) {
			Assert.assertTrue(actualdropdownvalues.get(i).equals(expdropdownvalues.get(i)));
	}
	      
	}
	@Test()
	@Description("To check Category dropdown without choosing the Category")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_emptyCategory() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement t=Init.getDriver().findElement(By.xpath(""));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
		se.selectByVisibleText(""); 
		String exp = "ERROR! Category is required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("To check Category dropdown by choosing the Category")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_validCategory() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement t=Init.getDriver().findElement(By.xpath(""));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
		se.selectByVisibleText(""); 
		String exp = "ABCDE";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
		String act = "ABCDE";
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	// Scripts for Employee Id Field
	
	@Test()
	@Description("To check whether the  min length validation on Employee Id field is applied or not")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsemp_minempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("2431");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Employee Id is too Short";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("To check whether the max length validation on Employee Id field is applied properly or not")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsemp_maxempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("To check whether the Employee Id  validation is applied properly on field or not by passing blank space between the no.")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_spacebwempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Employee Id";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether the Employee Id  validation is applied properly on field or not by passing 10 zeros")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_tenzeroempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Employee Id";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether the Employee Id  validation is applied properly on field or not by passing 10 spaces")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_tenspaceempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Employee Id";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether the Employee Id validation is applied properly on Employee Id field or not without passingany value.")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_novalueempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Employee Id is Required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("To check whether the Employee Id validation is applied properly on Employee Id field or not by passing alphabets")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_onlyalphabetsempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Employee Id";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether the Employee Id validation is applied properly on Employee Id field or not by passing special characters")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_onlyspclcharempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Employee Id";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether the Employee Id validation is applied properly on Employee Id field or not by passing numbers")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_onlynoempid() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("24500179");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("Test for verify min Length Validation is applied properly on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.CRITICAL)
	public void addlsemp_minname() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //name
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("")).click();
		String exp = "ERROR!  Name too short! Minimum length required is 3!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify max Length Validation is applied properly on  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_maxname() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd");
		Thread.sleep(1000);
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR!  Name too long! Maximum length 100!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify number Validation is applied properly on  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_onlynumber() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123456789");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify special Characters Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_onlyspecialcharacters() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("!@@#$%$#@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
		
	@Test()
	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_onlyaplusn() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asda123");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify combination of alphabets and special characters is applied properly on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)
	public void addlsemp_onlyapluss() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asdaa@#$!");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_onlynpluss() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123!@#$");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing spaces in staring on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_spaceatstarts() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("   Sanjana");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("Test for verify space validation by passing spaces at end on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_spaceatend() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Sanjana    ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing only spaces on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_onlyspace() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether by without passing value in the  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_novlaue() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR!  Name is required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether by passing valid name in name field")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_validname() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Parul Pal");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether all values are added in Gender dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_gender() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
	     List<String> actualdropdownvalues= new ArrayList<String>();
	      for(WebElement element: s.getOptions())
	      {
	    	  actualdropdownvalues.add(element.getText());
	      }
	      List<String> expdropdownvalues= new ArrayList<String>();
	      expdropdownvalues.add("Male");
	      expdropdownvalues.add("Female");
	      expdropdownvalues.add("Transgender");	      
	      for (int i = 0; i< actualdropdownvalues.size(); i++) {
			Assert.assertTrue(actualdropdownvalues.get(i).equals(expdropdownvalues.get(i)));
	}
	      
	}
	@Test()
	@Description("To check Gender dropdown without choosing the Gender")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_emptygender() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement t=Init.getDriver().findElement(By.xpath(""));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
		se.selectByVisibleText(""); 
		String exp = "ERROR! Gender is required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	@Test()
	@Description("To check Gender dropdown by choosing the Gender")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_validgender() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement t=Init.getDriver().findElement(By.xpath(""));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
		se.selectByVisibleText(""); 
		String exp = "Male";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
		String act = "Male";
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act , exp);
	}
	
	@Test()
	@Description("To check whether Service Start from field is showing error when value is not passing")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_serend() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	
	@Test()
	@Description("To check whether Service Start from field is taken valid date or not")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_serstart() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	
	@Test()
	@Description("To check whether Service End To field is showing error when value is not passing")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_serempt() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	
	@Test()
	@Description("To check whether Service Start from field is taken valid date or not")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_servend() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	@Test()
	@Description("To check whether dob field is showing error when value is not passing")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_dobempty() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	@Test()
	@Description("To check whether dob field is taken valid date or not")
	@Epic("TG003")
	@Feature("Lok Sabha Employee Registration - Add Employee")
	@Severity(SeverityLevel.NORMAL)

	public void addlsemp_dob() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2022");
		// Dob Test Script here
	}
	
	// Scripts for email address
			@Test()
			@Description("Test for verify min Length Validation is applied properly on email  field")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)
			public void addlsemp_prefixmin() throws InterruptedException {
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys(""); //Locality
				Thread.sleep(1000);			
				Init.getDriver().findElement(ByAngular.buttonText("")).click();
				String exp = "ERROR!  Email too short! Minimum length required is 10!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("Test for verify max Length Validation is applied properly on email field")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_prefixmax() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaasaaaaaaaaaaaaaaaaaaa@gmail.com");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Email too long! Maximum length 50!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("Test for verify email Address without @ symbol")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_withoutattherate() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("testgmail.com");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("Test for verify email Address by passing @ symbol at end")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_attherateatend() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com@");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("Test for verify email Address by passing @ symbol at start")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_attherateatstart() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("@test@gmail.com");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("Test for verify email Address by passing . symbol at end")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_dotatend() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com.");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("Test for verify email Address by passing . symbol at start")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_dotatstart() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("@test@gmail.com");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}

			@Test()
			@Description("Test for verify email Address without . symbol")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_withoutdot() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmailcom");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR!  Invalid email!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("Test for verify email Address by passing valid email address")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_validemail() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("input[formcontrolname=email]")).sendKeys("test@gmail.com");
				Thread.sleep(1000);
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			
			// Scripts For AAdhaar No Field
			
			@Test()
			@Description("To Verify the aadhar number field by entering the less than 12-digit aadhar number.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addLsEmpadharmin() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addLsEmpMaxAadhaar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addLsEmpStartzeroAadhaar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addLsEmpOnlyAlphaAadhar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addLsEmpSpclcharAadhar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addLsEmpOnlyspaceAadhar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addLsEmpAllZeroAadhar() throws InterruptedException {
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
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addLsEmpValidAadhar() throws InterruptedException {
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
			
			// Scripts for Mobile Number
			
			@Test()
			@Description("To check whether the  min length validation on Mobile Number field is applied or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_minmob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Mobile No. is too Short";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the max length validation on Mobile Number field is applied properly or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_maxmob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing blank space between the no.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_spacebwmob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid Mobile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 zeros")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_tenzeromob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid Mobile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 spaces")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_tenspacemob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid Mobile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not without passingany value.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_novaluemob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Mobile No. is Required!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing alphabets")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyalphabetsmob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid Mobile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing special characters")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyspclcharmob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid Mobile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing numbers")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlynomob() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			
			// Scripts For Emergency Contact Number Field
			@Test()
			@Description("To check whether the  min length validation on Emergency Contact Number field is applied or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_minemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! emernumile No. is too Short";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the max length validation on Emergency Contact Number field is applied properly or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_maxemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Emergency Contact Number  validation is applied properly on field or not by passing blank space between the no.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_spacebwemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid emernumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Emergency Contact Number  validation is applied properly on field or not by passing 10 zeros")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_tenzeroemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid emernumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Emergency Contact Number  validation is applied properly on field or not by passing 10 spaces")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_tenspaceemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid emernumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Emergency Contact Number validation is applied properly on Emergency Contact Number field or not without passingany value.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_novalueemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! emernumile No. is Required!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Emergency Contact Number validation is applied properly on Emergency Contact Number field or not by passing alphabets")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyalphabetsemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid emernumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Emergency Contact Number validation is applied properly on Emergency Contact Number field or not by passing special characters")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyspclcharemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid emernumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Emergency Contact Number validation is applied properly on Emergency Contact Number field or not by passing numbers")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlynoemernum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			// Scripts for Alternate Contact Number Field
			
			@Test()
			@Description("To check whether the  min length validation on Alternate Contact Number field is applied or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_minaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! altrnumile No. is too Short";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the max length validation on Alternate Contact Number field is applied properly or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_maxaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Alternate Contact Number  validation is applied properly on field or not by passing blank space between the no.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_spacebwaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid altrnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Alternate Contact Number  validation is applied properly on field or not by passing 10 zeros")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_tenzeroaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid altrnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Alternate Contact Number  validation is applied properly on field or not by passing 10 spaces")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_tenspacealtrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid altrnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Alternate Contact Number validation is applied properly on Alternate Contact Number field or not without passingany value.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_novaluealtrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! altrnumile No. is Required!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Alternate Contact Number validation is applied properly on Alternate Contact Number field or not by passing alphabets")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyalphabetsaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid altrnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Alternate Contact Number validation is applied properly on Alternate Contact Number field or not by passing special characters")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyspclcharaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid altrnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Alternate Contact Number validation is applied properly on Alternate Contact Number field or not by passing numbers")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlynoaltrnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the  min length validation on Office Contact Number field is applied or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_minoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! offcnumile No. is too Short";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the max length validation on Office Contact Number field is applied properly or not")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.CRITICAL)

			public void addlsemp_maxoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Office Contact Number  validation is applied properly on field or not by passing blank space between the no.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_spacebwoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid offcnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Office Contact Number  validation is applied properly on field or not by passing 10 zeros")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_tenzerooffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid offcnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Office Contact Number  validation is applied properly on field or not by passing 10 spaces")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_tenspaceoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid offcnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Office Contact Number validation is applied properly on Office Contact Number field or not without passingany value.")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_novalueoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! offcnumile No. is Required!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check whether the Office Contact Number validation is applied properly on Office Contact Number field or not by passing alphabets")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyalphabetsoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid offcnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Office Contact Number validation is applied properly on Office Contact Number field or not by passing special characters")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlyspclcharoffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "ERROR! Invalid offcnumile No.";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			@Test()
			@Description("To check whether the Office Contact Number validation is applied properly on Office Contact Number field or not by passing numbers")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_onlynooffcnum() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
				Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
				String exp = "";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			// Scripts for Department Dropdown Field
			@Test()
			@Description("To check whether all values are added in Department dropdown")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)
			public void addlsemp_dept() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				Select s = new Select(Init.getDriver().findElement(By.xpath("")));
			     List<String> actualdepts= new ArrayList<String>();
			      for(WebElement element: s.getOptions())
			      {
			    	  actualdepts.add(element.getText());
			      }
			      List<String> expdepts= new ArrayList<String>();
			      expdepts.add("Operations");
			      //Rest All Dept add here
			      
			      for (int i = 0; i< actualdepts.size(); i++) {
					Assert.assertTrue(actualdepts.get(i).equals(expdepts.get(i)));
			}
			      
			}
			
			@Test()
			@Description("To check Department dropdown without choosing the Department")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_emptydept() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				WebElement t=Init.getDriver().findElement(By.xpath(""));
				t.click();
				Select se = new Select(Init.getDriver().findElement(By.xpath("")));
				se.selectByVisibleText(""); 
				String exp = "ERROR! Department is required!";
				WebElement m = Init.getDriver().findElement(
						By.xpath(""));
				String act = m.getText();
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			@Test()
			@Description("To check Department dropdown by choosing the Department")
			@Epic("TG003")
			@Feature("Lok Sabha Employee Registration - Add Employee")
			@Severity(SeverityLevel.NORMAL)

			public void addlsemp_validdepts() throws InterruptedException {
				Init.getDriver().navigate().refresh();
				Thread.sleep(1000);
				WebElement t=Init.getDriver().findElement(By.xpath(""));
				t.click();
				Select se = new Select(Init.getDriver().findElement(By.xpath("")));
				se.selectByVisibleText("A+"); 
				String exp = "Operations";
//				WebElement m = Init.getDriver().findElement(
//						By.xpath(""));
				String act = "Operations";
				System.out.println("Error message is: " + act);
				Assert.assertEquals(act , exp);
			}
			
			// Scripts for Branch Dropdown Field
						@Test()
						@Description("To check whether all values are added in Branch dropdown Based on Department")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_branch() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("Operations"); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualbranchs= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualbranchs.add(element.getText());
						      }
						      List<String> expbranchs= new ArrayList<String>();
						      expbranchs.add("op1");
						      //Rest All branch add here
						      
						      for (int i = 0; i< actualbranchs.size(); i++) {
								Assert.assertTrue(actualbranchs.get(i).equals(expbranchs.get(i)));
						}
						      
						}
						@Test()
						@Description("To check whether values are displayed in Branch dropdown Without Choosing the Department")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_withoutdept() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualbranchs= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualbranchs.add(element.getText());
						      }
						      List<String> expbranchs= new ArrayList<String>();
						      expbranchs.add("");
						      //Rest All branch add here
						      
						      for (int i = 0; i< actualbranchs.size(); i++) {
								Assert.assertTrue(actualbranchs.get(i).equals(expbranchs.get(i)));
						}
						      
						}
						
						
						@Test()
						@Description("To check Branch dropdown without choosing the Branch")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptybranch() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "ERROR! Branch is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check Branch dropdown by choosing the Branch")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validbranchs() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("op1"); 
							String exp = "op1";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "op1";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
					
						// Scripts for Unit Dropdown Field
						@Test()
						@Description("To check whether all values are added in Unit dropdown Based on Department")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Unit() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("op1"); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualUnits= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualUnits.add(element.getText());
						      }
						      List<String> expUnits= new ArrayList<String>();
						      expUnits.add("op11");
						      //Rest All Unit add here
						      
						      for (int i = 0; i< actualUnits.size(); i++) {
								Assert.assertTrue(actualUnits.get(i).equals(expUnits.get(i)));
						}
						      
						}
						@Test()
						@Description("To check whether values are displayed in Unit dropdown Without Choosing the Branch")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_withoutbranch() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualUnits= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualUnits.add(element.getText());
						      }
						      List<String> expUnits= new ArrayList<String>();
						      expUnits.add("");
						      //Rest All Unit add here
						      
						      for (int i = 0; i< actualUnits.size(); i++) {
								Assert.assertTrue(actualUnits.get(i).equals(expUnits.get(i)));
						}
						      
						}
						
						
						@Test()
						@Description("To check Unit dropdown without choosing the Unit")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptyUnit() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check Unit dropdown by choosing the Branch")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validUnits() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("op11"); 
							String exp = "op11";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "op11";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
			
						// Scripts for Designation Dropdown Field
						@Test()
						@Description("To check whether all values are added in Designation dropdown Based on Department")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Designation() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("op1"); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualDesignations= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualDesignations.add(element.getText());
						      }
						      List<String> expDesignations= new ArrayList<String>();
						      expDesignations.add("op11");
						      //Rest All Designation add here
						      
						      for (int i = 0; i< actualDesignations.size(); i++) {
								Assert.assertTrue(actualDesignations.get(i).equals(expDesignations.get(i)));
						}
						      
						}
						@Test()
						@Description("To check whether values are displayed in Designation dropdown Without Choosing the Category")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_withoutCategory() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualDesignations= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualDesignations.add(element.getText());
						      }
						      List<String> expDesignations= new ArrayList<String>();
						      expDesignations.add("");
						      //Rest All Designation add here
						      
						      for (int i = 0; i< actualDesignations.size(); i++) {
								Assert.assertTrue(actualDesignations.get(i).equals(expDesignations.get(i)));
						}
						      
						}
						
						
						@Test()
						@Description("To check Designation dropdown without choosing the Designation")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptyDesignation() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check Designation dropdown by choosing the Designations")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validDesignations() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("op11"); 
							String exp = "op11";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "op11";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
					// Scripts for Identification Mark Field	
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_minIdentificationMark() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Identification Mark
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  Identification Mark too short! Minimum length required is 10!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_maxIdentificationMark() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadd");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Identification Mark too long! Maximum length 100!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_onlynumbers() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_onlyspecialcharacter() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_onlyaplusnu() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_onlyaplusspecial() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_onlynplusspecial() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_spaceatstart() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("   Sanjana");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Identification Mark";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_spaceatlast() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Sanjana    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Identification Mark";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_onlyspaces() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Identification Mark";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptyvlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Identification Mark is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid Identification Mark in Identification Mark field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validIdentificationMark() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Mole on right hand");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}	
						
						// Scripts for Blood Group Dropdown
						@Test()
						@Description("To check whether all values are added in Blood Group dropdown")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_bloodgroup() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualbloodgroups= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualbloodgroups.add(element.getText());
						      }
						      List<String> expbloodgroups= new ArrayList<String>();
						      expbloodgroups.add("A+");
						      expbloodgroups.add("A-");
						      expbloodgroups.add("B+");	
						      expbloodgroups.add("B-");
						      expbloodgroups.add("O+");
						      expbloodgroups.add("O-");
						      expbloodgroups.add("AB+");	
						      expbloodgroups.add("AB-");
						      for (int i = 0; i< actualbloodgroups.size(); i++) {
								Assert.assertTrue(actualbloodgroups.get(i).equals(expbloodgroups.get(i)));
						}
						      
						}
						
						@Test()
						@Description("To check Blood Group dropdown without choosing the Blood Group")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptybg() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "ERROR! Blood Group is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check Blood Group dropdown by choosing the Blood Group")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validbg() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText("A+"); 
							String exp = "A+";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "A+";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						
						//Scripts for Fax No should write here
						@Test()
						@Description("To check whether the  min length validation on Fax Number field is applied or not")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)

						public void addlsemp_minfax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Fax No. is too Short";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check whether the max length validation on Fax Number field is applied properly or not")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)

						public void addlsemp_maxfax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check whether the Fax Number  validation is applied properly on field or not by passing blank space between the no.")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_spacebwfax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Fax No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether the Fax Number  validation is applied properly on field or not by passing 10 zeros")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_tenzerofax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Fax No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether the Fax Number  validation is applied properly on field or not by passing 10 spaces")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_tenspacefax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Fax No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not without passingany value.")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_novaluefax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Fax No. is Required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing alphabets")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_onlyalphabetsfax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Fax No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing special characters")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_onlyspclcharfax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Fax No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing numbers")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_onlynofax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Residential Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_Raddrflatnomin() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrflatnomax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Flat No. too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrflatnoonlynumbers() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrflatnoonlyspclchar() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrflatnoonlyaplusnu() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrflatnoonlyaplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnoonlynplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnospaceatstart() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnospaceatlast() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnoonlyspaces() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnoemptyvlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Flat No. is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid Flat No. in Flat No. field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrflatnovalid() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						
						// Test Scripts for locality 
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Residential Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_Raddrlocalitymin() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  Locality too short! Minimum length required is 4!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrlocalitymax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Locality too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrlocalityonlynumbers() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrlocalityonlyspclchar() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrlocalityonlyaplusnu() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Raddrlocalityonlyaplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityonlynplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityspaceatstart() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityspaceatlast() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityonlyspaces() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityemptyvlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Locality is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid Locality in Locality field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Raddrlocalityvalid() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						// Scripts for State dropdown
						
						@Test()
						@Description("To check whether all values are added in State dropdown")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_state() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualstates= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualstates.add(element.getText());
						      }
						      List<String> expstates= new ArrayList<String>();
						      expstates.add("Andhra Pradesh");
						      expstates.add("Arunachal Pradesh");
						      expstates.add("Assam");
						      expstates.add("Bihar");
						      expstates.add("Chhattisgarh");
						      expstates.add("Goa");
						      expstates.add("Gujarat");
						      expstates.add("Haryana");
						      expstates.add("Jharkhand");
						      expstates.add("Karnataka");
						      expstates.add("Kerala");
						      expstates.add("Madhya Pradesh");
						      expstates.add("Maharashtra");
						      expstates.add("Manipur");
						      expstates.add("Meghalaya");
						      expstates.add("Mizoram");
						      expstates.add("Nagaland");
						      expstates.add("Odisha");
						      expstates.add("Punjab");
						      expstates.add("Rajasthan");
						      expstates.add("Sikkim");
						      expstates.add("Tamil Nadu");
						      expstates.add("Telangana");
						      expstates.add("Tripura");
						      expstates.add("Uttar Pradesh");
						      expstates.add("Uttarakhand");
						      expstates.add("West Bengal");
						      expstates.add("Andaman and Nicobar Islands");
						      expstates.add("Chandigarh");
						      expstates.add("Dadra & Nagar Haveli and Daman & Diu");
						      expstates.add("Delhi");
						      expstates.add("Jammu and Kashmir");
						      expstates.add("Lakshadweep");
						      expstates.add("Puducherry");
						      expstates.add("Ladakh");
						      for (int i = 0; i< actualstates.size(); i++) {
								Assert.assertTrue(actualstates.get(i).equals(expstates.get(i)));
						}
						      
						}
						@Test()
						@Description("To check State dropdown without choosing the State")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_emptystate() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "ERROR! State is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check State dropdown by choosing the State")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validstate() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "Uttar Pradesh";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "Uttar Pradesh";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						 
						
						// Script for City Field
						@Test()
						@Description("Test for verify min Length Validation is applied properly on City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_minCity() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  City too short! Minimum length required is 3!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_maxCity() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  City too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_cityonlynumber() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_cityonlyspclchars() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_cityonlyaplusn() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_cityonlyapluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_cityonlynpluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_cityspaceatstarts() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_cityspaceatend() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_cityonlyspace() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_citynovlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  City is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid City in City field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validCity() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						
						// Scripts for pincode
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_minPinCode() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_maxPinCode() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("2013079");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  PinCode too long! Maximum length 6!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pincodeonlynumber() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pincodeonlyspclchars() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pincodeonlyaplusn() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pincodeonlyapluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pincodeonlynpluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pincodespaceatstarts() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pincodespaceatend() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pincodeonlyspace() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pincodenovlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  PinCode is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid PinCode in PinCode field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_validPinCode() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						 
						// Scripts for Permanent Address
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_Paddrflatnomin() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrflatnomax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Flat No. too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrflatnoonlynumbers() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on   Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrflatnoonlyspclchar() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrflatnoonlyaplusnu() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrflatnoonlyaplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnoonlynplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnospaceatstart() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnospaceatlast() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnoonlyspaces() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Flat No.";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnoemptyvlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Flat No. is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid Flat No. in Permanent Address(Flat No.) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrflatnovalid() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						
						// Test Scripts for locality 
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_Paddrlocalitymin() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  Locality too short! Minimum length required is 4!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrlocalitymax() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Locality too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrlocalityonlynumbers() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrlocalityonlyspclchar() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrlocalityonlyaplusnu() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_Paddrlocalityonlyaplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityonlynplusspcl() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityspaceatstart() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityspaceatlast() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityonlyspaces() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid Locality";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityemptyvlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  Locality is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid Locality in Permanent Address(Locality) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_Paddrlocalityvalid() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						// Scripts for State dropdown
						
						@Test()
						@Description("To check whether all values are added in Permanent Address(State) dropdown")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pstate() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Select s = new Select(Init.getDriver().findElement(By.xpath("")));
						     List<String> actualstates= new ArrayList<String>();
						      for(WebElement element: s.getOptions())
						      {
						    	  actualstates.add(element.getText());
						      }
						      List<String> expstates= new ArrayList<String>();
						      expstates.add("Andhra Pradesh");
						      expstates.add("Arunachal Pradesh");
						      expstates.add("Assam");
						      expstates.add("Bihar");
						      expstates.add("Chhattisgarh");
						      expstates.add("Goa");
						      expstates.add("Gujarat");
						      expstates.add("Haryana");
						      expstates.add("Jharkhand");
						      expstates.add("Karnataka");
						      expstates.add("Kerala");
						      expstates.add("Madhya Pradesh");
						      expstates.add("Maharashtra");
						      expstates.add("Manipur");
						      expstates.add("Meghalaya");
						      expstates.add("Mizoram");
						      expstates.add("Nagaland");
						      expstates.add("Odisha");
						      expstates.add("Punjab");
						      expstates.add("Rajasthan");
						      expstates.add("Sikkim");
						      expstates.add("Tamil Nadu");
						      expstates.add("Telangana");
						      expstates.add("Tripura");
						      expstates.add("Uttar Pradesh");
						      expstates.add("Uttarakhand");
						      expstates.add("West Bengal");
						      expstates.add("Andaman and Nicobar Islands");
						      expstates.add("Chandigarh");
						      expstates.add("Dadra & Nagar Haveli and Daman & Diu");
						      expstates.add("Delhi");
						      expstates.add("Jammu and Kashmir");
						      expstates.add("Lakshadweep");
						      expstates.add("Puducherry");
						      expstates.add("Ladakh");
						      for (int i = 0; i< actualstates.size(); i++) {
								Assert.assertTrue(actualstates.get(i).equals(expstates.get(i)));
						}
						      
						}
						@Test()
						@Description("To check Permanent Address(State) dropdown without choosing the State")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pemptystate() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "ERROR! State is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To check Permanent Address(State) dropdown by choosing the State")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pvalidstate() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							WebElement t=Init.getDriver().findElement(By.xpath(""));
							t.click();
							Select se = new Select(Init.getDriver().findElement(By.xpath("")));
							se.selectByVisibleText(""); 
							String exp = "Uttar Pradesh";
//							WebElement m = Init.getDriver().findElement(
//									By.xpath(""));
							String act = "Uttar Pradesh";
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						 
						
						// Script for City Field
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_pminCity() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  City too short! Minimum length required is 3!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pmaxCity() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaas");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  City too long! Maximum length 50!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pcityonlynumber() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pcityonlyspclchars() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pcityonlyaplusn() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pcityonlyapluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pcityonlynpluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only alphabets are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pcityspaceatstarts() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pcityspaceatend() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pcityonlyspace() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid City";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pcitynovlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  City is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid City in Permanent Address(City) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pvalidCity() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						
						// Scripts for pincode
						
						@Test()
						@Description("Test for verify min Length Validation is applied properly on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.CRITICAL)
						public void addlsemp_pminPinCode() throws InterruptedException {
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
							Thread.sleep(1000);			
							Init.getDriver().findElement(ByAngular.buttonText("")).click();
							String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify max Length Validation is applied properly on  Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_pmaxPinCode() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("2013079");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  PinCode too long! Maximum length 6!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify number Validation is applied properly on  Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_ppincodeonlynumber() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify special Characters Validation is applied properly on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_ppincodeonlyspclchars() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
							
						@Test()
						@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_ppincodeonlyaplusn() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of alphabets and special characters is applied properly on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addlsemp_ppincodeonlyapluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify combination of numbers and special characters Validation is applied properly on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_ppincodeonlynpluss() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Only Numbers are allowed!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing spaces in staring on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_ppincodespaceatstarts() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("Test for verify space validation by passing spaces at end on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_ppincodespaceatend() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("Test for verify space validation by passing only spaces on Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_ppincodeonlyspace() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR! Invalid PinCode";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by without passing value in the  Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_ppincodenovlaue() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "ERROR!  PinCode is required!";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						
						@Test()
						@Description("To check whether by passing valid PinCode in Permanent Address(PinCode) field")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)

						public void addlsemp_pvalidPinCode() throws InterruptedException {
							Init.getDriver().navigate().refresh();
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
							String exp = "";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act , exp);
						}
						@Test()
						@Description("To Check whether cancel button re-direct operator to dashboard page or not")
						@Epic("TG003")
						@Feature("Lok Sabha Employee Registration - Add Employee")
						@Severity(SeverityLevel.NORMAL)
						public void addLSempCancel() throws IOException, InterruptedException {					
							Init.getDriver().findElement(ByAngular.buttonText("Cancel")).click();
							Thread.sleep(1000);
							String curr = Init.getDriver().getCurrentUrl();
							System.out.println("message is: " + curr);	
							String exp = "http://localhost:8090/#/loksabha/home";
							Assert.assertEquals(curr, exp);
							Thread.sleep(1000);
						}
						
						// Scripts for Submit Button
						@Test()
						@Description("To check the Functionality odf Submit button by without passing some details")
						@Epic("TG003")
						@Feature("Lok Sabha Dashboard - Add New member")
						@Severity(SeverityLevel.NORMAL)

						public void addLSempSubmit1() throws InterruptedException {
							Init.getDriver().findElement(By.xpath("/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]")).click();
							Thread.sleep(1000);
							WebElement Category=Init.getDriver().findElement(By.xpath(""));
							Category.click();
							Select category = new Select(Init.getDriver().findElement(By.xpath("")));
							category.selectByVisibleText("Test"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=empid]")).sendKeys("3241799");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=name]")).sendKeys("Surendra Singh Gangwar");
							Thread.sleep(1000);
							WebElement gender=Init.getDriver().findElement(By.xpath(""));
							gender.click();
							Select Gender = new Select(Init.getDriver().findElement(By.xpath("")));
							Gender.selectByVisibleText("Male"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2023");// Service start from date
							Thread.sleep(1000);
							Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/2029");// Service end to date
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=email]")).sendKeys("sgangwar00@gmail.com");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=aadhaar]")).sendKeys("816189759759");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=mobile]")).sendKeys("9540169429");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=emergencycontact]")).sendKeys("0120777759");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=alternatecontact]")).sendKeys("9540169420");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=officeno]")).sendKeys("0120577759");
							Thread.sleep(1000);
							WebElement Department=Init.getDriver().findElement(By.xpath(""));
							Department.click();
							Select department = new Select(Init.getDriver().findElement(By.xpath("")));
							department.selectByVisibleText("Test"); 
							Thread.sleep(1000);
							WebElement Branch=Init.getDriver().findElement(By.xpath(""));
							Branch.click();
							Select branch = new Select(Init.getDriver().findElement(By.xpath("")));
							branch.selectByVisibleText("Test"); 
							Thread.sleep(1000);
							WebElement Unit=Init.getDriver().findElement(By.xpath(""));
							Unit.click();
							Select unit = new Select(Init.getDriver().findElement(By.xpath("")));
							unit.selectByVisibleText("Test");
							Thread.sleep(1000);
							WebElement Designation=Init.getDriver().findElement(By.xpath(""));
							Designation.click();
							Select designation = new Select(Init.getDriver().findElement(By.xpath("")));
							designation.selectByVisibleText("Test");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=idmark]")).sendKeys("Mole on  left side Cheek");
							Thread.sleep(1000);
							WebElement bg=Init.getDriver().findElement(By.xpath(""));
							bg.click();
							Select Bloodgroup = new Select(Init.getDriver().findElement(By.xpath("")));
							Bloodgroup.selectByVisibleText("B+"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=fax]")).sendKeys("0120777759");
							Thread.sleep(1000);
							JavascriptExecutor js = (JavascriptExecutor) Init.getDriver();
							js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
							// present Address
							Init.getDriver().findElement(By.cssSelector("input[formControlName=prflatno]")).sendKeys("E202");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=locality]")).sendKeys("sector 121");
							Thread.sleep(1000);
							WebElement prstate=Init.getDriver().findElement(By.xpath(""));
							prstate.click();
							Select Prstate = new Select(Init.getDriver().findElement(By.xpath("")));
							Prstate.selectByVisibleText("Uttar Pradesh"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=city]")).sendKeys("Bareilly"); 
							Init.getDriver().findElement(By.cssSelector("input[formControlName=pincode]")).sendKeys("201309");
							//permanent Address
							Init.getDriver().findElement(By.cssSelector("input[formControlName=prflatno]")).sendKeys("vrindavan enclave");
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=locality]")).sendKeys("nakatiya");
							Thread.sleep(1000);;
							WebElement pestate=Init.getDriver().findElement(By.xpath(""));
							pestate.click();
							Select Pestate = new Select(Init.getDriver().findElement(By.xpath("")));
							Pestate.selectByVisibleText("Uttar Pradesh"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=city]")).sendKeys("Noida"); 
							Thread.sleep(1000);
							Init.getDriver().findElement(By.cssSelector("input[formControlName=pincode]")).sendKeys("201309");
							Thread.sleep(1000);
							Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();					
							String exp = "Employee Added Successfully";
							WebElement m = Init.getDriver().findElement(
									By.xpath(""));
							String act = m.getText();
							System.out.println("Error message is: " + act);
							Assert.assertEquals(act, exp);
						}// Scripts for Submit button
		
}

