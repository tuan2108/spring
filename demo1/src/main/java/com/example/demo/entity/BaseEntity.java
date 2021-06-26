package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
//  Cái này là để id tự tăng giá trị lên
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId(){
        return id;
    }
}
