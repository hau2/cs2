package com.example.cs2app.model.payroll;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Employee_Number;
    private Integer idEmployee;
    private String Last_Name;
    private String First_Name;
    private Double SSN;
    private String Pay_Rate;
    private Integer PayRates_id;
    private String Vacation_Days;
    private Double Paid_To_Date;
    private String Paid_Last_Year;
}
