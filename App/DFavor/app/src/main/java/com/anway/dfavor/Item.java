package com.anway.dfavor;

public class Item {

    String itemId;
    String itemTitle;
    String itemDesc;

    public Item() {}

    public Item(String itemId, String itemTitle, String itemDesc) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
        this.itemDesc = itemDesc;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}
