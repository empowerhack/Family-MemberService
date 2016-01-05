package com.empowerhack.family.memberservice.repository;

import java.util.List;
import com.empowerhack.family.memberservice.domain.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepositoryDb extends PagingAndSortingRepository<Member, Long>, RevisionRepository<Member, Long, Integer> {

    @Query("SELECT m FROM Member m WHERE m.name LIKE %:name%")
    List<Member> findByName(@Param("name") String name);
}
