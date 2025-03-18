package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.CommonFunctions;

public class CartPage {
    private final WebDriver driver;
    private final CommonFunctions common;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.common = new CommonFunctions(driver);
    }

    // Locators
    By grandTotalElement = By.xpath("//tfoot//strong");

    // Methods
    public void CheckPriceValue(String itemName, String amountPerItem) {

        By priceElement = By.xpath("//td[.=' "+itemName+"']//following-sibling::td[1]");
        String actualPriceValue = common.getText(priceElement).replace("$","");
        Assert.assertEquals(amountPerItem, actualPriceValue, "Price values are not equal. Expected: " + amountPerItem +"; Actual: "+ actualPriceValue);
    }

    public void CheckSubTotalValue(String itemName, String amountPerItem) {

        double unitAmount = Double.parseDouble(amountPerItem);

        WebElement quantityInputBox = driver.findElement(By.xpath("//td[.=' "+itemName+"']//following-sibling::td[2]//input"));

        double quantityInputBoxValue = Double.parseDouble(quantityInputBox.getAttribute("value"));

        double expectedSubtotal = unitAmount * quantityInputBoxValue;

        By subTotalElement = By.xpath("//td[.=' "+itemName+"']//following-sibling::td[3]");
        double actualSubtotalValue = Double.parseDouble(common.getText(subTotalElement).replace("$", ""));

        Assert.assertEquals(expectedSubtotal, actualSubtotalValue, "Price values are not equal. Expected: " + expectedSubtotal +"; Actual: "+ actualSubtotalValue);
    }

    public void verifyGrandTotalValue(String grandTotal) {
        String actualGrandTotalText = common.getText(grandTotalElement);
        actualGrandTotalText = "$" + actualGrandTotalText.substring(7);
        Assert.assertEquals(grandTotal, actualGrandTotalText, "Price values are not equal. Expected: " + grandTotal +"; Actual: "+ actualGrandTotalText);
    }
}
