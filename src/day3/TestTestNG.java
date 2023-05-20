package day3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestNG {

    @BeforeMethod
    public void setUp(){
        System.out.println("I am running before method.%%%%%%%");
    }


    @Test
    public void test1(){
        System.out.println("This is test 1");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("This method is running after each method #######");

    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test
    public void test3(){
        System.out.println("This is test 3");
    }


}
