package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static WebDriver driver;

    public void initialization(String url){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();


        driver.get("http://localhost:8080/job/SeleniumGithub/1/console");
        System.out.println(driver.getTitle());
    }


}