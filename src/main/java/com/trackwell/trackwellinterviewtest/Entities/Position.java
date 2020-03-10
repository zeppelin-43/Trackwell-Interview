package com.trackwell.trackwellinterviewtest.Entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Position {

    private Date date;
    private Date receivedDate;
    private int latitude;
    private int longitude;
    private int speed;


    public Position(Date date, Date receivedDate, int latitude, int longitude, int speed) {
        this.date = date;
        this.receivedDate = receivedDate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
