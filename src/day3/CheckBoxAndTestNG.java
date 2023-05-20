package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxAndTestNG {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testUncheckAllMsg(){
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        List <WebElement> checkBoxes = driver.findElements(By.className("cb1-element"));

        for (int i =0; i<checkBoxes.size(); i++){

            checkBoxes.get(i).click();
            Assert.assertTrue(checkBoxes.get(i).isSelected());
        }

        WebElement uncheckAllBtn =driver.findElement(By.id("check1"));

        String actualUncheckAllMsg = uncheckAllBtn.getAttribute("value");

        String expectedMsg = "Uncheck All";

        Assert.assertEquals(actualUncheckAllMsg, expectedMsg);



    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

}

