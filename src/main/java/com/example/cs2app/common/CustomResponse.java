package com.example.cs2app.common;

import lombok.Data;

import java.util.List;

@Data
public class CustomResponse<T> {
    private String status;
    private List<T> data;
}
