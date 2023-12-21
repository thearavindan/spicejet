package utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {                        //spicejet

	public static WebDriver driver;
	public String excelfile;
	
	public void browser(String url, String browser) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		}else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver(options);
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
	
	public void close() {
		driver.quit();
	}
	
	public void gettitle(String pagename) {
	 pagename =	driver.getTitle();
	 System.out.println(pagename);
	}
	
	public void waitforvisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void verifymessage(WebElement element, String expected) {
		String actual = element.getText();
		assertEquals(actual, expected);
		System.out.println("Error message displayed for invalid credentials");
	}
	
	public void loginmessage(WebElement element, String expected) {
		String actual = element.getText();
		assertEquals(actual, expected);
		System.out.println("Login message displayed");
	}
	
	public void returnback() {
		driver.navigate().back();
	}
		
		public Object[][] readexcel(String excelfile) throws IOException {
			XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\Aravind\\eclipse-workspace\\Spicejet\\data\\"+excelfile+".xlsx");
			XSSFSheet sheet = book.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			int columncount = sheet.getRow(0).getLastCellNum();
			Object[][] data = new String[rowcount][columncount];
			for(int i=1;i<=rowcount;i++) {
				XSSFRow row = sheet.getRow(i);
				for(int j=0;j<columncount;j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
					System.out.println(cell.getStringCellValue());
				}
			}
			book.close();
			return data;
		}
		
	 
		public void click(WebElement element) {
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		
		public void clear(WebElement element) {
		element.clear();
		}

		public void sendkeys(WebElement ele, String values) {
			ele.sendKeys(values);
		}
		
		public void alert()  {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.getText();
			alert.accept();
		}
		
		public void select(WebElement elem, String name) {
			Select select = new Select(elem);
			select.selectByVisibleText(name);
		}
		
		
		public String takescreenshot(String testmethodname) throws IOException {
			String path = "./screenshots/"+testmethodname+".png";
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(source, dest);
			return path;
		}
		
		public void takesnap(String testmethodname) throws IOException {
			String path = "./screenshots/"+testmethodname+".png";
			TakesScreenshot screenshot = ((TakesScreenshot)driver);
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(source, dest);
		}
		
		public void actionclick(WebElement ele) {
			Actions builder = new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		     wait.until(ExpectedConditions.elementToBeClickable(ele));
             builder.moveToElement(ele).click().perform();
		}
		
		public void actionsendkeys(WebElement ele, String name) {
			Actions builder = new Actions (driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		     wait.until(ExpectedConditions.elementToBeClickable(ele));
             builder.moveToElement(ele).sendKeys(name).perform();
		}
		
		public void jsscrolldown(WebElement elem) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", elem);
		}
		
		public void jsscrollup() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("scroll(0, -250);");
		}

		public void jsClick(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		public void switchtowindow(int num) {
			Set<String> window = driver.getWindowHandles();
			List<String>screen = new ArrayList<String>(window);
			driver.switchTo().window(screen.get(num));
		}
		
		public void fieldisdisplayed(WebElement element) {
			assertTrue(element.isDisplayed());
			String fieldname = element.getText();
			System.out.println(fieldname+" is displayed");
	}
		
		public void switchtoframe(WebElement frame) {
			driver.switchTo().frame(frame);
		}
		
		public void exitframe() {
			driver.switchTo().defaultContent();
		}
		
		public void threadsleep() throws InterruptedException {
			Thread.sleep(5000);
		}

}


