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

    private String description;

    @NotNull
    private Boolean isPrivate = true;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer availability = 0;

    @OneToMany
    private Set<Url> urls;

    @OneToMany
    private Set<Skill> skills;
}
