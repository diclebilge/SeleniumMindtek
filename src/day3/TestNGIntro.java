package day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGIntro {

    @Test
    public void testNumbers(){

        int num1 = 5;
        int num2 = 6;



        Assert.assertEquals(num1, num2);

        System.out.println("I am running after assertion...");
    }

    @Test
    public void test2(){

        String actualTitle = "google.com";
        String expectedTitle = "google.com";

        Assert.assertEquals(expectedTitle, actualTitle, "Error, please check...");
    }

    @Test
    public void test3(){

        int a = 5;
        int b = 7;

        int result = 12;




        Assert.assertTrue(a+b==result);
    }

}
