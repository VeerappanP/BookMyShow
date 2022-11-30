package com.maven.bookmyshow;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgenKannayiram {

public static void main(String args[]) throws IOException, InterruptedException{

WebDriver driver = new ChromeDriver();

WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

driver.get("https://in.bookmyshow.com/explore/home/chennai");
   
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement location = driver.findElement(By.xpath("//span[contains(@class,'ellipsis')]"));
location.click();

WebElement chennai = driver.findElement(By.xpath("//img[@alt='CHEN']"));
chennai.click();

WebElement searchBar = driver.findElement(By.xpath("//span[@id='4']"));
searchBar.click();

WebElement agentKannayiram = driver.findElement(By.xpath("//a[.='Agent Kannayiram (UA)']"));
agentKannayiram.click();

WebElement date = driver.findElement(By.xpath("//div[contains(text(),'04')]"));
date.click();

WebElement showTime = driver.findElement(By.xpath("//a[@data-venue-code='MAYJ']"));
showTime .click();

WebElement accept = driver.findElement(By.xpath("//div[@id='btnPopupAccept']"));
accept.click();

WebElement seat = driver.findElement(By.xpath("//li[@id='pop_1']"));
seat.click();

WebElement selectSeatButton = driver.findElement(By.xpath("//div[@id='proceed-Qty']"));
selectSeatButton.click();


try {
WebElement adCancel = driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
wait.until(ExpectedConditions.elementToBeClickable(adCancel));
adCancel.click();
}
catch(NoSuchElementException e) {
	
}

WebElement seatSelections = driver.findElement(By.xpath("//div[@id='A_1_011']"));
seatSelections.click();

WebElement payButton = driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]"));
payButton.click();

Thread.sleep(2000);

TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Users\\crick\\Documents\\BookMyShow\\BookMyShow\\Screenshot\\AgenKannaiyaram.png");
FileUtils.copyFile(source,destination);







}
}

