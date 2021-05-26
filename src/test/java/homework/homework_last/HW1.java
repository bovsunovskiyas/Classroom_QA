package homework.homework_last;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HW1 {

  @Test
  public void openPage() throws InterruptedException {

    //change variables for testing different Player Names in search form
    String playerName = "Tiger";
    String nonPlayerName = "ix.co";

    String expectedResultMessage1 = "We have found 1 result matching \"" + playerName +  "\"";
    String expectedResultMessage2 = "Sorry, there are no results matching " + nonPlayerName;

    //initialization Web Driver and waiter
    ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    // opening Homepage
    driver.get("https://www.pgatour.com/");
    System.out.println(driver.getCurrentUrl());

    //Opening PLAYERS page
    driver.manage().window().maximize();
    driver.findElement(By.linkText("PLAYERS")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("directory-search-container")));

    // filling valid Player name
    driver.findElement(By.className("input-field")).sendKeys(playerName);
    driver.findElement(By.className("btn-search")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.results-title")));
    System.out.println("Actual title(positive): " + driver.findElement(By.cssSelector("h2.results-title")).getText());

    //Check that actual titles match expected result
    Assert.assertEquals(expectedResultMessage1, driver.findElement(By.cssSelector("h2.results-title")).getText());



    // filling non-valid Player name
    driver.findElement(By.className("input-field")).clear();
    driver.findElement(By.className("input-field")).sendKeys(nonPlayerName);
    driver.findElement(By.className("btn-search")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.results-title.no-results")));
    System.out.println("Actual title(negative): " + driver.findElement(By.cssSelector("h2.results-title")).getText());

    //Check that actual titles match expected result
    Assert.assertEquals(expectedResultMessage2, driver.findElement(By.cssSelector("h2.results-title.no-results")).getText());


    driver.close();
  }


  @BeforeClass
  public static void browserOpen () {
    System.out.println("Set up driver");
  }

  @After
  public void closeDriver () {
    //System.out.println("Closing the test");
    //driver.close();
  }

}
