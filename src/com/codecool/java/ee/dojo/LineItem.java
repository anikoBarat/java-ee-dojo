package com.codecool.java.ee.dojo;

import javax.persistence.*;

@IdClass(LineItemKey.class)
@Entity
@Table(name = "jpa_order_lineitem")
@NamedQueries({@NamedQuery(name = "findLineItemsByOrderId", query = "SELECT l FROM LineItem l " +
        "WHERE l.customerOrder.orderId = :orderId " +
        "ORDER BY l.itemId")})
public class LineItem {
    @Id
    private int itemId;

    private int quantity;
    @JoinColumn(name = "ProductId")

    @ManyToOne
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name = "orderId")
    private CustomerOrder order;

    public LineItem(int quantity, Product product, CustomerOrder order) {
        this.quantity = quantity;
        this.product = product;
        this.order = order;
        this.itemId = order.getNextId();
    }

    public LineItem() {
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CustomerOrder getCustomerOrder() {
        return order;
    }

    public void setCustomerOrder(CustomerOrder order) {
        this.order = order;
    }

    ;


    @Override
    public String toString() {
        return "LineItem{" +
                "itemId=" + itemId +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }


}
