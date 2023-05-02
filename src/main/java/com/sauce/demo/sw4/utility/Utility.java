package com.sauce.demo.sw4.utility;

import com.sauce.demo.sw4.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Utility extends ManageBrowser {


    public void clickOnElement(By by) {
        //Method to find button Element and click
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) {
        //Method to find Element and send text
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        //Method to find Element and get text from webpage
        return driver.findElement(by).getText();
    }

    public void printNameOfProduct(By by) {
        List<WebElement> lst = driver.findElements(by);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText());

        }
    }

    /**
     * //List of images to check on webpage
     *
     * @param by
     */
    public void countTheProduct(By by) {
        int xpathCount = driver.findElements(by).size();
        System.out.println("Total images are : " + xpathCount);
    }


}
