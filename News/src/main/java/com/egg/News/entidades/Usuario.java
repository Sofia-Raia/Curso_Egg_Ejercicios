/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.entidades;


import com.egg.News.enumeraciones.Rol;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author sofia
 */
@Entity
//@Data --- abarca todas las siguientes anotaciones de lombok.
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {

   
    @Id
    @GeneratedValue(generator= "uuid")
    private String id;
    private String username;
    private String password;
    private String email;
    
    @Enumerated(EnumType.STRING)
    private  Rol rol;
    
    @OneToOne
    private Imagen imagen;

//    public Usuario() {
//    }
//
//    public Usuario(String id, String username, String password, String email, Rol rol) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.rol = rol;
//    }
    

//    public String getId() {
//        return id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public Rol getRol() {
//        return rol;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setRol(Rol rol) {
//        this.rol = rol;
//    }
//    
//
//    

//    @Override
//    public String toString() {
//        return "com.egg.News.entidades.Usuario[ id= " + id + " nombre del usuario= "+ username + " contraseña= "+ password+ " email= "+ email+" rol=" + rol+"]";
//    }
    
}
