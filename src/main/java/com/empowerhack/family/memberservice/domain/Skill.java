package com.empowerhack.family.memberservice.domain;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Audited
@Data
@Entity
final public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=2, max=32)
    private String name;

    Skill() {
    }

    public Skill(String name) {
        this.name = name;
    }
}
