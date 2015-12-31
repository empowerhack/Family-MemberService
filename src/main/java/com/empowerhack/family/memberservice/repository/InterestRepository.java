package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Interest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface InterestRepository extends PagingAndSortingRepository<Interest, Long>, RevisionRepository<Interest, Long, Integer> {
}
