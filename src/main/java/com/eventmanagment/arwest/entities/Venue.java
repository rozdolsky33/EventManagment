package com.eventmanagment.arwest.entities;


import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Venue extends AbstractEntity {

    private String name;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Long getResourceId(){ // include a method so that id can be serialized back/ Must br named resourceId else it wouldn't serialize
        return id;

    }

    // Will do the additional checks to make sure that objects are not null

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id,((Venue)obj).id); // pass in the id's of the obj that is being compared with the obj that is being passed in
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
