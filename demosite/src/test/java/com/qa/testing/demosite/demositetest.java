package com.qa.testing.demosite;

		import java.util.concurrent.TimeUnit;
		import org.junit.*;
		import static org.junit.Assert.*;
		import org.openqa.selenium.*;
		import org.openqa.selenium.firefox.FirefoxDriver;
public class demositetest {

		  private WebDriver driver;
		  private boolean acceptNextAlert = true;
		  private StringBuffer verificationErrors = new StringBuffer();
		
		  @Before
		  public void setUp() throws Exception {
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
		
		  @Test
		  public void testIngTheDemoSite() throws Exception {
		    driver.get("http://thedemosite.co.uk/addauser.php");
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).clear();
		    driver.findElement(By.name("username")).sendKeys("mpb");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("lmao");
		    driver.findElement(By.name("FormsButton2")).click();
		    assertEquals("Username too short.  The username must be at least 4 characters in length.", closeAlertAndGetItsText());
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).clear();
		    driver.findElement(By.name("username")).sendKeys("mpb123");
		    driver.findElement(By.name("FormsButton2")).click();
		  }
		
		  @After
		  public void tearDown() throws Exception {
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }
		
		  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
		
		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }
		
		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
}
