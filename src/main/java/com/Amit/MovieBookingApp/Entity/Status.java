package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Status {
    @Id
    private int StatusId;
    @Column(length = 20,nullable = false,unique = true)
    private String StatusName;

    public int getStatusId() {
        return StatusId;
    }

    public String getStatusName() {
        return StatusName;
    }

    public void setStatusId(int statusId) {
        StatusId = statusId;
    }

    public void setStatusName(String statusName) {
        StatusName = statusName;
    }

    @Override
    public String toString() {
        return "Status{" +
                "StatusId=" + StatusId +
                ", StatusName='" + StatusName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return StatusId == status.StatusId && Objects.equals(StatusName, status.StatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StatusId, StatusName);
    }
}
