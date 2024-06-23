/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej7;

import javax.xml.ws.Endpoint;


/**
 *
 * @author diela
 */
// publisher 
public class Ej7 {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/2services", new TwoServicesImpl());
    }
}
