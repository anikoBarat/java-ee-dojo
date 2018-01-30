package com.codecool.java.ee.dojo;

import java.io.Serializable;

public final class LineItemKey implements Serializable {

    private static final long serialVersionUID =  1562260205094677677L;
    private Integer costumerOrder;
    private int itemId;

    public LineItemKey(Integer costumerOrder, int itemId) {
        this.costumerOrder = costumerOrder;
        this.itemId = itemId;
    }

    public LineItemKey(){};

    public Integer getCostumerOrder() {
        return costumerOrder;
    }

    public void setCostumerOrder(Integer costumerOrder) {
        this.costumerOrder = costumerOrder;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString(){
        return "" + getCostumerOrder() + "-" + getItemId();
    }


}
