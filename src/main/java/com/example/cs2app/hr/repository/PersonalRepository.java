package com.example.cs2app.hr.repository;

import com.example.cs2app.model.hr.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {
//    @Query(value = "select First_Name, Last_Name, Email, Phone_Number, Shareholder_Status from Personal", nativeQuery = true)
//    List<Personal> getListPersonal();
    List<Personal> findAll();
}
