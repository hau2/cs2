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
@Table(name="PayRates")
public class PayRates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPay_Rates;
    private Integer Pay_Rate_Name;
    private Double Value;
    private Double Tax_Percentage;
    private Integer Pay_Type;
    private Double Pay_Amount;
    private Double PT_Level_C;
}
