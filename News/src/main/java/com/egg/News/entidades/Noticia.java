/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.News.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author sofia
 */
@Entity
public class Noticia implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid") /// primer estrategia para autogenerar el id 
    @GenericGenerator(name = "uuid", strategy = "uuid2") //segunda estrategia
    private String id;
    private String titulo;
    private String cuerpo;
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    
    private boolean estaActivo = true;

    /**
     * Get the value of estaActivo
     *
     * @return the value of estaActivo
     */
    public boolean isEstaActivo() {
        return estaActivo;
    }

    /**
     * Set the value of estaActivo
     *
     * @param estaActivo new value of estaActivo
     */
    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }


    public Noticia() {
    }

    public Noticia(String id, String titulo, String cuerpo) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fechaAlta = fechaAlta;
    }

 

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }
    

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Noticia)) {
            return false;
        }
        Noticia other = (Noticia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Datos de la noticia[ id=" + id + "Título: "+ titulo +", cuerpo: "+ cuerpo+ " ]";
    }
    
}
