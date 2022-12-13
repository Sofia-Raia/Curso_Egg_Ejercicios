/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.servicios;

import com.egg.News.entidades.Noticia;
import com.egg.News.excepciones.MyException;
import com.egg.News.repositorios.NoticiaRepositorio;
import com.egg.News.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sofia
 */
@Service
public class ServicioNoticia {
//    Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
//    administrar noticias (consulta, creación, modificación y dar de baja).
    
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
     //////////////////////////////////consultar////////////////////////////////////////
    @Transactional(readOnly = true)
    public Noticia buscarPorId(String id){
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()){
            Noticia noticia = respuesta.get();
            if(noticia.isEstaActivo()) {
                return noticia;
            }
        }
        return null;
        
    }
     //////////////////////////////////crear////////////////////////////////////////////////
    @Transactional
    public void crearNoticia(String titulo,  String cuerpo) throws MyException {

        validar(titulo, cuerpo);
        Noticia noticia = new Noticia ();


        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFechaAlta(new Date());
       
        noticiaRepositorio.save(noticia);
    }
    
    ////////////////////////////////////////////////modificar///////////////////////////////////////////////
    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MyException {

        validar(id, titulo, cuerpo);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id); /// puede regresar sin datos

        if (respuesta.isPresent()) {

            Noticia noticia = respuesta.get();
            if (noticia.isEstaActivo()) {
                noticia.setTitulo(titulo);

                noticia.setCuerpo(cuerpo);
            
                noticiaRepositorio.save(noticia);
            }
        }
        
    }
    ///////////////////////////dar de baja?////////////////////////////////////////////
      @Transactional
    public void eliminar(String id) throws MyException{
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setEstaActivo(false);
            noticiaRepositorio.save(noticia);
        }
    }
/////////////////////////////////listar/////////////////////////////////////////////////////////
    @Transactional(readOnly = true)
    public List<Noticia> listarNoticia() {

        List<Noticia> noticias = new ArrayList();

        noticias = noticiaRepositorio.buscarActivas();//trae todas las noticias

        return noticias;
    }

///////////////////////////////////////validar ////////////////////////////////////////////////
    private void validar(String titulo, String cuerpo) throws MyException {

        if (titulo.isEmpty() || titulo == null) {
            throw new MyException("el titulo no puede ser nulo o estar vacio");
        }
      
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MyException("el cuerpo no puede ser nulo o estar vacio");
        }

    }
    
    private void validar(String id, String titulo, String cuerpo) throws MyException {
        
        if(id == null){
            throw new MyException("el id no puede ser nulo"); //
        }

        if (titulo.isEmpty() || titulo == null) {
            throw new MyException("el titulo no puede ser nulo o estar vacio");
        }
      
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new MyException("el cuerpo no puede ser nulo o estar vacio");
        }

    }
}
