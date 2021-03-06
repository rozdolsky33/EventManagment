package com.eventmanagment.arwest.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
public class Participant extends AbstractEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private Boolean checkedIn;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Long getResourceId(){ // include a method so that id can be serialized back/ Must br named resourceId else it wouldn't serialize
        return id;

    }

    // Will do the additional checks to make sure that objects are not null

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id,((Participant)obj).id); // pass in the id's of the obj that is being compared with the obj that is being passed in
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
