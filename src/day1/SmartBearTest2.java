package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SmartBearTest2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        inputUserName.sendKeys("Tester");
        inputPassword.sendKeys("test");
        loginBtn.click();

        List<WebElement> listOfNames = driver.findElements(By.xpath("//tbody/tr/td[2]"));

       for(int i=1; i<listOfNames.size(); i++){
           System.out.println(listOfNames.get(i).getText());
       }


    }

}
