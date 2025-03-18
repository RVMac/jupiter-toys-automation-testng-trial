package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.CommonFunctions;

public class GlobalPage {
    private final WebDriver driver;
    private final CommonFunctions common;

    public GlobalPage(WebDriver driver) {
        this.driver = driver;
        this.common = new CommonFunctions(driver);
    }

    //region Locators
    By NavHome = By.id("nav-home");
    By NavShop = By.id("nav-shop");
    By NavContact = By.id("nav-contact");
    By NavCart = By.id("nav-cart");

    //region Methods
    public void clickHomeNav(){
        common.click(NavHome);
    }

    public void clickShopNav(){
        common.click(NavShop);
    }

    public void clickContactNav(){
        common.click(NavContact);
    }

    public void clickCartNav() {
        common.click(NavCart);
    }
}
