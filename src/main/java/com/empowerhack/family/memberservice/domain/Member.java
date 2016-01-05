package com.empowerhack.family.memberservice.domain;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Audited
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

    private HashMap<String, String> urls;

    private ArrayList<String> skills;

    private ArrayList<String> interests;
}
