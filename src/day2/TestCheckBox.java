package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        driver.manage().window().maximize();

        WebElement firstCheckBox = driver.findElement(By.cssSelector("#isAgeSelected"));
        firstCheckBox.click();

        System.out.println("The check box is selected: " + firstCheckBox.isSelected());


        Thread.sleep(4000);
        driver.quit();

    }

}
