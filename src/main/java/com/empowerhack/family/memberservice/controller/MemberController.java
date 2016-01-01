package com.empowerhack.family.memberservice.controller;

import com.empowerhack.family.memberservice.domain.Member;
import com.empowerhack.family.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.hateoas.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @Autowired
    EntityLinks entityLinks;

    @Autowired
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.GET, value = "/members/{id:[\\d]+}/changes/latest")
    public
    @ResponseBody
    ResponseEntity<Resource<Revision>> findLastChangeRevision(@PathVariable Long id) {
        Revision<Integer, Member> revision = this.memberService.findLastChangeRevision(id);

        Resource<Revision> resource = new Resource<>(revision);

        final LinkBuilder lb = this.entityLinks.linkForSingleResource(Member.class, id);
        resource.add(lb.withRel("member"));

        return new ResponseEntity<>(resource, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/members/{id:[\\d]+}/changes")
    public
    @ResponseBody
    ResponseEntity<Resource<Revisions>> findRevisions(@PathVariable Long id) {
        Revisions<Integer, Member> revisions = this.memberService.findRevisions(id);

        Resource<Revisions> resource = new Resource<>(revisions);

        final LinkBuilder lb = this.entityLinks.linkForSingleResource(Member.class, id);
        resource.add(lb.withRel("member"));

        return new ResponseEntity<>(resource, HttpStatus.OK);
    }
}
