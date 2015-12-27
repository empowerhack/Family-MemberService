package com.empowerhack.family.memberservice.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(name = "email_idx", columnNames = "email"))
final public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=4, max=64)
    private String name;

    @Email
    @NotNull
    @Size(min=4, max=64)
    private String email;

    @NotNull
    private Boolean isPrivate = true;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer availability = 0;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Url> urls;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Skill> skills;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Interest> interests;
}
