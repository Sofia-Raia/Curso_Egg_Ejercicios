/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;

/**
 *
 * @author sofia
 */
@Controller
public class AppController {
    @Autowired
        private JavaMailSender mailSender;
        public void sendEmail(){
            //use mailSender here... nose si va aca
        String from = "sender@gmail.com";//dirección de correo que hace el envío.
        String to = "recipient@gmail.com";//dirección de correo que recibe el mail.
        }
}
