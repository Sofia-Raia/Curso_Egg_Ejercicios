/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 *
 * @author sofia
 */
@Service
public class BusinessService {
    @Autowired
    private JavaMailSender mailSender;
    public void sendEmail(String from,String to){
        //usar mailSender acá... nose si va aca.
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject("Asunto del correo");
        message.setText("Este es un correo automático!");
        mailSender.send(message);//método Send(envio), propio de Java Mail Sender.
    }
}
