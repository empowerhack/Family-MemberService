package com.empowerhack.family.memberservice.jpa;

import com.empowerhack.family.memberservice.domain.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {
}
