package com.empowerhack.family.memberservice.Repository;

import com.empowerhack.family.memberservice.Entity.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {
}
