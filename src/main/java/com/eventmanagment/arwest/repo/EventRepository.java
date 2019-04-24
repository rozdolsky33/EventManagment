package com.eventmanagment.arwest.repo;

import com.eventmanagment.arwest.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
