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
@Table(name="Employment")
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Employee_ID;
    private String Employment_Status;
    private String Hire_Date;
    private String Workers_Comp_Code;
    private String Termination_Date;
    private String Rehire_Date;
    private String Last_Review_Date;
}
