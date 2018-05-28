package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;

public class LoginTest extends BaseScript {
    // Method that implements Login functionality
    public static void Login(WebDriver driver) {
        WebElement email = driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.name("submitLogin"));
        email.sendKeys("webinar.test@gmail.com");
        passwd.sendKeys("Xcg7299bnSmMuRLp9ITw");
        submit.click();
    }
    //Method that implements logout functionality
    public static void Logout(WebDriver driver) {
        (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("img-thumbnail")));
        WebElement user = driver.findElement(By.className("img-thumbnail"));
        user.click();
        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(getBaseAdminUrl());
        Login(driver);
        Logout(driver);
        driver.quit();

    }
}
