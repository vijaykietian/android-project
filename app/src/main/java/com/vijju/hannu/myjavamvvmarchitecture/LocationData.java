package com.vijju.hannu.myjavamvvmarchitecture;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "locationData")
public class LocationData {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "locationName")
    private String locationName;
    @ColumnInfo(name = "latitude")
    private double latitude;
    @ColumnInfo(name = "longitude")
    private double longitude;
    @ColumnInfo(name = "radius")
    private int radius;
    @ColumnInfo(name = "status")
    private boolean status;

    public LocationData(String locationName, double latitude, double longitude, int radius, boolean status) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
        this.status= status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;

    }


    public double getLongitude() {
        return longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;

    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
