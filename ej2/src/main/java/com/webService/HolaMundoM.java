/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webService;

/**
 *
 * @author diela
 */

// COMENTARIO IMPORTANTE: En java dependencies esta el JDK 22 pero haciendo click en el project y eligiendo 
// que se compile con JDK 1.8 funciona
import javax.xml.ws.Endpoint;
public class HolaMundoM {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/HolaMundoService", new HolaMundoService());
        System.out.println("Servicio web HolaMundoService publicado en http://localhost:8080/HolaMundoService?wsdl");
    }
}
