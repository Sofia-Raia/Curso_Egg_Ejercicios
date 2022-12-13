/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.controladores;

import com.egg.News.entidades.Noticia;
import com.egg.News.excepciones.MyException;
import com.egg.News.servicios.ServicioNoticia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sofia
 */
@Controller
@RequestMapping ("/noticia")
public class ControladorNoticia {
//NoticiaControlador
//Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para operar
//con la vista del usuario diseñada para la gestión de noticias (guardar/modificar noticia, listar
//noticias, dar de baja, etc).
   
  
    @Autowired
    private ServicioNoticia noticiaServicio;
    
    /////////////////////////listar///////////////////////////////////////////
    @GetMapping("/lista") //localhost:8080/noticia/lista
    public String listar(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticia();
        modelo.addAttribute("noticias", noticias);
       

        return "noticia_list.html";
    }
///////////////////////////mostrar formulario///////////////////////////////////////
    @GetMapping("/formulario") //localhost:8080/noticia/formulario
    public String registrar(ModelMap modelo) {
        return "noticia_form.html";
    }
////////////////////////////guardar///////////////////////////////////////////
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo, ModelMap modelo) {
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo);

            modelo.put("exito", "Operacion exitosa!");

        }catch (MyException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";  // volvemos a cargar el formulario.
        }
        return "index.html";
    }

   ///////////////////////////////modifiar solo por id////////////////////////////////////////// 
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        
        modelo.put("noticia", noticiaServicio.buscarPorId(id));
        return "noticia_modificar.html";
    }
///////////////////////////////////modificar//////////////////////////////////////////////
    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo) {
        try {
            Noticia noticia = noticiaServicio.buscarPorId(id);
            if (noticia == null) {
                throw new Error("No se puede modificar una noticia inexistente");
            }
            modelo.addAttribute("noticia", noticia);

            noticiaServicio.modificarNoticia(id, titulo, cuerpo);
            
                        
            return "redirect:../lista";

        } catch (MyException ex) {
            List<Noticia> noticia = noticiaServicio.listarNoticia();
            modelo.put("error", ex.getMessage());
            modelo.addAttribute("noticias", noticia);
            return "noticia_modificar.html";
        }

    }
    ///////////////////////eliminar por id/////////////////////////////////////
    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id, ModelMap modelo) throws MyException{
        try {
            noticiaServicio.eliminar(id);    
            modelo.addAttribute("deleteSuccess", "Se elimino la noticia '"+id+"' con exito!");
        } catch (Exception err) {
            modelo.addAttribute("deleteFail", "No se pudo eliminar la noticia '"+id+"'!");
        }
        return listar(modelo);
        //modelo.addAttribute("noticias",)
        //return "noticia_list.html";
    }
}
