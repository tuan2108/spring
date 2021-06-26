package com.example.demo.dto;

public class NewDTO extends AbstractDTO<NewDTO> {

    private String user_name;
    private String email;
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
