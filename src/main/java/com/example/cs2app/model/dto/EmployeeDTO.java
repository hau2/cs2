package com.example.cs2app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
    // hr
    private Integer Employee_ID;
    private String First_Name;
    private String Last_Name;
    private String Middle_Initial;
    private String Address1;
    private String Address2;
    private String City;
    private String State;
    private Double Zip;
    private String Email;
    private String Phone_Number;
    private String Social_Security_Number;
    private String Drivers_License;
    private String Marital_Status;
    private Boolean Gender;
    private Boolean Shareholder_Status;
    private Double Benefit_Plans;
    private String Ethnicity;

    // payroll
    private Integer Employee_Number;
    private Double SSN;
    private String Pay_Rate;
    private String Vacation_Days;
    private Double Paid_To_Date;
    private String Paid_Last_Year;
}
