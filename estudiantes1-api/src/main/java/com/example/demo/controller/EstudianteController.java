package com.example.demo.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Direccion;
import com.example.demo.model.Estudiante;
import com.example.demo.response.ApiResponse;

@RestController
public class EstudianteController {

    @GetMapping("/estudiantes")
    public ApiResponse obtenerEstudiantes() {

        Direccion dir1 = new Direccion("Av. Juárez", "Centro", "Orizaba");
        Direccion dir2 = new Direccion("Calle 5", "Reforma", "Veracruz");

        Estudiante est1 = new Estudiante(1, "Delfino Antonio", "delfinoantonio6636@gmail.com", dir1, "2721000118");
        Estudiante est2 = new Estudiante(2, "Ana Hernandez", "ana86@gmail.com", dir2, "2721000119");

        List<Estudiante> lista = Arrays.asList(est1, est2);

        return new ApiResponse(200, "Consulta exitosa", lista);
    }
}