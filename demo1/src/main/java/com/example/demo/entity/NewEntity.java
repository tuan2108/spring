package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "demo1")
public class NewEntity extends BaseEntity{
    //    @id là khai báo id n là khóa chính và nó not nul

    @Column
    private String user_name;
    @Column
    private String email;
    @Column
    private int user_phone;



    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(int user_phone) {
        this.user_phone = user_phone;
    }
}
