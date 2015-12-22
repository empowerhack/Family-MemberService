package com.empowerhack.family.memberservice.Repository;

import java.util.List;
import com.empowerhack.family.memberservice.Entity.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

    List<Member> findByName(@Param("name") String name);
}
