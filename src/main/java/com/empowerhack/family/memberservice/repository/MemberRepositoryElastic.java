package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Member;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MemberRepositoryElastic extends ElasticsearchRepository<Member, String> {

}
