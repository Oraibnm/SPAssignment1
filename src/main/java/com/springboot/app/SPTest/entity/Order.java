package com.springboot.app.SPTest.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(  //allows you to specify the details of the table that will be used to persist the entity in the database
        name = "order", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})}
)
public class Order {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private Long id;


    @Column(name = "description", nullable = true)
    private String description;

    @Column
    private String CreatedBy;

    @Column
    private Boolean isActive;

    @Column
    private Date CreationDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
