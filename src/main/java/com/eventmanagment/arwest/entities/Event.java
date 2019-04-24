package com.eventmanagment.arwest.entities;

import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
public class Event extends AbstractEntity {

    private String name;
    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;
    @ManyToOne(fetch = FetchType.EAGER) // when organizer is deleted all his events are deleted
    @JoinColumn(nullable = false)
    private Organizer organizer;
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true) // if participant is not associated with an event delete
    private Set<Participant>participants;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @RestResource(exported = false) //create association as a part of the parent
    private Venue venue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public ZoneId getZoneId() {
        return zoneId;
    }

    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Long gerResourceI(){ // include a method so that id can be serialized back/ Must br named resourceId else it wouldn't serialize
      return id;

    }

    // Will do the additional checks to make sure that objects are not null

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id,((Event)obj).id); // pass in the id's of the obj that is being compared with the obj that is being passed in
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
