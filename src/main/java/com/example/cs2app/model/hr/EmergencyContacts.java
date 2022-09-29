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
@Table(name="EmergencyContacts")
public class EmergencyContacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Employee_ID;
    private String Emergency_Contact_Name;
    private String Phone_Number;
    private String Relationship;
}
