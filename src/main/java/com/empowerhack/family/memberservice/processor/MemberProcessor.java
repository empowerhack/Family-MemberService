package com.empowerhack.family.memberservice.processor;

import com.empowerhack.family.memberservice.controller.MemberController;
import com.empowerhack.family.memberservice.domain.Member;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@Component
public class MemberProcessor implements ResourceProcessor<Resource<Member>> {

    @Override
    public Resource<Member> process(Resource<Member> resource) {
        resource.add(
                linkTo(
                        methodOn(
                                MemberController.class
                        ).findRevisions(
                                resource.getContent().getId()
                        )
                ).withRel("audit")
        );

        resource.add(
                linkTo(
                        methodOn(
                                MemberController.class
                        ).findLastChangeRevision(
                                resource.getContent().getId()
                        )
                ).withRel("audit")
        );

        return resource;
    }
}
