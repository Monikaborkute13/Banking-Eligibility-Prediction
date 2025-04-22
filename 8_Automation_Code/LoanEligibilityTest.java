package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoanEligibilityTest extends BaseClass {

    @BeforeMethod
    public void setUpTest() {
        setup();
    }

    @Test
    public void validLoanEligibilityTest() {
        driver.findElement(By.id("username")).sendKeys("user123");
        driver.findElement(By.id("password")).sendKeys("pass123");
        driver.findElement(By.id("loginBtn")).click();

        driver.findElement(By.id("income")).sendKeys("50000");
        driver.findElement(By.id("creditScore")).sendKeys("700");
        driver.findElement(By.id("loanAmount")).sendKeys("10000");
        driver.findElement(By.id("submitLoan")).click();

        String result = driver.findElement(By.id("eligibilityResult")).getText();
        Assert.assertEquals(result, "Eligible");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
