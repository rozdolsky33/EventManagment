package com.eventmanagment.arwest.repo;

import com.eventmanagment.arwest.entities.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
