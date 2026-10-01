package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController 
public class SaludarControlador {
    String nombre;

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Hola, mundo, " + nombre + "!";
    }

    @GetMapping("/despedirse")
    public String despedirse() {
        return "¡Adiós, mundo!";
    }

    @PostMapping ("/nombramientos")
    public void nombre(){
        nombre = "Maria";
    }

    @PutMapping ("/nombramientos")
    public void nombrePut(){
        nombre = "Actualizar";
    }
    @DeleteMapping ("/nombramientos")
    public void nombreDelete(){
        nombre = null;
    }
}