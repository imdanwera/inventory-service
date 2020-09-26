package com.store.inventory.model;

import com.store.inventory.model.entity.Inventory;

public class InventoryDTO {

    private String productName;
    private String productDescription;
    private String productType;
    private String productAccessoryType;

    public InventoryDTO(){}

    public InventoryDTO(Inventory inventory) {
        this.productName = inventory.getProductName();
        this.productDescription = inventory.getProductDescription();
        this.productType = inventory.getProductType();
        this.productAccessoryType = inventory.getProductAccessoryType();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductAccessoryType() {
        return productAccessoryType;
    }

    public void setProductAccessoryType(String productAccessoryType) {
        this.productAccessoryType = productAccessoryType;
    }
}
