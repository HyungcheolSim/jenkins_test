package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Enumeration;

public class Member {

    private Integer user_key;
    private String user_id;
    private Integer user_gender;
    private LocalDate user_birthday;
    private String user_email;
    private String user_photo;
    private String user_password;
    private String user_password_dt;
    private Integer user_height;
    private Integer user_weight;
    private Integer user_target_weight;
    private String user_login_code;
    private String user_name;
    private String user_delete_yn;
    private LocalDateTime user_create_dt;
    private LocalDateTime user_delete_dt;

    public Integer getUser_key() {
        return user_key;
    }

    public void setUser_key(Integer user_key) {
        this.user_key = user_key;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(Integer user_gender) {
        this.user_gender = user_gender;
    }

    public LocalDate getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(LocalDate user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_photo() {
        return user_photo;
    }

    public void setUser_photo(String user_photo) {
        this.user_photo = user_photo;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_password_dt() {
        return user_password_dt;
    }

    public void setUser_password_dt(String user_password_dt) {
        this.user_password_dt = user_password_dt;
    }

    public Integer getUser_height() {
        return user_height;
    }

    public void setUser_height(Integer user_height) {
        this.user_height = user_height;
    }

    public Integer getUser_weight() {
        return user_weight;
    }

    public void setUser_weight(Integer user_weight) {
        this.user_weight = user_weight;
    }

    public Integer getUser_target_weight() {
        return user_target_weight;
    }

    public void setUser_target_weight(Integer user_target_weight) {
        this.user_target_weight = user_target_weight;
    }

    public String getUser_login_code() {
        return user_login_code;
    }

    public void setUser_login_code(String user_login_code) {
        this.user_login_code = user_login_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_delete_yn() {
        return user_delete_yn;
    }

    public void setUser_delete_yn(String user_delete_yn) {
        this.user_delete_yn = user_delete_yn;
    }

    public LocalDateTime getUser_create_dt() {
        return user_create_dt;
    }

    public void setUser_create_dt(LocalDateTime user_create_dt) {
        this.user_create_dt = user_create_dt;
    }

    public LocalDateTime getUser_delete_dt() {
        return user_delete_dt;
    }

    public void setUser_delete_dt(LocalDateTime user_delete_dt) {
        this.user_delete_dt = user_delete_dt;
    }
}
