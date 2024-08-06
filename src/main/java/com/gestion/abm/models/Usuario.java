/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.abm.models;

import com.gestion.abm.helpers.ErrorMsgs;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
//import org.hibernate.validator.constraints.Range;   //si voy a usar @Range en lugar de min o max para numeros

/**
 *
 * @author Usuario
 */
@Entity
@Data
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generacion automatica 1 a 1
    private Long id;
    
    @NotBlank(message = ErrorMsgs.REQUIRED) //ni nulo ni cadena vacia
    @Size(min = 1, max = 50, message = ErrorMsgs.STRLENGH)
    @Column(nullable = false, length = 50) // tambien le puedo agregar un nombre distinto para la columna en la base de daros
    private String nombre;
    
    @NotBlank(message = ErrorMsgs.REQUIRED) 
    @Size(min = 1, max = 50, message = ErrorMsgs.STRLENGH)
    @Column(nullable = false, length = 50)
    private String apellido;
    
    @NotBlank(message = ErrorMsgs.REQUIRED) 
    @Size(min = 1, max = 30, message = ErrorMsgs.STRLENGH)
    @Column(nullable = false, length = 30, unique = true)
    @Email(message = ErrorMsgs.EMAIL)
    private String email;
    
    @NotNull(message = ErrorMsgs.REQUIRED)  // no nulo
    @Min(value = 1,  message = ErrorMsgs.INTSIZEMIN) 
    @Max(value = 99999999, message = ErrorMsgs.INTSIZEMAX)
    @Column(nullable = false)
    private int dni;
    
}
