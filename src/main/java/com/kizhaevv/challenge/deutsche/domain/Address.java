package com.kizhaevv.challenge.deutsche.domain;

import java.io.Serializable;

/**
 * @author Vasiliy Kizhaev
 */
public class Address implements Serializable {
    private int number;
    private String postCode;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (number != address.number) return false;
        return postCode != null ? postCode.equals(address.postCode) : address.postCode == null;

    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (postCode != null ? postCode.hashCode() : 0);
        return result;
    }
}
