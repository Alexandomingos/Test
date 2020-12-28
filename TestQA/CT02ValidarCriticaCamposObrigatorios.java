package com.example.tests;


import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CT02ValidarCriticaCamposObrigatorios {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private final String pathFirefoxDriver = "A:\\Selenium\\geckodriver.exe";
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", pathFirefoxDriver);
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    baseUrl = "http://www.lourencodemonaco.com.br/vvtest/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCT02ValidarCriticaCamposObrigatorios() throws Exception {
    driver.get(baseUrl + "/?page_id=2");
    driver.manage().window().setSize(new Dimension(1482, 878));
    driver.findElement(By.id("nf-field-5")).click();
    driver.findElement(By.id("nf-field-5")).sendKeys("Al");
    driver.findElement(By.id("nf-field-16")).click();
    driver.findElement(By.id("nf-field-5")).click();
    driver.findElement(By.id("nf-field-5")).sendKeys("Alexandre");
    driver.findElement(By.id("nf-field-16")).click();
    driver.findElement(By.id("nf-field-6")).click();
    driver.findElement(By.id("nf-field-6")).sendKeys("Domingos");
    driver.findElement(By.id("nf-field-16")).click();
    driver.findElement(By.id("nf-field-7")).click();
    driver.findElement(By.id("nf-field-7")).sendKeys("alexandre.domingos@viavarejo.com.br");
    driver.findElement(By.id("nf-field-8")).click();
    {
      WebElement element = driver.findElement(By.id("nf-field-7"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("nf-field-7"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("nf-field-7"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("nf-field-7")).click();
    driver.findElement(By.id("nf-field-8")).click();
    driver.findElement(By.id("nf-field-8")).sendKeys("alexandre.domingos@viavarejo.com.br");
    driver.findElement(By.id("nf-field-17")).click();
    driver.findElement(By.id("nf-label-class-field-10-1")).click();
    driver.findElement(By.id("nf-field-11")).click();
    driver.findElement(By.cssSelector("#nf-field-11 > option:nth-child(1)")).click();
    driver.findElement(By.id("nf-field-12")).click();
    driver.findElement(By.id("nf-field-12")).click();
    driver.findElement(By.id("nf-label-class-field-13-0")).click();
    driver.findElement(By.id("nf-field-14")).click();
    driver.findElement(By.id("nf-field-14")).sendKeys("java");
    driver.findElement(By.id("nf-field-16")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
   // driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
