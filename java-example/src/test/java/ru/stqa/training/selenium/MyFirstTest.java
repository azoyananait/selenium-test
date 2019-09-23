package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {
  private WebDriver driver;
  private WebDriverWait wait;

  @Before
  public void start() {
    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, 10);
  }

  @Test
  public void MyFirstTest() {
    driver.get("http://www.google.ru/");
    driver.findElement(By.name("q")).sendKeys("webdriver");

  }

  @After
  public void stop(){
    driver.quit();
    driver=null;
  }

}
