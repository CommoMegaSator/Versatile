package com.versatile.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", length = 25, nullable = false, unique = true)
    private String email;

    @Column(name = "firstname", length = 25)
    private String firstname;

    @Column(name = "lastname", length = 25)
    private String lastname;

    @Column(name = "nickname", length = 25, nullable = false, unique = true)
    private String nickname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "password", length = 60, nullable = false)
    private String password;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "gender", length = 15)
    private String gender;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "city")
    private String city;

    @Column(name = "about_user")
    private String aboutUser;

    @Column(name = "status")
    private boolean status;
}