package com.luv2code.springboot.restsecurity.dao;

import com.luv2code.springboot.restsecurity.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //<Entity_type,Primary_key>
}
