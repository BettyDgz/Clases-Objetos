/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datospersona;

import Clases.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author betty
 */
public class DatosPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Objetos Persona
          Datos persona = new Datos();
          // Introducir los Datos de la persona
          String elNombre = JOptionPane.showInputDialog("Nombre de la Persona");
          String elCorreo = JOptionPane.showInputDialog("El Correo Electronico");
          String elTelefono = JOptionPane.showInputDialog("El Telefono Celular");
          
          persona.setNombrePersona(elNombre);
          persona.setCorreoElectronico(elCorreo);
          persona.setTelefonoCelular(elTelefono);
          
          String datosCompletos = "El Nombre de la Persona es: " + persona.getNombrePersona() + "\n";
          datosCompletos += "Su Correo Electronico es: " + persona.getCorreoElectronico() + "\n";
          datosCompletos += "Y Su número de Celular es: " + persona.getTelefonoCelular();
          // Desplegar los datos
          JOptionPane.showMessageDialog(null, datosCompletos);
     }
    }