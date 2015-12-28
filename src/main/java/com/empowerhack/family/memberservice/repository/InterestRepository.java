package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Interest;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface InterestRepository extends PagingAndSortingRepository<Interest, Long> {
}
