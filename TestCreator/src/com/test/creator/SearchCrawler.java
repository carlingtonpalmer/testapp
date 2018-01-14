package com.test.creator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCrawler {
	private WebDriver driver;
	private WebElement element;
	
	public SearchCrawler() {
		try {
			System.setProperty("webdriver.chrome.driver", "/Users/C655D/workspace/TestCreator/lib/chromedriver.exe");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void initialize() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public String getElementText(String formField) {
		element = driver.findElement(By.name(formField));
		return element.getText();
	}
	public void getElementById(String id) {
		element = driver.findElement(By.id(id));
	}
	public void getElementByPath(String path) {
		element = driver.findElement(By.xpath(path));
	}
	public void setFormFieldContent(String content) {
		element.sendKeys(content);
	}	
	public void clickButton() {
		element.click();
	}
//	public void test(Element formField) {
//		if(formField.attr("type").equals("text")) {
//			setFormFieldContent(content);
//		}
//	}
}
