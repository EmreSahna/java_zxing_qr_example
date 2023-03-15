package com.emresahna;

public class SellerDetailPOJO {
    private String seller_id;

    public SellerDetailPOJO() {
    }

    public SellerDetailPOJO(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    @Override
    public String toString() {
        return "SellerDetailPOJO{" +
                "seller_id='" + seller_id + '\'' +
                '}';
    }
}
