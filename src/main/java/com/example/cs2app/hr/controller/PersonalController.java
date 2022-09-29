package com.example.cs2app.hr.controller;

import com.example.cs2app.hr.service.PersonalService;
import com.example.cs2app.model.hr.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonalController {
    @Autowired
    PersonalService personalService;

    @GetMapping(value="/personals")
    public ResponseEntity<?> getListPersonals() {
        List<Personal> personalList = personalService.findAll();

        if(personalList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<>(personalList, HttpStatus.OK);
    }
}
