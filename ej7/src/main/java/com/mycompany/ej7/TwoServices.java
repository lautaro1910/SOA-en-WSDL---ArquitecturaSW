/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ej7;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author diela
 */
@WebService
public interface TwoServices {
    @WebMethod
    public double operacion(int opcion, int valor1, int valor2);
    @WebMethod
    public String getInfoPais(String ip);
}
