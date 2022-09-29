package com.example.cs2app.model.payroll;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    private String Last_Name;
    private String First_Name;
    private Double SSN;

    @ManyToOne
    @JoinColumn(name="idPay_Rates")
    private PayRates Pay_Rates;

    private Integer PayRates_id;
    private String Vacation_Days;
    private Double Paid_To_Date;
    private String Paid_Last_Year;
}
