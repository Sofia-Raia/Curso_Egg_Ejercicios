/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.controladores;

/**
 *
 * @author sofia
 */
import com.egg.News.entidades.Usuario;
import com.egg.News.excepciones.MyException;
import com.egg.News.servicios.UsuarioService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    
    @Autowired
    private UsuarioService usuarioServicio;
    
    @GetMapping("/")
    public String index() {

        return "index.html";
    }
    
     @GetMapping("/registrar")
    public String registrar() {

        return "registro.html";
    }
     @PostMapping("/registro")
    public String registro(@RequestParam String username, @RequestParam String email, @RequestParam String password,
            String password2, ModelMap modelo, MultipartFile archivo) {

        try {
            usuarioServicio.registrar(archivo, username, email, password, password2);

            modelo.put("exito", "Usuario registrado correctamente!");

            return "index.html";
        }catch (MyException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre",username );
            modelo.put("email", email);

            return "registro.html";
        }

    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo ) {

        if (error != null) {
            modelo.put("error", "Usuario o Contraseña invalidos!");
        }

        return "login.html";
    }
    ////////////////
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session) {
        
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        
        if (logueado != null && logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        
           return "inicio.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/perfil")
    public String perfil(ModelMap modelo, HttpSession session){
        Usuario usuario = (Usuario) session.getAttribute("usuariosession");
         modelo.put("usuario", usuario);
        return "usuario_modificar.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @PostMapping("/perfil/{id}")
    public String actualizar(MultipartFile archivo,@PathVariable String id, @RequestParam String username,@RequestParam String email, 
            @RequestParam String password,@RequestParam String password2, ModelMap modelo, HttpSession session) {

        try {
            Usuario updatedUser = usuarioServicio.actualizar(archivo, id, username, email, password, password2);
            session.setAttribute("usuariosession", updatedUser);
            modelo.put("exito", "Usuario actualizado correctamente!");

            return "inicio.html";
        } catch (MyException ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", username);
            modelo.put("email", email);

            return "usuario_modificar.html";
        }

    }
}
