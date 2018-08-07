package library;

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


public class MenuNavigator {

	private String getMenuID(String menuName) {

		String menuId = null;
		Thread.sleep(5000);
		switch (menuName) {
			case "Plus":
				menuId = "ef_menu_button_add";
				break;

			case "NewEvent":
				menuId = "ef_menu_li_NEWEVENT";
				break;

			case "DuplicateEvent":
				menuId = "ef_menu_li_COPYEVENT";
				break;

			case "AdminRegistration":
				menuId = "ef_menu_li_NEWBOOK";
				break;

			case "AdminAdHocEmail":
				menuId = "ef_menu_li_NEWEMAIL";
				break;

			case "Preview":
				menuId = "ef_menu_li_TESTEV";
				break;

			case "Dashboard":
				menuId = "ef_menu_li_HOME";
				break;

			case "Properties":
				menuId = "ef_menu_li_EVPROP";
				break;

			case "Capacity":
				menuId = "ef_menu_li_CAPA";
				break;

			case "Registration":
				menuId = "ef_menu_li_BOOKOPT";
				break;

			case "AttendeeCategories":
				menuId = "ef_menu_li_ATTCAT";
				break;

			case "SessionDetails":
				menuId = "ef_menu_li_SESSDET";
				break;

			case "Presenters":
				menuId = "ef_menu_li_PRES";
				break;

			case "Locations":
				menuId = "ef_menu_li_LOCS";
				break;

			case "SessionTypes":
				menuId = "ef_menu_li_SESSTYP";
				break;

			case "Icons":
				menuId = "ef_menu_li_ICONS";
				break;

			case "SessionSettings":
				menuId = "ef_menu_li_SESSSETT";
				break;

			case "Prices":
				menuId = "ef_menu_li_PRICE";
				break;

			case "Discounts":
				menuId = "ef_menu_li_DISC";
				break;

			case "PaymentMethods":
				menuId = "ef_menu_li_PAYMETH";
				break;

			case "VATCodes":
				menuId = "ef_menu_li_VATCODE";
				break;

			case "FinSettings":
				menuId = "ef_menu_li_FINSETT";
				break;

			case "InvoiceRun":
				menuId = "ef_menu_li_INVRUN";
				break;

			case "Categories":
				menuId = "ef_menu_li_AWCAT";
				break;

			case "Sections":
				menuId = "ef_menu_li_AWSEC";
				break;

			case "AwardTypes":
				menuId = "ef_menu_li_AWAW";
				break;

			case "AwardSettings":
				menuId = "ef_menu_li_AWSETT";
				break;

			case "JudgingSetup":
				menuId = "ef_menu_li_AWJUDGESET";
				break;

			case "JudgingPanel":
				menuId = "ef_menu_li_AWJUDGE";
				break;

			case "Criteria":
				menuId = "ef_menu_li_AWCRIT";
				break;

			case "Entries":
				menuId = "ef_menu_li_AWSUB";
				break;

			case "Submitters":
				menuId = "ef_menu_li_AWSUBDET";
				break;

			case "JudgingOverview":
				menuId = "ef_menu_li_AWJUDOV";
				break;

			case "Judges":
				menuId = "ef_menu_li_AWJUDDET";
				break;

			case "AwardAssignment":
				menuId = "ef_menu_li_AWASS";
				break;

			case "TableList":
				menuId = "ef_menu_li_TABLELIST";
				break;

			case "SeatingArrangement":
				menuId = "ef_menu_li_TABLSEAT";
				break;

			case "TableSettings":
				menuId = "ef_menu_li_TABLSETT";
				break;

			case "Badges":
				menuId = "ef_menu_li_BADLABMEN";
				break;

			case "Topics":
				menuId = "ef_menu_li_ABSTOP";
				break;

			case "ReviewingCriteria":
				menuId = "ef_menu_li_ABSCRIT";
				break;

			case "Reviewers":
				menuId = "ef_menu_li_ABSREV";
				break;

			case "PresentationMethods":
				menuId = "ef_menu_li_SYSABSPRES";
				break;

			case "DefaultMethods":
				menuId = "ef_menu_li_ABSPRESEV";
				break;

			case "AbstractSettings":
				menuId = "ef_menu_li_ABSSETT";
				break;

			case "Submissions":
				menuId = "ef_menu_li_ABSSUB";
				break;

			case "Reviews":
				menuId = "ef_menu_li_ABSRVW";
				break;

			case "WebsiteContent":
				menuId = "ef_menu_li_CONMAN";
				break;

			case "RegistrationPages":
				menuId = "ef_menu_li_REGPAG";
				break;

			case "AdditionalBookingItems":
				menuId = "ef_menu_li_ABIS";
				break;

			case "ExternalPages":
				menuId = "ef_menu_li_EXTWEB";
				break;

			case "SelectTemplate":
				menuId = "ef_menu_li_THEMES";
				break;

			case "Appearance":
				menuId = "ef_menu_li_FONTSCOLORS";
				break;

			case "WebsiteSettings":
				menuId = "ef_menu_li_WEBSETT";
				break;

			case "SEO":
				menuId = "ef_menu_li_SEOEVSETTINGS";
				break;

			case "WebAddresses":
				menuId = "ef_menu_li_WEBADDR";
				break;

			case "Log":
				menuId = "ef_menu_li_MAILLOG";
				break;

			case "Automatic":
				menuId = "ef_menu_li_MAILTEMPL";
				break;

			case "Ad-Hoc":
				menuId = "ef_menu_li_EMAIL";
				break;

			case "Invitations":
				menuId = "ef_menu_li_INVITE";
				break;

			case "Campaigns":
				menuId = "ef_menu_li_MAILCAMP";
				break;

			case "Surveys":
				menuId = "ef_menu_li_SURV";
				break;

			case "RegistrationSub":
				menuId = "ef_menu_li_REGISTRATIONLIST";
				break;

			case "IncompleteRegistrations":
				menuId = "ef_menu_li_SYSTEMP";
				break;

			case "AttendanceRecording":
				menuId = "ef_menu_li_ATTREC";
				break;

			case "BulkEdit":
				menuId = "ef_menu_li_BULK";
				break;

			case "QuickSearch":
				menuId = "ef_menu_li_QUICKREP";
				break;

			case "Search":
				menuId = "ef_menu_li_ADVSEARCH";
				break;

			case "Reports":
				menuId = "ef_menu_li_REPS";
				break;

			case "DeDuplication":
				menuId = "ef_menu_li_SYSDEDUPE";
				break;

			case "DiarySlots":
				menuId = "ef_menu_li_MEETSLOTS";
				break;

			case "Lunches":
				menuId = "ef_menu_li_MEETLUNCH";
				break;

			case "ArrangedMeetings":
				menuId = "ef_menu_li_MEETOVER";
				break;

			case "MeetingSettings":
				menuId = "ef_menu_li_MEETSET";
				break;

			default:


				break;
		}

		return menuId;
	}

	@Keyword
	public void selectMenuItem(String menuItem) {
		WebDriver driver = DriverFactory.getWebDriver()

		Thread.sleep(5000);
		String menuId = getMenuID(menuItem);
		String xpathToFindAncestor = ".//*[@id='" + menuId + "']/a//ancestor::li";
		String menuSoFar = "";
		String innerText = "";

		Thread.sleep(5000);
		List<WebElement> allAncestors = driver.findElements(By.xpath(xpathToFindAncestor));

		Actions action = new Actions(driver);


		for (WebElement element : allAncestors) {

			Thread.sleep(1000);

			innerText = element.getText();

			if (innerText.isEmpty()) {
				innerText = menuItem;
			}

			String xpathExpression = ".//*[@id='" + element.getAttribute("id") + "']/a";
			WebElement currentElement = driver.findElement(By.xpath(xpathExpression));
			action.moveToElement(currentElement).build().perform();
			currentElement.click();
			menuSoFar = menuSoFar + " > " + innerText;
		}
	}
}
