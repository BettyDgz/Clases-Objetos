/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author betty
 */
public class Datos {
    private String nombrePersona;
     private String correoElectronico;
     private String telefonoCelular;

     // Constructores
     public Datos (String nombrePersona, String correoElectronico, String telefonoCelular) {
          this.nombrePersona = nombrePersona;
          this.correoElectronico = correoElectronico;
          this.telefonoCelular = telefonoCelular;
     }
     // Simple
     public Datos () {
          
     }

     public String getNombrePersona() {
          return nombrePersona;
     }

     public void setNombrePersona(String nombrePersona) {
          this.nombrePersona = nombrePersona;
     }

     public String getCorreoElectronico() {
          return correoElectronico;
     }

     public void setCorreoElectronico(String correoElectronico) {
          this.correoElectronico = correoElectronico;
     }

     public String getTelefonoCelular() {
          return telefonoCelular;
     }

     public void setTelefonoCelular(String telefonoCelular) {
          this.telefonoCelular = telefonoCelular;
     }
      
}