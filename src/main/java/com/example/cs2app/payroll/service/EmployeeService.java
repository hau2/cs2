package com.example.cs2app.payroll.service;

import com.example.cs2app.hr.repository.PersonalRepository;
import com.example.cs2app.model.hr.Personal;
import com.example.cs2app.model.payroll.Employee;
import com.example.cs2app.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
