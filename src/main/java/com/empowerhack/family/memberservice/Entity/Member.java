package com.empowerhack.family.memberservice.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Data
@Entity
final public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=4, max=64)
    private String name;

    @NotNull
    private Boolean isPrivate = true;

    @OneToMany
    private Set<Url> urls;

    @OneToMany
    private Set<Skill> skills;
}
