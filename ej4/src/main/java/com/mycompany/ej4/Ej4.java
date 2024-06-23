/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej4;

import javax.xml.ws.Endpoint;

/**
 *
 * @author diela
 */

//publicador del service web

public class Ej4 {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/ipInformacion", new IPinformacionImpl());
    }
}
