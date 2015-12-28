package com.empowerhack.family.memberservice.data;

import com.empowerhack.family.memberservice.domain.Interest;
import com.empowerhack.family.memberservice.domain.Member;
import com.empowerhack.family.memberservice.domain.Skill;
import com.empowerhack.family.memberservice.domain.Url;
import com.empowerhack.family.memberservice.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Sample {
    @Bean
    public Member sampleDataMember1(MemberRepository repository) {

        Member member1 = new Member();
        member1.setName("Member 1");
        member1.setEmail("member@test.com");
        member1.setIsPrivate(true);
        member1.setAvailability(50);

        Set<Url> urls = new HashSet<Url>();
        urls.add(new Url("LinkedIn", "http://linkedin.com/member1"));
        urls.add(new Url("Facebook", "http://facebook.com/member1"));
        urls.add(new Url("Twitter", "http://twitter.com/member1"));
        member1.setUrls(urls);

        Set<Skill> skills = new HashSet<Skill>();
        skills.add(new Skill("Java"));
        skills.add(new Skill("PHP"));
        skills.add(new Skill("DevOPs"));
        member1.setSkills(skills);

        Set<Interest> interests = new HashSet<Interest>();
        interests.add(new Interest("Learning"));
        interests.add(new Interest("Networking"));
        member1.setInterests(interests);

        return repository.save(member1);
    }

    @Bean
    public Member sampleDataMember2(MemberRepository repository) {

        Member member1 = new Member();
        member1.setName("Member 2");
        member1.setEmail("member2@test.com");
        member1.setIsPrivate(false);
        member1.setAvailability(90);

        Set<Url> urls = new HashSet<Url>();
        urls.add(new Url("LinkedIn", "http://linkedin.com/member2"));
        urls.add(new Url("Facebook", "http://facebook.com/member2"));
        urls.add(new Url("Twitter", "http://twitter.com/member2"));
        member1.setUrls(urls);

        Set<Skill> skills = new HashSet<Skill>();
        skills.add(new Skill("JS"));
        skills.add(new Skill("Ruby"));
        skills.add(new Skill("UI"));
        member1.setSkills(skills);

        Set<Interest> interests = new HashSet<Interest>();
        interests.add(new Interest("New Technology"));
        interests.add(new Interest("Charity"));
        interests.add(new Interest("NGO"));
        member1.setInterests(interests);

        return repository.save(member1);
    }
}
