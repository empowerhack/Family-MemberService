package com.empowerhack.family.memberservice.jpa;

import java.util.List;
import com.empowerhack.family.memberservice.domain.Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

    @Query("SELECT m FROM Member m WHERE m.name LIKE %:name%")
    List<Member> findByName(@Param("name") String name);
}
