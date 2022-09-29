package com.example.cs2app.model.hr;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
