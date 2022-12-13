/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.servicios;

import com.egg.News.entidades.Imagen;
import com.egg.News.entidades.Usuario;
import com.egg.News.enumeraciones.Rol;
import com.egg.News.excepciones.MyException;
import com.egg.News.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author sofia
 */
@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private ImagenServicio imagenServicio;

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String email, String password, String password2) throws MyException {

        validar(nombre, email, password, password2);

        Usuario usuario = new Usuario();

        usuario.setUsername(nombre);
        usuario.setEmail(email);

        usuario.setPassword(new BCryptPasswordEncoder().encode(password));

        usuario.setRol(Rol.USER);
        if (archivo != null) {
            Imagen imagen = imagenServicio.guardar(archivo);
            usuario.setImagen(imagen);
        }

        usuarioRepositorio.save(usuario);
    }

    @Transactional
    public Usuario actualizar(MultipartFile archivo, String idUsuario, String username, String email, String password, String password2) throws MyException {

        validar(username, email, password, password2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setUsername(username);
            usuario.setEmail(email);

            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuario.setRol(Rol.USER);

            String idImagen = null;

            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
            }

            Imagen imagen = imagenServicio.actualizar(archivo, idImagen);

            usuario.setImagen(imagen);

            return usuarioRepositorio.save(usuario);
        }
        return null;
    }

    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }

    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {

        List<Usuario> usuarios = new ArrayList();

        usuarios = usuarioRepositorio.findAll();

        return usuarios;
    }

    @Transactional
    public void cambiarRol(String id) {
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            if (usuario.getRol().equals(Rol.USER)) {

                usuario.setRol(Rol.ADMIN);

            } else if (usuario.getRol().equals(Rol.ADMIN)) {
                usuario.setRol(Rol.USER);
            }
        }
    }

    private void validar(String username, String email, String password, String password2) throws MyException {
        if (username.isEmpty() || username == null) {
            throw new MyException("El nombre no puede ser nulo o estar vacio.");
        }
        if (email.isEmpty() || email == null) {
            throw new MyException("El email no puede ser nulo o estar vacio.");
        }
        if (password.isEmpty() || password == null || password.length() <= 5) {
            throw new MyException("La contraseña no puede ser nula, estar vacia o tener mas de 5 digitos.");
        }
        if (!password.equals(password2)) {
            throw new MyException("Las contraseñas ingresadas deben ser iguales.");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //Instanciamos un objeto del tipo Usuario, haciendo uso del método buscarPorEmail(email) de la clase usuarioRepositorio.
        Usuario user = usuarioRepositorio.buscarPorEmail(email);
        //Verificamos que el objeto Usuario no esté nulo.
        if (user != null) {
        //Otorgaremos PERMISOS según el ROL que tenga cada usuario. Si el usuario existe, es decir, si
        //la búsqueda por mail del repositorio nos retorna un Usuario, vamos a crear una lista de permisos
        //llamada permissions.
            List<GrantedAuthority> permissions = new ArrayList<>();
        //Creamos un objeto GrantedAuthority 'p' y concatenamos la palabra ROLE_ + el rol del usuario.
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + user.getRol().toString());
            permissions.add(p);
        //Utilizamos los atributos que nos otorga el pedido al servlet, para poder guardar la información de nuestra HttpSession.
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuariosession", user);
        //por último, retornamos un User con su email, contraseña y permisos!
            return new User(user.getEmail(), user.getPassword(), permissions);
        }
        return null;
    }

}
