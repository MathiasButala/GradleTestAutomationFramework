package PageModels;

import java.util.Currency;

public class Inventory {
    private String name;
    private String description;
    private String price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}