/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.camara;

import javax.xml.ws.Endpoint;

/**
 *
 * @author diela
 */
public class Camara {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:3000/stream", new CamaraData());
    }
}
