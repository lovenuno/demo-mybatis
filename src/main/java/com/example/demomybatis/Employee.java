package com.example.demomybatis;

import lombok.Data;

@Data
public class Employee {
    private int companyId;
    private int id;
    private String name;
    private String address;
}

/*
create table employee (
	id integer auto_increment primary key,
	company_id integer,
	employee_name varchar(128),
	employee_address varchar(128),
	index(employee_name),
	index
	foreign key(company_id) references company(id)
)
*/