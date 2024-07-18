package com.proyecto.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//añadimos las anotaciones Entity y Table
@Entity
@Table(name = "usuarios.")
public class UserModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String Nombre;

    @Column
    private String Apellido;

    @Column
    private String Correo;

    //Creamos gets y sets
    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }

    public String getCorreo(){
        return Correo;
    }

    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
}