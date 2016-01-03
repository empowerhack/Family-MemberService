package com.empowerhack.family.memberservice.data;

import com.empowerhack.family.memberservice.domain.Member;
import com.empowerhack.family.memberservice.repository.MemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Sample {

    @Bean
    public Member sampleDataMember1(MemberRepository repository) {

        Member member = new Member();
        member.setName("Member 1");
        member.setEmail("member@test.com");
        member.setIsPrivate(true);
        member.setAvailability(50);

        HashMap<String,String> urls = new HashMap<String,String>();
        urls.put("LinkedIn", "http://linkedin.com/member1");
        urls.put("Facebook", "http://facebook.com/member1");
        urls.put("Twitter", "http://twitter.com/member1");
        member.setUrls(urls);

        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Java");
        skills.add("PHP");
        skills.add("DevOPs");
        member.setSkills(skills);

        ArrayList<String> interests = new ArrayList<String>();
        interests.add("Learning");
        interests.add("Networking");
        member.setInterests(interests);

        return repository.save(member);
    }

    @Bean
    public Member sampleDataMember2(MemberRepository repository) {

        Member member = new Member();
        member.setName("Member 2");
        member.setEmail("member2@test.com");
        member.setIsPrivate(false);
        member.setAvailability(90);

        HashMap<String,String> urls = new HashMap<String,String>();
        urls.put("LinkedIn", "http://linkedin.com/member2");
        urls.put("Facebook", "http://facebook.com/member2");
        urls.put("Twitter", "http://twitter.com/member2");
        member.setUrls(urls);

        ArrayList<String> skills = new ArrayList<String>();
        skills.add("JS");
        skills.add("Ruby");
        skills.add("UI");
        member.setSkills(skills);

        ArrayList<String> interests = new ArrayList<String>();
        interests.add("New Technology");
        interests.add("Charity");
        interests.add("NGO");
        member.setInterests(interests);

        return repository.save(member);
    }
}
