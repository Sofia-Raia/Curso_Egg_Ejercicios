/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.repositorios;

import com.egg.News.entidades.Noticia;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sofia
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String>{
    @Query("SELECT n FROM Noticia n WHERE n.estaActivo = 1")
    public List<Noticia> buscarActivas();
    
    @Query("SELECT l FROM Noticia l WHERE l.titulo = :titulo")
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);
    
    @Query("SELECT l FROM Noticia l WHERE l.cuerpo = :cuerpo")
    public List<Noticia> buscarPorCuerpo(@Param ("cuerpo") String cuerpo); 
}



