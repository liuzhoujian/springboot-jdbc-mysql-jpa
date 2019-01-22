package com.lzj.springbootjpa.entities;

import lombok.Data;

import javax.persistence.*;

@Data //省略getters and setters
@Entity //告诉JPA这是一个实体类（与数据库表映射的实体类）
@Table(name = "tb_user") ///@Table来指定和哪个数据表对应;如果省略默认表名就是user
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column //省略，列名默认是email
    private String email;
}
