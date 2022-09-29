package com.example.cs2app.model.payroll;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer User_ID;
	private String User_Name;
	private String Password;
	private String Email;
	private Integer Active;
}
