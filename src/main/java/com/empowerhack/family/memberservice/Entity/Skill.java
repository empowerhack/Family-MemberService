package com.empowerhack.family.memberservice.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
final public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
