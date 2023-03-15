package com.emresahna;

public class SellerQRDetailsPOJO {
    private String id;
    private String seller_id;
    private String path;

    public SellerQRDetailsPOJO() {
    }

    public SellerQRDetailsPOJO(String id, String seller_id, String path) {
        this.id = id;
        this.seller_id = seller_id;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SellerQRDetailsPOJO{" +
                "id='" + id + '\'' +
                ", seller_id='" + seller_id + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
