package com.example.demomybatis;

import lombok.*;

import java.util.List;

@Data
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList;
}
/*CREATE database mybatis_db character set utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

CREATE user 'mybatis'@'%' identified by 'mybatis1234';

grant all on mybatis_db.* to 'mybatis'@'%';

use mybatis_db;

show tables;*/
/*
    CREATE TABLE `company` (
        `id` int NOT NULL AUTO_INCREMENT,
        `company_name` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL,
        `company_address` varchar(128) COLLATE utf8mb4_general_ci DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `company_name` (`company_name`)
        );
 */