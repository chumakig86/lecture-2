package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static myprojects.automation.assignment2.tests.LoginTest.*;
import static myprojects.automation.assignment2.utils.Properties.getBaseAdminUrl;

public class CheckMainMenuTest extends BaseScript {

    public static void main(String[] args) {
        // TODO Script to check Main Menu items
        driver.get(getBaseAdminUrl());
        Login();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //List of main menu items
        List<WebElement> list = driver.findElements(By.xpath("//li[contains(@class,'maintab')]"));
        //Get list of main menu items' data-submenu ids
        ArrayList<String> ids = new ArrayList<String>() {{
            list.forEach(element -> add(element.getAttribute("data-submenu")));
        }};
        //Run the tests for each main menu item
        for (String id : ids) {
            WebElement tab = driver.findElement(By.xpath("//li[@data-submenu='" + id + "']"));
            tab.click();
            String title = driver.findElement(By.cssSelector("h2")).getText();
            System.out.println(title);
            driver.navigate().refresh();
            System.out.println("Page title match result: " + title.equals(driver.findElement(By.cssSelector("h2")).getText()));
        }

        Logout();
        driver.quit();
    }
}
