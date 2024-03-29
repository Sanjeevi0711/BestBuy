package org.project1.BestBuyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BestBuyOpen {

	public static void main(String[] args) {

    	WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the SpiceJet website
        driver.get("https://www.BestBuy.com/");

        // Wait for a few seconds (you can use explicit or implicit waits here)
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
		}

        // Close the browser
        driver.quit();
    }
}
