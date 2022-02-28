package com.example.onetomany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(targetEntity = Subject.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ss_fk", referencedColumnName ="id")
    private List<Subject> subjects;
}
