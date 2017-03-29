package com.malikov.freelance.to;

public class OrderItemAutocompleteTo {

//    get rid of label. use javascript concatenation instead
    private String label;

    private Integer productId;

    private Integer productVariationId;

    private String orderItemName;

    private Integer orderItemPrice;

    public OrderItemAutocompleteTo(String label, Integer productId, Integer productVariationId, String orderItemName, Integer orderItemPrice) {
        this.label = label;
        this.productId = productId;
        this.productVariationId = productVariationId;
        this.orderItemName = orderItemName;
        this.orderItemPrice = orderItemPrice;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(Integer productVariationId) {
        this.productVariationId = productVariationId;
    }

    public String getOrderItemName() {
        return orderItemName;
    }

    public void setOrderItemName(String orderItemName) {
        this.orderItemName = orderItemName;
    }

    public Integer getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(Integer orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }
}
