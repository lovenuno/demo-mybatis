package com.example.demomybatis;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Insert("INSERT INTO employee(company_id, employee_name, employee_address) VALUES(#{employee.companyId}, #{employee.name}, #{employee.address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(@Param("employee") Employee employee);

    @Select("SELECT * FROM employee")
    @Results(id = "EmployeeMap", value = {
            @Result(property = "name", column = "employee_name"),
            @Result(property = "address", column = "employee_address"),
            @Result(property = "companyId", column = "company_id")
    })
    List<Employee> getAll();

    @Select("select * from company where id=#{id}")
    @ResultMap("EmployeeMap")
    Employee getById(@Param("id") int id);

    @Select("select * from employee where company_id = #{companyId}")
    @ResultMap("EmployeeMap")
    List<Employee> getByCompanyId(@Param("companyId") int companyId);
}
