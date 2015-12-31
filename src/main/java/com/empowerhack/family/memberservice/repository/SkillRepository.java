package com.empowerhack.family.memberservice.repository;

import com.empowerhack.family.memberservice.domain.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface SkillRepository extends PagingAndSortingRepository<Skill, Long>, RevisionRepository<Skill, Long, Integer> {
}
