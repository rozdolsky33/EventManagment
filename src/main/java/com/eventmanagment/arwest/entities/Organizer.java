package com.eventmanagment.arwest.entities;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Organizer extends AbstractEntity{

    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    // Will do the additional checks to make sure that objects are not null

    public Long getResourceId(){ // include a method so that id can be serialized back/ Must br named resourceId else it wouldn't serialize
        return id;

    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id,((Organizer)obj).id); // pass in the id's of the obj that is being compared with the obj that is being passed in
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
