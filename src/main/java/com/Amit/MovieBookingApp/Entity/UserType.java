package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class UserType {
    @Id
    private int userTypeId;
    @Column(length = 28,unique = true)
    private String User_type="Customer";
    public UserType(){

    }

    public UserType(int userTypeId, String user_type) {
        this.userTypeId = userTypeId;
        User_type = user_type;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public String getUser_type() {
        return User_type;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public void setUser_type(String user_type) {
        User_type = user_type;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "userTypeId=" + userTypeId +
                ", User_type='" + User_type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserType userType = (UserType) o;
        return userTypeId == userType.userTypeId && Objects.equals(User_type, userType.User_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTypeId, User_type);
    }
}
