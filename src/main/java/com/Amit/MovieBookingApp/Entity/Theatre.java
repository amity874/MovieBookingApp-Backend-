package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Theatre {
    @Id
    private int TheatreId;
    @Column(nullable = false,length = 30,unique = true)
    private  String TheatreName;
    private float TheatrePrice;

    public int getTheatreId() {
        return TheatreId;
    }

    public String getTheatreName() {
        return TheatreName;
    }

    public float getTheatrePrice() {
        return TheatrePrice;
    }

    public void setTheatreId(int theatreId) {
        TheatreId = theatreId;
    }

    public void setTheatreName(String theatreName) {
        TheatreName = theatreName;
    }

    public void setTheatrePrice(float theatrePrice) {
        TheatrePrice = theatrePrice;
    }

    @Override
    public String toString() {
        return "Theatre{" +
                "TheatreId=" + TheatreId +
                ", TheatreName='" + TheatreName + '\'' +
                ", TheatrePrice=" + TheatrePrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theatre theatre = (Theatre) o;
        return TheatreId == theatre.TheatreId && Float.compare(theatre.TheatrePrice, TheatrePrice) == 0 && Objects.equals(TheatreName, theatre.TheatreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TheatreId, TheatreName, TheatrePrice);
    }
}
