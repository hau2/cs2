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
@Table(name="MigrationHistory")
public class MigrationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MigrationId;
//    private String ContextKey;
//    private String Model;
//    private String ProductVersion;
}
