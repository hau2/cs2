package com.example.cs2app.payroll.repository;

import com.example.cs2app.model.payroll.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //    @Query(value = "select First_Name, Last_Name, Email, Phone_Number, Shareholder_Status from Personal", nativeQuery = true)
//    List<Personal> getListPersonal();
    List<Employee> findAll();
}
