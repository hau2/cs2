package com.example.cs2app.payroll.repository;

import com.example.cs2app.model.payroll.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
