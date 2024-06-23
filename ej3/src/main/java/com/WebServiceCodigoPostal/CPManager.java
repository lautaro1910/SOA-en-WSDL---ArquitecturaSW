/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.WebServiceCodigoPostal;

/**
 *
 * @author diela
 */

import javax.xml.ws.Endpoint;

public class CPManager {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/CodigoPostalService", new CodigoPostalService());
        System.out.println("Servicio publicado en http://localhost:8080/CodigoPostalService?wsdl");
    }
}