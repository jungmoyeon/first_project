package com.toy.first_project.domain.session;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(length = 500, nullable = false)
    private String name;
    private String age;
    private String contact;
    private String address;

    @Builder
    public Session(String name, String age, String contact, String address){
        this.name   = name;
        this.age    = age;
        this.contact= contact;
        this.address= address;
    }


}
