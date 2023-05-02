package com.sauce.demo.sw4.pages;

import com.sauce.demo.sw4.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By errorMessage = By.xpath("//span[contains(text(), 'Products')]");

    By countProduct = By.xpath("//div[@class='inventory_item_img']");

    By list = By.className("inventory_item_name");

    public String getErrorMessage(){
        return  getTextFromElement(errorMessage);

    }
public void verifyThatSixProductsAreDisplayedOnPage(){

        countTheProduct(countProduct);
        printNameOfProduct(list);
}


    }


