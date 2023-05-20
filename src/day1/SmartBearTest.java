package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        System.out.println("Title before loging in: " + driver.getTitle());

        driver.manage().window().maximize(); // method chain

        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUserName.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        WebElement actualPaulBrown = driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr[2]//td[2]"));

        String expectedName = "Paul Brown";

        System.out.println(actualPaulBrown.getText());

        if (expectedName.equals(actualPaulBrown.getText())) {
            System.out.println("Success !");
        } else {
            System.out.println("Error!");
        }

        /**
         * Task
         *
         * 1.Check if Mark Smith is as expected.
         *
         *
         */
        WebElement actualMarkSmith = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));

        String expectedName1 = "Mark Smith";
        System.out.println(actualMarkSmith.getText());

        if (expectedName1.equals((actualMarkSmith.getText()))) {
            System.out.println("Success!");
        } else {
            System.out.println("Error!");

        }

        //  System.out.println(driver.getTitle());

        if (driver.getTitle().equals("Web Orders")) {
            System.out.println("Our driver is on Home Page");

        } else {
            System.out.println("Driver is not on home Page.");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();


        }
    }
}

