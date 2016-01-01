package com.empowerhack.family.memberservice.service;

import com.empowerhack.family.memberservice.domain.Member;
import com.empowerhack.family.memberservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.stereotype.Service;

@Service
public final class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Revisions<Integer, Member> findRevisions(Long id) {
        return this.memberRepository.findRevisions(id);
    }

    public Revision<Integer, Member> findLastChangeRevision(Long id) {
        return this.memberRepository.findLastChangeRevision(id);
    }
}
