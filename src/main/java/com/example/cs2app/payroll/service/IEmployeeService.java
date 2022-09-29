package com.example.cs2app.payroll.service;

import com.example.cs2app.model.hr.Personal;
import com.example.cs2app.model.payroll.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
}
