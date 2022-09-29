package com.example.cs2app.hr.service;

import com.example.cs2app.model.hr.Personal;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface IPersonalService {
    List<Personal> findAll();
}
