package com.taim.conduire.sdk.shopee;


public enum EndpointBaseType {
//    COUPONS("coupons"),
//    CUSTOMERS("customers"),
    ORDERS("orders");
//    PRODUCTS("products"),
//    PRODUCTS_ATTRIBUTES("products/attributes"),
//    PRODUCTS_CATEGORIES("products/categories"),
//    PRODUCTS_SHIPPING_CLASSES("products/shipping_classes"),
//    PRODUCTS_TAGS("products/tags"),
//    REPORTS("reports"),
//    REPORTS_SALES("reports/sales"),
//    REPORTS_TOP_SELLERS("reports/top_sellers"),
//    TAXES("taxes"),
//    TAXES_CLASSES("taxes/classes"),
//    WEBHOOKS("webhooks");

    private String value;

    private EndpointBaseType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
