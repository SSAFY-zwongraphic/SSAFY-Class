package com.ssafy.day06.c_annotation;

import com.ssafy.day06.c_annotation.ValidationCheck.Type;
// TODO: email, password, salary가 지정된 형식을 만족하는지 점검하는 annotation을 개발해보세요.
public class UserInfo {
    private String name;
    private String email;
    private String password;
    private int salary;

    public UserInfo(String name, String email, String password, int salary) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserInfo [name=" + name + ", email=" + email + ", password=" + password + ", salary=" + salary + "]";
    }

}
