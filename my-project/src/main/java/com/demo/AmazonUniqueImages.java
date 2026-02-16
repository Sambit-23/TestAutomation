package com.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class AmazonUniqueImagesTest {
    @Test
    public void main() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        // To store the imageUrl without duplicates
        Set<String> uniqueImage = new HashSet<>();

        // To stop the loop once found a duplicate imageUrl
        boolean flag = true;
        while (flag){
            driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
            String imageUrl = driver.findElement(By.xpath("//ol/li[contains(@style,'visibility')]//img")).getAttribute("src");
            if(uniqueImage.contains(imageUrl)){
                flag=false;
            }else{
                uniqueImage.add(imageUrl);
            }
        }
        System.out.println("Number of Unique Images are : "+uniqueImage.size());
        System.out.println(uniqueImage);

        driver.quit();

    }
}
