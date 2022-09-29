package com.example.cs2app.model.hr;

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
@Table(name="JobHistory")
public class JobHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Job_History_ID;
    private Double Employee_ID;
    private String Department;
    private String Division;
    private String Start_Date;
    private String End_Date;
    private String Job_Title;
    private Double Supervisor;
    private String Job_Category;
    private String Location;
    private Double Departmen_Code;
    private Double Salary_Type;
    private String Pay_Period;
    private Double Hours_per_Week;
    private Boolean Hazardous_Training;

}
