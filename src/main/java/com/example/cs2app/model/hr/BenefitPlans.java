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
@Table(name="BenefitPlans")
public class BenefitPlans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Benefit_Plan_ID;
    private String Plan_Name;
    private Double Deductable;
    private Integer Percentage_CoPay;
}
