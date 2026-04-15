package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.ApiResponse;
import com.example.demo.service.ConsumoService;

@RestController
public class ConsumoController {

    @Autowired
    private ConsumoService service;

    @GetMapping("/consumir")
    public ApiResponse consumir() {
        return service.consumirAPI();
    }
}