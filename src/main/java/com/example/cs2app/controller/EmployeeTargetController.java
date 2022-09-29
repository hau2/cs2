package com.example.cs2app.controller;

import com.example.cs2app.common.CustomResponse;
import com.example.cs2app.hr.service.PersonalService;
import com.example.cs2app.model.dto.EmployeeDTO;
import com.example.cs2app.model.hr.Personal;
import com.example.cs2app.model.payroll.Employee;
import com.example.cs2app.payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeTargetController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    PersonalService personalService;

    @GetMapping(value="/employees")
    public ResponseEntity<?> getListPersonals() {
        List<Employee> employeeList = employeeService.findAll();
        List<Personal> personalList = personalService.findAll();

        List<EmployeeDTO> employeeDTOList = new ArrayList<>();

        for(Personal personal : personalList) {
            for(Employee employee : employeeList) {

                if(personal.getEmployee_ID().equals(employee.getIdEmployee())) {
                    EmployeeDTO employeeDTO = new EmployeeDTO();
                    employeeDTO.setEmployee_ID(personal.getEmployee_ID());
                    employeeDTO.setFirst_Name(personal.getFirst_Name());
                    employeeDTO.setLast_Name(personal.getLast_Name());
                    employeeDTO.setMiddle_Initial(personal.getMiddle_Initial());
                    employeeDTO.setAddress1(personal.getAddress1());
                    employeeDTO.setAddress2(personal.getAddress2());
                    employeeDTO.setCity(personal.getCity());
                    employeeDTO.setState(personal.getState());
                    employeeDTO.setZip(personal.getZip());
                    employeeDTO.setEmail(personal.getEmail());
                    employeeDTO.setPhone_Number(personal.getPhone_Number());
                    employeeDTO.setSocial_Security_Number(personal.getSocial_Security_Number());
                    employeeDTO.setDrivers_License(personal.getDrivers_License());
                    employeeDTO.setDrivers_License(personal.getDrivers_License());
                    employeeDTO.setDrivers_License(personal.getDrivers_License());
                    employeeDTO.setMarital_Status(personal.getMarital_Status());
                    employeeDTO.setGender(personal.getGender());
                    employeeDTO.setShareholder_Status(personal.getShareholder_Status());
                    employeeDTO.setBenefit_Plans(personal.getBenefit_Plans());
                    employeeDTO.setEthnicity(personal.getEthnicity());

                    employeeDTO.setSSN(employee.getSSN());
                    employeeDTO.setPay_Rate(employee.getPay_Rate());
                    employeeDTO.setVacation_Days(employee.getVacation_Days());
                    employeeDTO.setPaid_To_Date(employee.getPaid_To_Date());
                    employeeDTO.setPaid_Last_Year(employee.getPaid_Last_Year());

                    employeeDTOList.add(employeeDTO);
                }
            }
        }


        CustomResponse<EmployeeDTO> customResponse = new CustomResponse<>();
        customResponse.setStatus("OK");
        customResponse.setData(employeeDTOList);

        return new ResponseEntity<>(customResponse, HttpStatus.OK);
    }
}