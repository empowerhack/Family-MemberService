package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Url;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface UrlRepository extends PagingAndSortingRepository<Url, Long>, RevisionRepository<Url, Long, Integer> {
}
