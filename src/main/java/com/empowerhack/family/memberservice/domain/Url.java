package com.empowerhack.family.memberservice.domain;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Audited
@Data
@Entity
final public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=4, max=64)
    private String name;

    @NotNull
    @Size(min=4, max=255)
    private String host;

    Url() {
    }

    public Url(String name, String host) {
        this.name = name;
        this.host = host;
    }
}
