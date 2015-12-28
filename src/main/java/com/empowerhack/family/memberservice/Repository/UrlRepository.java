package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Url;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UrlRepository extends PagingAndSortingRepository<Url, Long> {
}
