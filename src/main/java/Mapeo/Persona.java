/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapeo;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Antonio
 */
@Entity
@Table(name="persona")
public class Persona {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private int id_persona;
    
    @Column(name="nombrepersona")
    private String nombre_persona;
    
    @Column(name="nombrecarrera")
    private String nombre_carrera;
    
    @Column (name="fecha")
    private String fecha_nac;
    
    @Column (name="correo")
    private String e_mail;
    
    @Column (name="contrasena")
    private String password;
    
    
    /**
     * 
     *Creamos los metodos get y set de Persona
     * 
     */
    
    public int getIdPersona(){
        return id_persona;
    }
    
    public void setIdPersona(int id){
        this.id_persona = id;
    }
    
    public String getNombre(){
        return nombre_persona;
    }
    
    public void setNombre(String name){
        this.nombre_persona = name;
    }
    
    public String getCarrera(){
        return nombre_carrera;
    }
    
    public void setCarrera(String carrera){
        this.nombre_carrera = carrera;
    }
    
    public String getFecha(){
        return fecha_nac;
    }
    
    public void setFecha(String fecha){
        this.fecha_nac = fecha;
    }
    
    public String getCorreo(){
        return e_mail;
    }
    
    public void setCorreo(String correo){
        this.e_mail = correo;
    }
    
    public String getContrasena(){
        return password;
    }
    
    public void setContrasena(String contrasena){
        this.password = contrasena;
    }
    
}
