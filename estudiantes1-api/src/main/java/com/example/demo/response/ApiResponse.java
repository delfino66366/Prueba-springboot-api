package com.example.demo.response;
import java.util.List;
import  com.example.demo.model.Estudiante;
public class ApiResponse {
    private int status;
    private String mensaje;
    private List<Estudiante> estudiantes;

    public ApiResponse() {}

    public ApiResponse(int status, String mensaje, List<Estudiante> estudiantes) {
        this.status = status;
        this.mensaje = mensaje;
        this.estudiantes = estudiantes;
    }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public List<Estudiante> getEstudiantes() { return estudiantes; }
    public void setEstudiantes(List<Estudiante> estudiantes) { this.estudiantes = estudiantes; }
}
