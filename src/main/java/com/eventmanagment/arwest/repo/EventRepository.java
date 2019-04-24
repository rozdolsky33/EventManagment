package com.eventmanagment.arwest.repo;

import com.eventmanagment.arwest.entities.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
