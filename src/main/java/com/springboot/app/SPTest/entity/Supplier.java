package com.springboot.app.SPTest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name="firstname" , nullable = false)
    private String firstname ;
    @Column(name="lastname")
    private String lastname ;
    @Column(name="email")
    private String email ;
    @Column(name="PhoneNumber")
    private int PhoneNumber;


}
