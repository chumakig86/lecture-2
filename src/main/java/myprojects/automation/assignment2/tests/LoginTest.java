package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static myprojects.automation.assignment2.utils.Properties.*;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

         WebDriver driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(getBaseAdminUrl());
        System.out.println(getBrowser());
        // ...
    }
}
