/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author furai
 */
public class ControladorClienJPA implements Serializable{
    
    public ControladorClienJPA(EntityManagerFactory emf){
        this.emf= emf;
    }
    
}
