package com.thoughtworks.capacity.gtb.mvc.domain;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User {
    @NotNull(message = "id must not be null")
    private Integer id;

    @NotBlank(message = "username must not be blank")
    @Length(min=3, max=10, message="用户名长度为3到10位。")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "用户名只能由字母、数字或下划线组成")
    private String username;

    @NotBlank(message = "password must not be blank")
    @Length(min=5, max=12, message="密码长度为5到12位")
    private String password;

    @Email
    private String email;

    public User() {
    }

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
