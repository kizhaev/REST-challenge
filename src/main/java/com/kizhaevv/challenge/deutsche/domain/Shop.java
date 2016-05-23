package com.kizhaevv.challenge.deutsche.domain;

import java.io.Serializable;

/**
 * @author Vasiliy Kizhaev
 */
public class Shop implements Serializable {
    private String shopName;
    private Address shopAddress;
    private Coordinates shopCoordinates;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Address getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(Address shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Coordinates getShopCoordinates() {
        return shopCoordinates;
    }

    public void setShopCoordinates(Coordinates shopCoordinates) {
        this.shopCoordinates = shopCoordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (shopName != null ? !shopName.equals(shop.shopName) : shop.shopName != null) return false;
        return shopAddress != null ? shopAddress.equals(shop.shopAddress) : shop.shopAddress == null;

    }

    @Override
    public int hashCode() {
        int result = shopName != null ? shopName.hashCode() : 0;
        result = 31 * result + (shopAddress != null ? shopAddress.hashCode() : 0);
        return result;
    }
}
