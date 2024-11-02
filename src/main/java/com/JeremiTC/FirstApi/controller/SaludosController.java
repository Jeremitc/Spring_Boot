/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JeremiTC.FirstApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PrimerSaludo")
/**
 *
 * @author Jeremi
 */
public class SaludosController {
    
    @GetMapping("/hola")
    public String HolaMundo(){
    return "Hola Mundo!!";
    
    }
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre,@PathVariable int edad){
        return "Hola Mundo!" + nombre + "Tu edad es:"
 + edad;
    }
    
}
