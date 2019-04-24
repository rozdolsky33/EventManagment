package com.eventmanagment.arwest.repo;

import com.eventmanagment.arwest.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
