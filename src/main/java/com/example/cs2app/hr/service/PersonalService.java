package com.example.cs2app.hr.service;

import com.example.cs2app.hr.repository.PersonalRepository;
import com.example.cs2app.model.hr.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService implements IPersonalService {

    @Autowired
    PersonalRepository personalRepository;

    @Override
    public List<Personal> findAll() {
        return personalRepository.findAll();
    }
}
