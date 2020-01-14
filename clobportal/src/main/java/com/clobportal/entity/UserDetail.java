package com.clobportal.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    public Long getId() {
        return id;
    }

    @Column(name="user_name")
    private String firstNmae;

   /* @Column(name="user_address")
    private String address;*/

    public String getFirstNmae() {
        return firstNmae;
    }

    public void setFirstNmae(String firstNmae) {
        this.firstNmae = firstNmae;
    }


    @Override
    public String toString() {
        return "UserDetail{" +
                "firstNmae='" + firstNmae + '\'' +
                '}';
    }
}
