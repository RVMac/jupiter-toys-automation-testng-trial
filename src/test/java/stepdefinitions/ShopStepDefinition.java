package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.GlobalPage;
import pages.ShopPage;
import utilities.DriverManager;

import java.util.List;
import java.util.Map;

public class ShopStepDefinition {
    WebDriver driver = DriverManager.getDriver();
    ShopPage shopPage = new ShopPage(driver);
    GlobalPage globalPage = new GlobalPage(driver);

    // GIVEN

    // WHEN
    @When("I buy the following items:")
    public void iBuyTheFollowingItems(DataTable dataTable){
        List<Map<String, String>> items = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> item : items) {
            String itemName = item.get("ItemName");
            int count = Integer.parseInt(item.get("Quantity"));
            shopPage.BuyItem(itemName, count);
        }
    }

    @When("I navigate to Cart page")
    public void iNavigateToCartPage() {
        globalPage.clickCartNav();
    }
}
