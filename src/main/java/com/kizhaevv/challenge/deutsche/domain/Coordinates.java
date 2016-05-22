package com.kizhaevv.challenge.deutsche.domain;

/**
 * @author Vasiliy Kizhaev
 */
public class Coordinates {
    private String longitude;
    private String latitude;

    public Coordinates(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (!longitude.equals(that.longitude)) return false;
        return latitude.equals(that.latitude);

    }

    @Override
    public int hashCode() {
        int result = longitude.hashCode();
        result = 31 * result + latitude.hashCode();
        return result;
    }
}
