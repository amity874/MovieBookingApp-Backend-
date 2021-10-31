package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class user {
    @Id
    private int User_id;
    @Column(length = 40,name = "First Name",nullable = false)
    private String FirstName;
    @Column(length = 40,name = "Last Name",nullable = false)
    private String LastName;

    public int getUser_id() {
        return User_id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "User_id=" + User_id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return User_id == user.User_id && Objects.equals(FirstName, user.FirstName) && Objects.equals(LastName, user.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(User_id, FirstName, LastName);
    }
}
