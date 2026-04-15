package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.response.ApiResponse;

@Service
public class ConsumoService {

    public ApiResponse consumirAPI() {

        String url = "http://localhost:8081/estudiantes"; 

        RestTemplate restTemplate = new RestTemplate();

        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class);

        return response;
    }
}