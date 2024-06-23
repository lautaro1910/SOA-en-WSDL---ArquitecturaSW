/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webService;

/**
 *
 * @author diela
 */

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "HolaMundoService")
public class HolaMundoService {

    @WebMethod(operationName = "holaMundo")
    public String holaMundo(@WebParam(name = "nombre") String nombre) {
        return "Hola, " + nombre + "!";
    }
}
