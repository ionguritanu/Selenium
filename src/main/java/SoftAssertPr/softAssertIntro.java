package SoftAssertPr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertIntro {
    public int getSum(int num1, int num2){
        return num1+num2;
    }

    @Test
    public void test1(){
             Assert.assertEquals(getSum(2,6),8);
             System.out.println("test1");
             Assert.assertEquals(getSum(0,0),1);
             System.out.println("test2");
             Assert.assertEquals(getSum(-6,-7),-13);
             System.out.println("test3");
    }


    @Test
    public void test2(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getSum(2,6),8);
        System.out.println("test1");
        softAssert.assertEquals(getSum(0,0),1);
        System.out.println("test2");
        softAssert.assertEquals(getSum(-6,-7),-13);
        System.out.println("test3");
        //this is for this scenario
        softAssert.assertAll();

      }
}

