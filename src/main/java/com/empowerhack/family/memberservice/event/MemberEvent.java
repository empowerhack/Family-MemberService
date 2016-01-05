//package com.empowerhack.family.memberservice.event;
//
//import com.empowerhack.family.memberservice.domain.Member;
//import com.empowerhack.family.memberservice.repository.MemberRepositoryElastic;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.rest.core.annotation.HandleAfterCreate;
//import org.springframework.data.rest.core.annotation.HandleAfterSave;
//import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
//import org.springframework.stereotype.Component;
//
//@Component
//@RepositoryEventHandler(Member.class)
//public class MemberEvent {
//
//    @Autowired
//    private MemberRepositoryElastic memberRepository;
//
//    @HandleAfterSave
//    public void handleAfterSave(Member member) {
//        // SEND to ElasticSearch
//        System.out.println("----------------------------- After UPDATE ....");
//        System.out.println(member);
//
////        this.memberRepository.save(member);
//    }
//
//    @HandleAfterCreate
//    public void HandleAfterCreate(Member member) {
//        // SEND to ElasticSearch
//        System.out.println("----------------------------- After CREATE ....");
//        System.out.println(member);
//
////        this.memberRepository.save(member);
//    }
//}
