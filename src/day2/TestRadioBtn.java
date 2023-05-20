package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioBtn {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Task:
         1. Navigate to URL
         2. Select first "Male" radio button;
         3. Click on "Get checked value;
         4. Verify if "Male" button is checked or not;
         */

        System.setProperty("webdriver.chrome.driver", "/Users/murselbilge/IdeaProjects/SeleniumMindtek/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        driver.manage().window().maximize();


        WebElement maleRadioBtn = driver.findElement(By.xpath("(//input[contains(@name, 'dio')])[1]"));
        maleRadioBtn.click();

        WebElement getCheckedValue = driver.findElement(By.xpath("//button[contains(text(), 'Checked value')]"));
        getCheckedValue.click();

        String actualMessage = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
//        System.out.println(actualMessage);

        String expectedMessage = "Radio button 'Male' is checked";

        if (expectedMessage.equals(actualMessage)) {
            System.out.println("Male radion button is checked.");
        } else {
            System.out.println("Male radio button is not checked.");
        }


        /**
         * Task:
         * 1. Select from Sex "Female" radio button;
         * 2. Select  from Age Group select "0-5";
         * 3. Click "Get values";
         * 4. Validate the messages. ("Sex : Male;  Age group: 0 - 5");
         */


        driver.findElement(By.xpath("//input[@name='optradio' and @value='Female']")).click();
        driver.findElement(By.xpath("//input[@ value ='5 - 15']")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

        String actualMessage2 = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();

        System.out.println(actualMessage2);

        Thread.sleep(4000);
        driver.quit();
    }
}