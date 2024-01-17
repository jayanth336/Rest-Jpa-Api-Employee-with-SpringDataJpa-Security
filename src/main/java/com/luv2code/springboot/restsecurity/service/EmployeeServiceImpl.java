package com.luv2code.springboot.restsecurity.service;

import com.luv2code.springboot.restsecurity.dao.EmployeeRepository;
import com.luv2code.springboot.restsecurity.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee theEmployee;

        if(optionalEmployee.isPresent()) {
            theEmployee = optionalEmployee.get();
        } else {
            throw new RuntimeException("Employee with ID " + id + " is not found!");
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
