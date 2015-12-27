package com.empowerhack.family.memberservice;

import com.empowerhack.family.memberservice.entity.Interest;
import com.empowerhack.family.memberservice.entity.Member;
import com.empowerhack.family.memberservice.entity.Skill;
import com.empowerhack.family.memberservice.entity.Url;
import com.empowerhack.family.memberservice.repository.MemberRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class FamilyMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FamilyMemberServiceApplication.class, args);
    }
}
