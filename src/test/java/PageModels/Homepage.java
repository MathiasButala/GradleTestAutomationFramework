package PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends BasePage {

    @FindBy(css = ".title")
    public WebElement PageTitle;

    @FindBy(css = ".inventory_item")
    public List<WebElement> InventoryItems;

    public Homepage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean IsPageLoaded(){
        return PageTitle.isDisplayed();
    }

    public List<Inventory> GetProductsOnPage(){
        var productList = new ArrayList<Inventory>();
        for(var item:InventoryItems){
            var product = new Inventory();
            product.setName(item.findElement(By.cssSelector(".inventory_item_label a")).getText());
            product.setDescription(item.findElement(By.cssSelector(".inventory_item_desc")).getText());
            product.setPrice(item.findElement(By.cssSelector(".inventory_item_price")).getText());
            productList.add(product);
        }
        return productList;
    }
}