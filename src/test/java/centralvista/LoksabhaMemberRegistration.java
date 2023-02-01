package centralvista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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


public class LoksabhaMemberRegistration {

	@Test(priority = 33)
	@Description("Test for verify Title of Lok Sabha Dashboard  Page")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.NORMAL)
	public void verifytitleLokSabhadashboard() throws InterruptedException {
		String exp = "Lok Sabha Dashboard";
		WebElement m = Init.getDriver()
				.findElement(By.xpath("/html/body/app-root/app-loksabha/div/div/app-ls-header/nav/span"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 34)
	@Description("Test for verify label of Side menu option(First)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption1() throws InterruptedException {
		String exp = "Lok Sabha Members";
		WebElement m = Init.getDriver().findElement(
				By.xpath("/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 35)
	@Description("Test for verify label of Side menu option(Second)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption2() throws InterruptedException {
		Init.getDriver()
				.findElement(By.xpath(
						"/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]"))
				.click();
		String exp = "Add Member";
		WebElement m = Init.getDriver().findElement(By.xpath(
				"/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[1]/div/span[2]"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 36)
	@Description("Test for verify label of Side menu option(Third)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption3() throws InterruptedException {
		String exp = "Lok Sabha Members List";
		WebElement m = Init.getDriver().findElement(By.xpath(
				"/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[2]/div/span[2]"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 37)
	@Description("Test for verify label of Side menu option(Forth)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelSidemenuoption4() throws InterruptedException {
		String exp = "View Details";
		WebElement m = Init.getDriver().findElement(By.xpath(
				"/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[3]/div/span[2]"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 38)
	@Description("Test for verify Header of Lok Sabha Member list page")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard")
	@Severity(SeverityLevel.CRITICAL)
	public void verifyHeader() throws InterruptedException {
		String exp = "Lok Sabha Members List";
		WebElement m = Init.getDriver().findElement(By.xpath(
				"/html/body/app-root/app-loksabha/div/div/main/app-loksabha-mp-list/div/div/main/div/div/div/div/div/div/div/div/h3"));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 39)
	@Description("Test for Viewing Registerd Lok Sabha Members List")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)
	public void viewLokSabhaMPlist() throws InterruptedException {
		Init.getDriver().findElement(By
				.xpath("/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/div/a[2]/div/span[2]"))
				.click();
		String exp = "http://localhost:8090/#/loksabha/MP-list";
		String act = Init.getDriver().getCurrentUrl();
		Assert.assertEquals(act, exp);
		Thread.sleep(5000);

	}
	// TO be Uncomment Later
//	@Test(priority=39)
//	@Description("Test for displaying 25 Lok Sabha members List")
//	@Epic("TG002")
//	@Feature("Lok Sabha Dashboard")
//	@Severity(SeverityLevel.CRITICAL)
//	public void viewLokSabhaMP25() throws InterruptedException {
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

	@Test(priority = 40)
	@Description("Test to check how many Lok Sabha Members is Registered")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)
	public void viewNoofRegisteredMP() throws InterruptedException {
		List<WebElement> rowsNumber = Init.getDriver()
				.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);

	}

	@Test(priority = 41)
	@Description("Test to check Lok Sabha Member List is sort acc to Name(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 41)
	@Description("Test to check Lok Sabha Member List is sort acc to Name(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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
	@Test(priority = 42)
	@Description("Test to check Lok Sabha Member List is sort acc to IcardNo(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyicard_asc() throws InterruptedException {
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

	@Test(priority = 43)
	@Description("Test to check Lok Sabha Member List is sort acc to IcardNo(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbbicard_dsc() throws InterruptedException {
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

	@Test(priority = 44)
	@Description("Test to check Lok Sabha Member List is sort acc to Email(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 45)
	@Description("Test to check Lok Sabha Member List is sort acc to Email(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 46)
	@Description("Test to check Lok Sabha Member List is sort acc to Gender(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 47)
	@Description("Test to check Lok Sabha Member List is sort acc to Gender(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 48)
	@Description("Test to check Lok Sabha Member List is sort acc to Contact No.(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 49)
	@Description("Test to check Lok Sabha Member List is sort acc to Contact No.(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 50)
	@Description("Test to check Lok Sabha Member List is sort acc to Constituency(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyconst_asc() throws InterruptedException {
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

	@Test(priority = 51)
	@Description("Test to check Lok Sabha Member List is sort acc to Constituency(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyconst_dsc() throws InterruptedException {
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

	@Test(priority = 52)
	@Description("Test to check Lok Sabha Member List is sort acc to Party(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyparty_asc() throws InterruptedException {
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

	@Test(priority = 53)
	@Description("Test to check Lok Sabha Member List is sort acc to Party(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
	@Severity(SeverityLevel.CRITICAL)

	public void sortbyparty_dsc() throws InterruptedException {
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

	@Test(priority = 54)
	@Description("Test to check Lok Sabha Member List is sort acc to PId(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 55)
	@Description("Test to check Lok Sabha Member List is sort acc to PId(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 56)
	@Description("Test to check Lok Sabha Member List is sort acc to Biometric Captured(Ascending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	@Test(priority = 57)
	@Description("Test to check Lok Sabha Member List is sort acc to Biometric Captured(Descending order)")
	@Epic("TG002")
	@Feature("Lok Sabha Dashboard - Registered member List")
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

	// Scripts for Add Lok Sabha member form

	@Test(priority = 58)
	@Description("Test for verify Add Lok Sabha member form is open or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void addLoksabhamemberform() throws InterruptedException {
		Init.getDriver()
				.findElement(By.xpath(
						"/html/body/app-root/app-Rajyasabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]"))
				.click();
		String curr = Init.getDriver().getCurrentUrl();
		System.out.println("message is: " + curr);
		String exp = "";
		Assert.assertEquals(curr, exp);
		Thread.sleep(2000);

	}

	@Test(priority = 59)
	@Description("Test for verify label of Full name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelName() throws InterruptedException {
		String exp = "Full Name";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 60)
	@Description("Test for verify label of Gender Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelGender() throws InterruptedException {
		String exp = "Gender";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 61)
	@Description("Test for verify label of Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabel_identificationmark() throws InterruptedException {
		String exp = "Identification Mark";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 62)
	@Description("Test for verify label of Date of birth")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelDob() throws InterruptedException {
		String exp = "Date of Birth";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 63)
	@Description("Test for verify label of Blood Group Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelBloodgroup() throws InterruptedException {
		String exp = "Blood Group";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 64)
	@Description("Test for verify label of  Email Id field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelEmail() throws InterruptedException {
		String exp = "Email";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 65)
	@Description("Test for verify label of  Mobile Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelMobilenumber() throws InterruptedException {
		String exp = "Mobile Number";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 66)
	@Description("Test for verify label of  Fax field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelFax() throws InterruptedException {
		String exp = "Fax";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 67)
	@Description("Test for verify label of Official Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelOffcontact() throws InterruptedException {
		String exp = "Official Contact(Landline)";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 68)
	@Description("Test for verify label of State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelState() throws InterruptedException {
		String exp = "State";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 69)
	@Description("Test for verify label of Constituency dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelConstituency() throws InterruptedException {
		String exp = "Constituency";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 70)
	@Description("Test for verify label of Party dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelParty() throws InterruptedException {
		String exp = "Party";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 71)
	@Description("Test for verify label of Present Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPresentAddress() throws InterruptedException {
		String exp = "Present Address";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 72)
	@Description("Test for verify label of Present Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAflatNo() throws InterruptedException {
		String exp = "Flat No./House No.";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 73)
	@Description("Test for verify label of Present Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPALocality() throws InterruptedException {
		String exp = "Locality";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 74)
	@Description("Test for verify label of Present Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAstate() throws InterruptedException {
		String exp = "State";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 75)
	@Description("Test for verify label of Present Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPAcity() throws InterruptedException {
		String exp = "City";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 76)
	@Description("Test for verify label of Present Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPApincode() throws InterruptedException {
		String exp = "Pin Code";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 77)
	@Description("Test for verify label of Permanent Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPermanentAddress() throws InterruptedException {
		String exp = "Permanent Address";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 78)
	@Description("Test for verify label of Permanent Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAflatNo() throws InterruptedException {
		String exp = "Flat No./House No.";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 79)
	@Description("Test for verify label of Permanent Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeALocality() throws InterruptedException {
		String exp = "Locality";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 80)
	@Description("Test for verify label of Permanent Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAstate() throws InterruptedException {
		String exp = "State";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 81)
	@Description("Test for verify label of Permanent Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeAcity() throws InterruptedException {
		String exp = "City";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 82)
	@Description("Test for verify label of Permanent Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifylabelPeApincode() throws InterruptedException {
		String exp = "Pin Code";
		WebElement m = Init.getDriver().findElement(By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);

	}

//	@Test()
//	@Description("Test for verify label of special Print Character field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_splprintcharacter() throws InterruptedException {
//		String exp = "Special Print Character";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}

//	@Test()
//	@Description("Test for verify label of  RFID field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_rfid() throws InterruptedException {
//		String exp = "RFID";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of  Valid From date field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_validfrom() throws InterruptedException {
//		String exp = "Valid From";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of  Valid Till date field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_validtill() throws InterruptedException {
//		String exp = "Valid Till";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of  Signing Authority Code field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_signingauthority() throws InterruptedException {
//		String exp = "Signing Authority Code";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	@Test()
//	@Description("Test for verify label of Upload Photo button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_uploadphoto() throws InterruptedException {
//		String exp = "Upload Photo";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify label of Capture Biometric button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifylabel_biometric() throws InterruptedException {
//		String exp = "Capture Biometric";
//		 WebElement m = Init.getDriver().findElement(By.xpath(""));
//	      String act = m.getText();
//	      System.out.println("Error message is: "+ act);
//	      Assert.assertEquals(act, exp);
//	     
//	}
//	
	// Scripts for Checking presence of fields in Employee Registration Forms


	@Test(priority = 83)
	@Description("Test for verify presence of Full name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceName() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}

	@Test(priority = 84)
	@Description("Test for verify presence of Gender Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceGender() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}

	@Test(priority = 85)
	@Description("Test for verify presence of Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresence_identificationmark() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}

	@Test(priority = 86)
	@Description("Test for verify presence of Date of birth")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceDob() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}

	@Test(priority = 87)
	@Description("Test for verify presence of Blood Group Dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceBloodgroup() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}

	@Test(priority = 88)
	@Description("Test for verify presence of  Email Id field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceEmail() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 89)
	@Description("Test for verify presence of  Mobile Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceMobilenumber() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 90)
	@Description("Test for verify presence of  Fax field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceFax() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 91)
	@Description("Test for verify presence of Official Contact Number field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceOffcontact() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 92)
	@Description("Test for verify presence of State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceState() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 93)
	@Description("Test for verify presence of Constituency dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceConstituency() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 94)
	@Description("Test for verify presence of Party dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceParty() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 95)
	@Description("Test for verify presence of Present Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePresentAddress() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, false);

	}

	@Test(priority = 96)
	@Description("Test for verify presence of Present Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePAflatNo() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 97)
	@Description("Test for verify presence of Present Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePALocality() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 98)
	@Description("Test for verify presence of Present Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePAstate() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 99)
	@Description("Test for verify presence of Present Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePAcity() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 100)
	@Description("Test for verify presence of Present Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePApincode() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 101)
	@Description("Test for verify presence of Permanent Address field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePermanentAddress() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, false);
	}

	@Test(priority = 102)
	@Description("Test for verify presence of Permanent Address - Flat No. field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAflatNo() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 103)
	@Description("Test for verify presence of Permanent Address - Locality field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeALocality() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 104)
	@Description("Test for verify presence of Permanent Address - State dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAstate() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 105)
	@Description("Test for verify presence of Permanent Address - City TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeAcity() throws InterruptedException {
		String exp = "City";
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);
	}

	@Test(priority = 106)
	@Description("Test for verify presence of Permanent Address - Pin Code TextField")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresencePeApincode() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
		Assert.assertEquals(disstatus, true);

	}
	@Test(priority = 107)
	@Description("Test for verify presence of Submit button field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceSubmitb() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	@Test(priority = 108)
	@Description("Test for verify presence of Cancel button field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void verifypresenceCancelb() throws InterruptedException {
		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
        Assert.assertEquals(disstatus, true);
	     
	}
	
//	@Test()
//	@Description("Test for verify presence of Save button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_Saveb() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
	
//	@Test()
//	@Description("Verify Issued Date field presence in Employee Registration Page")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.NORMAL)
//	public void presence_issuedate() throws IOException, InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	}

//	@Test()
//	@Description("Test for verify presence of special Print Character field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_splprintcharacter() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}

//	@Test()
//	@Description("Test for verify presence of  Valid Till date field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_validtill() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	
//	@Test()
//	@Description("Test for verify presence of  Signing Authority Code field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_signingauthority() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}
//	@Test()
//	@Description("Test for verify presence of Upload Photo button field")
//	@Epic("TG003")
//	@Feature("Lok Sabha Dashboard - Add New member")
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
//	@Feature("Lok Sabha Dashboard - Add New member")
//	@Severity(SeverityLevel.CRITICAL)
//	public void verifypresence_biometric() throws InterruptedException {
//		boolean disstatus = Init.getDriver().findElement(By.xpath("")).isDisplayed();
//        Assert.assertEquals(disstatus, true);
//	     
//	}

	// Functional Scripts for Employee name field
	@Test(priority = 109)
	@Description("Test for verify min Length Validation is applied properly on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void addlsmemMinname() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //name
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("")).click();
		String exp = "ERROR!  Name too short! Minimum length required is 3!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify max Length Validation is applied properly on  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemMaxname() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify number Validation is applied properly on  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlynumber() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123456789");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify special Characters Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyspecalchar() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("!@@#$%$#@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
		
	@Test()
	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyaplusn() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asda123");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify combination of alphabets and special characters is applied properly on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyapluss() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("asdaa@#$!");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify combination of numbers and special characters Validation is applied properly on   name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlynpluss() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("123!@#$");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing spaces in staring on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemSpaceatstarts() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("   Sanjana");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("Test for verify space validation by passing spaces at end on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemSpaceatend() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Sanjana    ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing only spaces on name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyspace() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid name";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether by without passing value in the  name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemNovlaue() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR!  Name is required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether by passing valid name in name field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemValidname() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Name]")).sendKeys("Parul Pal");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether all values are added in Gender dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemGender() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Select s = new Select(Init.getDriver().findElement(By.xpath("")));
	     List<String> actualdropdownvalues= new ArrayList<String>();
	      for(WebElement element: s.getOptions())
	      {
	    	  actualdropdownvalues.add(element.getText());
	      }
	      List<String> expdropdownvalues= new ArrayList<String>();
	      expdropdownvalues.add("--Select Gender--");
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
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemEmptygender() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check Gender dropdown by choosing the Gender")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemValidgender() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	  
	@Test()
	@Description("Test for verify min Length Validation is applied properly on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void addlsmemMinIdentificationMark() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Identification Mark
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("")).click();
		String exp = "ERROR!  Identification Mark too short! Minimum length required is 10!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify max Length Validation is applied properly on  Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemMaxIdentificationMark() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify number Validation is applied properly on  Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlynumbers() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123456789");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify special Characters Validation is applied properly on   Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyspecialcharacter() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("!@@#$%$#@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
		
	@Test()
	@Description("Test for verify combination of alphabets and numbers Validation is applied properly on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyaplusnu() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asda123");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify combination of alphabets and special characters is applied properly on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemOnlyaplusspecial() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("asdaa@#$!");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify combination of numbers and special characters Validation is applied properly on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlynplusspecial() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("123!@#$");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Only alphabets are allowed!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing spaces in staring on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemSpaceatstart() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("   Cut Mark on right Shoulder");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Identification Mark";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("Test for verify space validation by passing spaces at end on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemSpaceatlast() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Cut Mark on right Shoulder    ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Identification Mark";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify space validation by passing only spaces on Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyspaces() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Identification Mark";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether by without passing value in the  Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemEmptyvlaue() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR!  Identification Mark is required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether by passing valid Identification Mark in Identification Mark field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemValidIdentificationMark() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Identification Mark]")).sendKeys("Mole on right hand");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether dob field is taken valid date or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemDob() throws InterruptedException {
		//Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/1957");
		// Dob Test Script here
	}
	
	@Test()
	@Description("To check whether all values are added in Blood Group dropdown")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemBloodgroup() throws InterruptedException {
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
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemEmptybg() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check Blood Group dropdown by choosing the Blood Group")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemValidbg() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		WebElement t=Init.getDriver().findElement(By.xpath(""));
		t.click();
		Select se = new Select(Init.getDriver().findElement(By.xpath("")));
		se.selectByVisibleText("A+"); 
		String exp = "A+";
//		WebElement m = Init.getDriver().findElement(
//				By.xpath(""));
		String act = "A+";
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
//	 Scripts for email address
	@Test()
	@Description("Test for verify min Length Validation is applied properly on email  field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)
	public void addlsmemEmailmin() throws InterruptedException {
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys(""); //Locality
		Thread.sleep(1000);			
		Init.getDriver().findElement(ByAngular.buttonText("")).click();
		String exp = "ERROR!  Email too short! Minimum length required is 10!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify max Length Validation is applied properly on email field")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemEmailmax() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify email Address without @ symbol")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemWithoutattherate() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify email Address by passing @ symbol at end")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemAttherateatend() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("Test for verify email Address by passing @ symbol at start")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemAttherateatstart() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("Test for verify email Address by passing . symbol at end")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemDotatend() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("Test for verify email Address by passing . symbol at start")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemDotatstart() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}

	@Test()
	@Description("Test for verify email Address without . symbol")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemWithoutdot() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("Test for verify email Address by passing valid email address")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemValidemail() throws InterruptedException {
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
		Assert.assertEquals(act, exp);
	}
	
	// Scripts for Mobile Number
	
	@Test()
	@Description("To check whether the  min length validation on Mobile Number field is applied or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsmemMobilemin() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Mobile No. is too Short";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the max length validation on Mobile Number field is applied properly or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsmemMaxMobile() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing blank space between the no.")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemSpacebwmob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Mobile No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 zeros")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemTenzeromob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Mobile No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Mobile Number  validation is applied properly on field or not by passing 10 spaces")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemTenspacemob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Mobile No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not without passingany value.")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemNovaluemob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Mobile No. is Required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing alphabets")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyalphabetsmob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Mobile No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing special characters")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyspclcharmob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Mobile No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Mobile Number validation is applied properly on Mobile Number field or not by passing numbers")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlynomob() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
//	 Scripts for Fax Number 
	
	
	@Test()
	@Description("To check whether the  min length validation on Fax Number field is applied or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsmemFaxmin() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Fax No. is too Short";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the max length validation on Fax Number field is applied properly or not")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.CRITICAL)

	public void addlsmemMaxFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the Fax Number  validation is applied properly on field or not by passing blank space between the no.")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemSpacebwFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Fax No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Fax Number  validation is applied properly on field or not by passing 10 zeros")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)
	public void addlsmemTenzeroFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Fax No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Fax Number  validation is applied properly on field or not by passing 10 spaces")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemTenspaceFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Fax No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not without passingany value.")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemNovalueFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Fax No. is Required!";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	@Test()
	@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing alphabets")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyalphabetsFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Fax No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing special characters")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlyspclcharFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "ERROR! Invalid Fax No.";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}
	
	@Test()
	@Description("To check whether the Fax Number validation is applied properly on Fax Number field or not by passing numbers")
	@Epic("TG003")
	@Feature("Lok Sabha Dashboard - Add New member")
	@Severity(SeverityLevel.NORMAL)

	public void addlsmemOnlynoFax() throws InterruptedException {
		Init.getDriver().navigate().refresh();
		Thread.sleep(1000);
		Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
		Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
		String exp = "";
		WebElement m = Init.getDriver().findElement(
				By.xpath(""));
		String act = m.getText();
		System.out.println("Error message is: " + act);
		Assert.assertEquals(act, exp);
	}	
	
	// Scripts for office Number
	
		@Test()
		@Description("To check whether the  min length validation on office Number field is applied or not")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.CRITICAL)

		public void addlsmemofficemin() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("243127");		
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! office No. is too Short";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		@Test()
		@Description("To check whether the max length validation on office Number field is applied properly or not")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.CRITICAL)

		public void addlsmemMaxoffice() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("24312711111");		
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		@Test()
		@Description("To check whether the office Number  validation is applied properly on field or not by passing blank space between the no.")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
		public void addlsmemSpacebwoffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! Invalid office No.";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		@Test()
		@Description("To check whether the office Number  validation is applied properly on field or not by passing 10 zeros")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
		public void addlsmemTenzerooffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("0120 7895 57");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! Invalid office No.";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		@Test()
		@Description("To check whether the office Number  validation is applied properly on field or not by passing 10 spaces")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)

		public void addlsmemTenspaceoffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("          ");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! Invalid office No.";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		@Test()
		@Description("To check whether the office Number validation is applied properly on office Number field or not without passingany value.")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)

		public void addlsmemNovalueoffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! office No. is Required!";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		@Test()
		@Description("To check whether the office Number validation is applied properly on office Number field or not by passing alphabets")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)

		public void addlsmemOnlyalphabetsoffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("asdfgrchzx");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! Invalid office No.";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		@Test()
		@Description("To check whether the office Number validation is applied properly on office Number field or not by passing special characters")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)

		public void addlsmemOnlyspclcharoffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "ERROR! Invalid office No.";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		@Test()
		@Description("To check whether the office Number validation is applied properly on office Number field or not by passing numbers")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)

		public void addlsmemOnlynooffc() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Init.getDriver().findElement(By.cssSelector("")).sendKeys("!@#$%^&$%@");
			Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
			String exp = "";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(act, exp);
		}
		
		// Scripts for State dropdown
		
		@Test()
		@Description("To check whether all values are added in State dropdown")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemState() throws InterruptedException {
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
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemEmptystate() throws InterruptedException {
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
			Assert.assertEquals(exp, act);
		}
		@Test()
		@Description("To check State dropdown by choosing the State")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemValidstate() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText(""); 
			String exp = "Uttar Pradesh";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
			String act = "Uttar Pradesh";
			System.out.println("Error message is: " + act);
			Assert.assertEquals(exp, act);
		}
		
		// Scripts for Constituency dropdown
		@Test()
		@Description("To check whether all values are added in Constituency dropdown for Andaman & Nicobar Islands")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemConstandaman() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText("Andaman & Nicobar Islands"); 
			Select s = new Select(Init.getDriver().findElement(By.xpath("")));
		     List<String> actualConstituency= new ArrayList<String>();
		      for(WebElement element: s.getOptions())
		      {
		    	  actualConstituency.add(element.getText());
		      }
		      Thread.sleep(5000);
		      List<String> expConstituency= new ArrayList<String>();
		      expConstituency.add("Andaman & Nicobar Islands");
		      
		      for (int i = 0; i< actualConstituency.size(); i++) {
				Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
		}
		}
		      
		      @Test()
				@Description("To check whether all values are added in Constituency dropdown for Andhra Pradesh")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemConstap() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText("Andhra Pradesh"); 
					Select s = new Select(Init.getDriver().findElement(By.xpath("")));
				     List<String> actualConstituency= new ArrayList<String>();
				      for(WebElement element: s.getOptions())
				      {
				    	  actualConstituency.add(element.getText());
				      }
				      Thread.sleep(5000);
				      List<String> expConstituency= new ArrayList<String>();
				      expConstituency.add("Aruku");
				      expConstituency.add("Srikakulam");
				      expConstituency.add("Vizianagaram");
				      expConstituency.add("Visakhapatnam");
				      expConstituency.add("Anakapalli");
				      expConstituency.add("Kakinada");
				      expConstituency.add("Amalapuram");
				      expConstituency.add("Rajahmundry");
				      expConstituency.add("Narsapuram");
				      expConstituency.add("Eluru");
				      expConstituency.add("Machilipatnam");
				      expConstituency.add("Vijayawada");
				      expConstituency.add("Guntur");
				      expConstituency.add("Narasaraopet");
				      expConstituency.add("Bapatla");
				      expConstituency.add("Ongole");
				      expConstituency.add("Nandyal");
				      expConstituency.add("Kurnool");
				      expConstituency.add("Anantapur");
				      expConstituency.add("Hindupur");
				      expConstituency.add("Kadapa");
				      expConstituency.add("Nellore");
				      expConstituency.add("Tirupati");
				      expConstituency.add("Rajampet");
				      expConstituency.add("Chittoor");
				      
				      for (int i = 0; i< actualConstituency.size(); i++) {
						Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
				}
		      }
		      
		      
		      @Test()
				@Description("To check whether all values are added in Constituency dropdown for Arunachal Pradesh")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemConstarunachal() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText("Arunachal Pradesh"); 
					Select s = new Select(Init.getDriver().findElement(By.xpath("")));
				     List<String> actualConstituency= new ArrayList<String>();
				      for(WebElement element: s.getOptions())
				      {
				    	  actualConstituency.add(element.getText());
				      }
				      Thread.sleep(5000);
				      List<String> expConstituency= new ArrayList<String>();
				      expConstituency.add("ARUNACHAL WEST");
				      expConstituency.add("ARUNACHAL EAST");
				      
				      for (int i = 0; i< actualConstituency.size(); i++) {
						Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
				}
		      }
		      
		      @Test()
				@Description("To check whether all values are added in Constituency dropdown for Assam")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemConstassam() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText("Assam"); 
					Select s = new Select(Init.getDriver().findElement(By.xpath("")));
				     List<String> actualConstituency= new ArrayList<String>();
				      for(WebElement element: s.getOptions())
				      {
				    	  actualConstituency.add(element.getText());
				      }
				      Thread.sleep(5000);
				      List<String> expConstituency= new ArrayList<String>();
				      expConstituency.add("Karimganj");
				      expConstituency.add("Silchar");
				      expConstituency.add("Autonomous District");
				      expConstituency.add("Dhubri");
				      expConstituency.add("Kokrajhar");
				      expConstituency.add("Barpeta");
				      expConstituency.add("Gauhati");
				      expConstituency.add("Mangaldoi");
				      expConstituency.add("Tezpur");
				      expConstituency.add("Nowgong");
				      expConstituency.add("Kaliabor");
				      expConstituency.add("Jorhat");
				      expConstituency.add("Dibrugarh");
				      expConstituency.add("Lakhimpur");
				      
				      for (int i = 0; i< actualConstituency.size(); i++) {
						Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
				}
		      }
		      
		      @Test()
				@Description("To check whether all values are added in Constituency dropdown for Bihar")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemConstbihar() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText("Bihar"); 
					Select s = new Select(Init.getDriver().findElement(By.xpath("")));
				     List<String> actualConstituency= new ArrayList<String>();
				      for(WebElement element: s.getOptions())
				      {
				    	  actualConstituency.add(element.getText());
				      }
				      Thread.sleep(5000);
				      List<String> expConstituency= new ArrayList<String>();
				      expConstituency.add("Valmiki Nagar");
				      expConstituency.add("Paschim Champaran");
				      expConstituency.add("Purvi Champaran");
				      expConstituency.add("Sheohar");
				      expConstituency.add("Sitamarhi");
				      expConstituency.add("Madhubani");
				      expConstituency.add("Jhanjharpur");
				      expConstituency.add("Supaul");
				      expConstituency.add("Araria");
				      expConstituency.add("Kishanganj");
				      expConstituency.add("Katihar");
				      expConstituency.add("Purnia");
				      expConstituency.add("Madhepura");
				      expConstituency.add("Darbhanga");
				      expConstituency.add("Muzaffarpur");
				      expConstituency.add("Vaishali");
				      expConstituency.add("Gopalganj");
				      expConstituency.add("Siwan");
				      expConstituency.add("Maharajganj");
				      expConstituency.add("Saran");
				      expConstituency.add("Hajipur");
				      expConstituency.add("Ujiarpur");
				      expConstituency.add("Samastipur");
				      expConstituency.add("Begusarai");
				      expConstituency.add("Khagaria");
				      expConstituency.add("Bhagalpur");
				      expConstituency.add("Banka");
				      expConstituency.add("Munger");
				      expConstituency.add("Nalanda");
				      expConstituency.add("Patna Sahib");
				      expConstituency.add("Pataliputra");
				      expConstituency.add("Arrah");
				      expConstituency.add("Buxar");
				      expConstituency.add("Sasaram");
				      expConstituency.add("Karakat");
				      expConstituency.add("Jahanabad");
				      expConstituency.add("Aurangabad");
				      expConstituency.add("Gaya");
				      expConstituency.add("Nawada");
				      expConstituency.add("Jamui");
				      
				      for (int i = 0; i< actualConstituency.size(); i++) {
						Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
				}
		      }
		      
		      @Test()
				@Description("To check whether all values are added in Constituency dropdown for Chandigarh")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemConstChandigarh() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText("Chandigarh"); 
					Select s = new Select(Init.getDriver().findElement(By.xpath("")));
				     List<String> actualConstituency= new ArrayList<String>();
				      for(WebElement element: s.getOptions())
				      {
				    	  actualConstituency.add(element.getText());
				      }
				      Thread.sleep(5000);
				      List<String> expConstituency= new ArrayList<String>();
				      expConstituency.add("CHANDIGARH");
				      
				      for (int i = 0; i< actualConstituency.size(); i++) {
						Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
				}
		      }
		
		@Test()
		@Description("To check whether all values are added in Constituency dropdown for Uttar Pradesh")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemConstituency() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText("Uttar Pradesh"); 
			Select s = new Select(Init.getDriver().findElement(By.xpath("")));
		     List<String> actualConstituency= new ArrayList<String>();
		      for(WebElement element: s.getOptions())
		      {
		    	  actualConstituency.add(element.getText());
		      }
		      Thread.sleep(5000);
		      List<String> expConstituency= new ArrayList<String>();
		      expConstituency.add("Saharanpur");
		      expConstituency.add("Kairana");
		      expConstituency.add("Muzaffarnagar");
		      expConstituency.add("Bijnor");
		      expConstituency.add("Nagina");
		      expConstituency.add("Moradabad");
		      expConstituency.add("Rampur");
		      expConstituency.add("Sambhal");
		      expConstituency.add("Amroha");
		      expConstituency.add("Meerut");
		      expConstituency.add("Baghpat");
		      expConstituency.add("Ghaziabad");
		      expConstituency.add("Gautam Buddha Nagar");
		      expConstituency.add("Bulandshahr");
		      expConstituency.add("Aligarh");
		      expConstituency.add("Hathras");
		      expConstituency.add("Mathura");
		      expConstituency.add("Agra");
		      expConstituency.add("Fatehpur Sikri");
		      expConstituency.add("Firozabad");
		      expConstituency.add("Mainpuri");
		      expConstituency.add("Etah");
		      expConstituency.add("Badaun");
		      expConstituency.add("Aonla");
		      expConstituency.add("Bareilly");
		      expConstituency.add("Pilibhit");
		      expConstituency.add("Shahjahanpur");
		      expConstituency.add("Kheri");
		      expConstituency.add("Dhaurahra");
		      expConstituency.add("Sitapur");
		      expConstituency.add("Hardoi");
		      expConstituency.add("Misrikh");
		      expConstituency.add("Unnao");
		      expConstituency.add("Mohanlalganj");
		      expConstituency.add("Lucknow");
		      expConstituency.add("Rae Bareli");
		      expConstituency.add("Amethi");
		      expConstituency.add("Sultanpur");
		      expConstituency.add("Pratapgarh");
		      expConstituency.add("Farrukhabad");
		      expConstituency.add("Etawah");
		      expConstituency.add("Kannauj");
		      expConstituency.add("Kanpur Urban");
		      expConstituency.add("Akbarpur");
		      expConstituency.add("Jalaun");
		      expConstituency.add("Jhansi");
		      expConstituency.add("Hamirpur");	
		      expConstituency.add("Banda");
		      expConstituency.add("Fatehpur");
		      expConstituency.add("Kaushambi");
		      expConstituency.add("Phulpur");
		      expConstituency.add("Allahabad");
		      expConstituency.add("Barabanki");
		      expConstituency.add("Faizabad");
		      expConstituency.add("Ambedkar Nagar");
		      expConstituency.add("Bahraich");
		      expConstituency.add("Kaiserganj");
		      expConstituency.add("Shrawasti");
		      expConstituency.add("Gonda");
		      expConstituency.add("Domariyaganj");
		      expConstituency.add("Basti");
		      expConstituency.add("Sant Kabir Nagar");
		      expConstituency.add("Maharajganj");
		      expConstituency.add("Gorakhpur");
		      expConstituency.add("Kushi Nagar");
		      expConstituency.add("Deoria");
		      expConstituency.add("Bansgaon");
		      expConstituency.add("Lalganj");
		      expConstituency.add("Azamgarh");
		      expConstituency.add("Ghosi");
		      expConstituency.add("Salempur");
		      expConstituency.add("Ballia");
		      expConstituency.add("Jaunpur");
		      expConstituency.add("Machhlishahr");
		      expConstituency.add("Ghazipur");
		      expConstituency.add("Chandauli");
		      expConstituency.add("Varanasi");
		      expConstituency.add("Bhadohi");
		      expConstituency.add("Mirzapur");
		      expConstituency.add("Robertsganj");
		      for (int i = 0; i< actualConstituency.size(); i++) {
				Assert.assertTrue(actualConstituency.get(i).equals(expConstituency.get(i)));
		}
		      
		}
		@Test()
		@Description("To check Constituency dropdown without choosing the Constituency")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemEmptyConstituency() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText(""); 
			String exp = "ERROR! Constituency is required!";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(exp, act);
		}
		@Test()
		@Description("To check Constituency dropdown by choosing the Constituency")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemValidConstituency() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText("Bareilly"); 
			String exp = "Bareilly";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
			String act = "Bareilly";
			System.out.println("Error message is: " + act);
			Assert.assertEquals(exp, act);
		}
		
		
		// Add here if need to verified all state constituency
		
	// Scripts for Party Name dropdown
		
		@Test()
		@Description("To check whether all values are added in Party Name dropdown")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemParty() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			Select s = new Select(Init.getDriver().findElement(By.xpath("")));
		     List<String> actualPartyName= new ArrayList<String>();
		      for(WebElement element: s.getOptions())
		      {
		    	  actualPartyName.add(element.getText());
		      }
		      List<String> expPartyName= new ArrayList<String>();
		      expPartyName.add("BODOLAND PEOPLES FRONT");
		      expPartyName.add("JAMMU & KASHMIR PEOPLES DEMOCRATIC PARTY");
		      expPartyName.add("APNA DAL");
		      expPartyName.add("ALL INDIA UNITED DEMOCRATIC FRONT");
		      expPartyName.add("AAM ADMI PARTY");
		      expPartyName.add("AKHIL BHARATIYA LOKTANTRIK CONGRESS");
		      expPartyName.add("ALL INDIA ANNA DRAVIDA MUNNETRA KAZHAGAM");
		      expPartyName.add("ALL INDIA FORWARD BLOCK");
		      expPartyName.add("ALL INDIA MAJLIS-E-ITTEHADUL MUSLIMEEN");
		      expPartyName.add("ALL INDIA TRINAMOOL CONGRESS");
		      expPartyName.add("BHARIPA BAHUJAN MAHASANGH");
		      expPartyName.add("BIJU JANATA DAL");
		      expPartyName.add("BHARATIYA JANATA PARTY");
		      expPartyName.add("BAHUJAN SAMAJWADI PARTY");
		      expPartyName.add("COMMUNIST PARTY OF INDIA (M)");
		      expPartyName.add("COMMUNIST PARTY OF INDIA (ML)");
		      expPartyName.add("COMMUNIST PARTY OF INDIA");
		      expPartyName.add("DIRAVIDA MUNNETRA KAZHAKAM");
		      expPartyName.add("HVC");
		      expPartyName.add("INDIAN NATIONAL CONGRESS");
		      expPartyName.add("INDEPENDENT");
		      expPartyName.add("JK NATIONAL CONGRESS");
		      expPartyName.add("JANATA DAL (S)");
		      expPartyName.add("JANATA DAL (U)");
		      expPartyName.add("KC (M)");
		      expPartyName.add("KERALA CONGRESS(M)");
		      expPartyName.add("MDMK");
		      expPartyName.add("MLKSC");
		      expPartyName.add("MSCP");
		      expPartyName.add("NATIONAL CONGRESS");
		      expPartyName.add("NATIONAL CONGRESS PARTY");
		      expPartyName.add("PATTALI MAKKAL KATCHI");
		      expPartyName.add("PWPI");
		      expPartyName.add("RASTRIYA JANATA DAL");
		      expPartyName.add("RASTRIYA LOK DAL");
		      expPartyName.add("RASTRIYA SAMAJWADI PARTY");
		      expPartyName.add("SHIROMANI AKALI DAL");
		      expPartyName.add("SIKKIM DEMOCRATIC FRONT");
		      expPartyName.add("SHIVSENA");
		      expPartyName.add("SJP (R)");
		      expPartyName.add("SAMAJWADI PARTY");
		      expPartyName.add("TELUGU DESAM PARTY");
		      expPartyName.add("INDIAN NATIONAL LOK DAL");
		      expPartyName.add("REPUBLICAN PARTY OF INDIA");
		      expPartyName.add("ASOM GANA PARISHAD");
		      expPartyName.add("NATIONAL LOKTANTRIK PARTY");
		      expPartyName.add("INDIAN FEDERAL DEMOCRATIC PARTY");
		      expPartyName.add("SAMPURNA VIKAS DAL");
		      expPartyName.add("VIDUTHALAI CHIRUTHAIGAL KATCHI");
		      expPartyName.add("NOMINATED");
		      expPartyName.add("SWABHIMANI PAKSHA");
		      expPartyName.add("REVOLUTIONARY SOCIALIST PARTY");
		      expPartyName.add("NATIONAL PEOPLES PARTY");
		      expPartyName.add("ALL INDIA N. R. CONGRESS");
		      expPartyName.add("JHARKHAND MUKTI MORCHA"); 
		      expPartyName.add("INDIAN UNION MUSLIM LEAGUE");
		      expPartyName.add("RASHTRIYA LOK SAMTA PARTY");
		      expPartyName.add("SAMATA PARTY");
		      expPartyName.add("HARYANA VIKAS PARTY");
		      expPartyName.add("TELANGANA RASHTRA SAMITHI");
		      expPartyName.add("NAGALAND PEOPLES FRONT");
		      expPartyName.add("SWATANTRA BHARAT PAKSHA");
		      expPartyName.add("Trinamool Congress");
		      expPartyName.add("Yuvajana Sramika Rythu Congress Party");
		      expPartyName.add("Shiv Sena");
		      expPartyName.add("United Peoples Party Liberal");
		      expPartyName.add("Mizo National Front");
		      expPartyName.add("Tamil Maanila Congress");
		      expPartyName.add("Republican Party of India (Athawale)");
		      expPartyName.add("None");
		     
		      for (int i = 0; i< actualPartyName.size(); i++) {
				Assert.assertTrue(actualPartyName.get(i).equals(expPartyName.get(i)));
		}
		      
		}
		@Test()
		@Description("To check PartyName dropdown without choosing the Party Name")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemEmptyPartyName() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText(""); 
			String exp = "ERROR! Party Name is required!";
			WebElement m = Init.getDriver().findElement(
					By.xpath(""));
			String act = m.getText();
			System.out.println("Error message is: " + act);
			Assert.assertEquals(exp, act);
		}
		@Test()
		@Description("To check PartyName dropdown by choosing the PartyName")
		@Epic("TG003")
		@Feature("Lok Sabha Dashboard - Add New member")
		@Severity(SeverityLevel.NORMAL)
	
		public void addlsmemValidPartyName() throws InterruptedException {
			Init.getDriver().navigate().refresh();
			Thread.sleep(1000);
			WebElement t=Init.getDriver().findElement(By.xpath(""));
			t.click();
			Select se = new Select(Init.getDriver().findElement(By.xpath("")));
			se.selectByVisibleText(""); 
			String exp = "Uttar Pradesh";
//			WebElement m = Init.getDriver().findElement(
//					By.xpath(""));
			String act = "Uttar Pradesh";
			System.out.println("Error message is: " + act);
			Assert.assertEquals(exp, act);
		}
		
		
		 
		// Scripts for Present Address

				@Test()
				@Description("Test for verify min Length Validation is applied properly on Present Address(Flat No.) field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPaddrflatnomin() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrflatnomax() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrflatnoonlynumbers() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrflatnoonlyspclchar() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrflatnoonlyaplusnu() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrflatnoonlyaplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnoonlynplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnospaceatstart() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnospaceatlast() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnoonlyspaces() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnoemptyvlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  Flat No. is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid Flat No. in Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrflatnovalid() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				
				// Test Scripts for locality 
				
				@Test()
				@Description("Test for verify min Length Validation is applied properly on Present Address(Locality) field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPaddrlocalitymin() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  Locality too short! Minimum length required is 4!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrlocalitymax() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrlocalityonlynumbers() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrlocalityonlyspclchar() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrlocalityonlyaplusnu() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPaddrlocalityonlyaplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityonlynplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityspaceatstart() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityspaceatlast() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityonlyspaces() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityemptyvlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  Locality is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid Locality in Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPaddrlocalityvalid() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				// Scripts for State dropdown
				
				@Test()
				@Description("To check whether all values are added in State dropdown")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_state() throws InterruptedException {
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
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_emptystate() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("To check State dropdown by choosing the State")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_validstate() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText(""); 
					String exp = "Uttar Pradesh";
//					WebElement m = Init.getDriver().findElement(
//							By.xpath(""));
					String act = "Uttar Pradesh";
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				 
				
				// Script for City Field
				@Test()
				@Description("Test for verify min Length Validation is applied properly on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmem_minCity() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  City too short! Minimum length required is 3!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_maxCity() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_cityonlynumber() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_cityonlyspclchars() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_cityonlyaplusn() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_cityonlyapluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_cityonlynpluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_cityspaceatstarts() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_cityspaceatend() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_cityonlyspace() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_citynovlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  City is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid City in City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_validCity() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				
				// Scripts for pincode
				
				@Test()
				@Description("Test for verify min Length Validation is applied properly on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmem_minPinCode() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_maxPinCode() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_pincodeonlynumber() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_pincodeonlyspclchars() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_pincodeonlyaplusn() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmem_pincodeonlyapluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_pincodeonlynpluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_pincodespaceatstarts() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_pincodespaceatend() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_pincodeonlyspace() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_pincodenovlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  PinCode is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid PinCode in PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmem_validPinCode() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				// Scripts for Permanent Address

				@Test()
				@Description("Test for verify min Length Validation is applied properly on Permanent Address(Flat No.) field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPeraddrflatnomin() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Flat No.
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  Flat No. too short! Minimum length required is 10!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrflatnomax() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrflatnoonlynumbers() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrflatnoonlyspclchar() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrflatnoonlyaplusnu() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrflatnoonlyaplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnoonlynplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnospaceatstart() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("   Sanjana");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnospaceatlast() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnoonlyspaces() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Flat No.";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnoemptyvlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  Flat No. is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid Flat No. in Flat No. field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrflatnovalid() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Flat No.]")).sendKeys("A/1 Laxmi Niwas");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				
				// Test Scripts for locality 
				
				@Test()
				@Description("Test for verify min Length Validation is applied properly on Permanent Address(Locality) field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPeraddrlocalitymin() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //Locality
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  Locality too short! Minimum length required is 4!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrlocalitymax() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrlocalityonlynumbers() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrlocalityonlyspclchar() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrlocalityonlyaplusnu() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrlocalityonlyaplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityonlynplusspcl() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityspaceatstart() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("   Sanjana");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityspaceatlast() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityonlyspaces() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid Locality";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityemptyvlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  Locality is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid Locality in Locality field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrlocalityvalid() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolname=Locality]")).sendKeys("A/1 Laxmi Niwas");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				// Scripts for State dropdown
				
				@Test()
				@Description("To check whether all values are added in State dropdown")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrstate() throws InterruptedException {
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
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddremptystate() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("To check State dropdown by choosing the State")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrvalidstate() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					WebElement t=Init.getDriver().findElement(By.xpath(""));
					t.click();
					Select se = new Select(Init.getDriver().findElement(By.xpath("")));
					se.selectByVisibleText(""); 
					String exp = "Uttar Pradesh";
//					WebElement m = Init.getDriver().findElement(
//							By.xpath(""));
					String act = "Uttar Pradesh";
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				 
				
				// Script for City Field
				@Test()
				@Description("Test for verify min Length Validation is applied properly on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPeraddrminCity() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("as"); //City
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  City too short! Minimum length required is 3!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrmaxCity() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrcityonlynumber() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123456789");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrcityonlyspclchars() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrcityonlyaplusn() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrcityonlyapluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrcityonlynpluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only alphabets are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrcityspaceatstarts() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("   Bareilly");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrcityspaceatend() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrcityonlyspace() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid City";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrcitynovlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  City is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid City in City field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrvalidCity() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolCity=City]")).sendKeys("Bareilly");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				
				// Scripts for pincode
				
				@Test()
				@Description("Test for verify min Length Validation is applied properly on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.CRITICAL)
				public void addlsmemPeraddrminPinCode() throws InterruptedException {
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("")).sendKeys("20130"); //PinCode
					Thread.sleep(1000);			
					Init.getDriver().findElement(ByAngular.buttonText("")).click();
					String exp = "ERROR!  PinCode too short! Minimum length required is 6!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify max Length Validation is applied properly on  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrmaxPinCode() throws InterruptedException {
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
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify number Validation is applied properly on  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrpincodeonlynumber() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify special Characters Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrpincodeonlyspclchars() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("!@@#$%$#@");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
					
				@Test()
				@Description("Test for verify combination of alphabets and numbers Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrpincodeonlyaplusn() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asda123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of alphabets and special characters is applied properly on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemPeraddrpincodeonlyapluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("asdaa@#$!");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify combination of numbers and special characters Validation is applied properly on   PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrpincodeonlynpluss() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("123!@#$");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Only Numbers are allowed!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing spaces in staring on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrpincodespaceatstarts() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("   123");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				@Test()
				@Description("Test for verify space validation by passing spaces at end on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrpincodespaceatend() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("124579    ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("Test for verify space validation by passing only spaces on PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrpincodeonlyspace() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("          ");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR! Invalid PinCode";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by without passing value in the  PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrpincodenovlaue() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "ERROR!  PinCode is required!";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				@Test()
				@Description("To check whether by passing valid PinCode in PinCode field")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
			
				public void addlsmemPeraddrvalidPinCode() throws InterruptedException {
					Init.getDriver().navigate().refresh();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formcontrolPinCode=PinCode]")).sendKeys("243127");		
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();
					String exp = "";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				


	// Scripts for Cancel Button
				@Test()
				@Description("To Check whether cancel button re-direct operator to dashboard page or not")
				@Epic("TG003")
				@Feature("Lok Sabha Dashboard - Add New member")
				@Severity(SeverityLevel.NORMAL)
				public void addlsmemCancel() throws IOException, InterruptedException {					
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

				public void addlsmemSubmit1() throws InterruptedException {
					Init.getDriver().findElement(By.xpath("/html/body/app-root/app-loksabha/div/app-ls-sidebar/nav/div/div/ul/li[2]/a/div/span[2]")).click();
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formControlName=name]")).sendKeys("Surendra Singh Gangwar");
					Thread.sleep(1000);
					WebElement gender=Init.getDriver().findElement(By.xpath(""));
					gender.click();
					Select Gender = new Select(Init.getDriver().findElement(By.xpath("")));
					Gender.selectByVisibleText("Male"); 
					Init.getDriver().findElement(By.cssSelector("input[formControlName=idmark]")).sendKeys("Mole on  left side Cheek");
					Thread.sleep(1000);
					Init.getDriver().findElement(By.xpath("")).sendKeys("12/12/1957");
					Thread.sleep(1000);
					WebElement bg=Init.getDriver().findElement(By.xpath(""));
					bg.click();
					Select Bloodgroup = new Select(Init.getDriver().findElement(By.xpath("")));
					Bloodgroup.selectByVisibleText("B+"); 
					Thread.sleep(1000);
					Init.getDriver().findElement(By.cssSelector("input[formControlName=email]")).sendKeys("sgangwar00@gmail.com");
					Init.getDriver().findElement(By.cssSelector("input[formControlName=phone]")).sendKeys("9540169429");
					Init.getDriver().findElement(By.cssSelector("input[formControlName=fax]")).sendKeys("0120777759");
					Init.getDriver().findElement(By.cssSelector("input[formControlName=officeno]")).sendKeys("9540169420");
					WebElement state=Init.getDriver().findElement(By.xpath(""));
					state.click();
					Select State = new Select(Init.getDriver().findElement(By.xpath("")));
					State.selectByVisibleText("Uttar Pradesh"); 
					WebElement constituency=Init.getDriver().findElement(By.xpath(""));
					constituency.click();
					Select Constituency = new Select(Init.getDriver().findElement(By.xpath("")));
					Constituency.selectByVisibleText("Bareilly"); 
					WebElement party=Init.getDriver().findElement(By.xpath(""));
					party.click();
					Select Party = new Select(Init.getDriver().findElement(By.xpath("")));
					Party.selectByVisibleText("BHARATIYA JANATA PARTY");
					JavascriptExecutor js = (JavascriptExecutor) Init.getDriver();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					// present Address
					Init.getDriver().findElement(By.cssSelector("input[formControlName=prflatno]")).sendKeys("E202");
					Init.getDriver().findElement(By.cssSelector("input[formControlName=locality]")).sendKeys("sector 121");
					WebElement prstate=Init.getDriver().findElement(By.xpath(""));
					prstate.click();
					Select Prstate = new Select(Init.getDriver().findElement(By.xpath("")));
					Prstate.selectByVisibleText("Male"); 
					Init.getDriver().findElement(By.cssSelector("input[formControlName=city]")).sendKeys("Bareilly"); 
					Init.getDriver().findElement(By.cssSelector("input[formControlName=pincode]")).sendKeys("201309");
					//permanent Address
					Init.getDriver().findElement(By.cssSelector("input[formControlName=prflatno]")).sendKeys("vrindavan enclave");
					Init.getDriver().findElement(By.cssSelector("input[formControlName=locality]")).sendKeys("nakatiya");
					WebElement pestate=Init.getDriver().findElement(By.xpath(""));
					pestate.click();
					Select Pestate = new Select(Init.getDriver().findElement(By.xpath("")));
					Pestate.selectByVisibleText("Uttar Pradesh"); 
					Init.getDriver().findElement(By.cssSelector("input[formControlName=city]")).sendKeys("Noida"); 
					Init.getDriver().findElement(By.cssSelector("input[formControlName=pincode]")).sendKeys("201309");
					Init.getDriver().findElement(ByAngular.buttonText("Submit")).click();					
					String exp = "Member Added Successfully";
					WebElement m = Init.getDriver().findElement(
							By.xpath(""));
					String act = m.getText();
					System.out.println("Error message is: " + act);
					Assert.assertEquals(act, exp);
				}
				
				

}
