/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ej4;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author diela
 */
@WebService
public interface IPinformacion {
    @WebMethod
    public void obtenerInfo(String ip);
}
