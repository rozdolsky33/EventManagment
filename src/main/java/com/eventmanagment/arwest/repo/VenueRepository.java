package com.eventmanagment.arwest.repo;

import com.eventmanagment.arwest.entities.Venue;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}
