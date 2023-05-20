package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SeleniumTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        searchBox.sendKeys("Iphone" + Keys.ENTER);


    }



}
